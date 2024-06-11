import { Component } from '@angular/core';
import { AuthService } from '../auth.service';

@Component({
  selector: 'register-form',
  templateUrl: './register-form.component.html',
  styleUrls: ['./register-form.component.css']
})
export class RegisterFormComponent {

  user = { email: '', username: '', firstName: '', lastName: '', password: '', role: 'CUSTOMER' };

  constructor(private authService: AuthService) {}

  validate(): void {
    if (this.user.password !== this.confirmPassword) {
      alert("Passwords do not match!");
      return;
    }
    this.register();
  }

  register(): void {
    this.authService.register(this.user).subscribe(
      response => {
        // Rejestracja udana, przekieruj do logowania lub automatyczne logowanie
        console.log('Registration successful', response);
        this.authService.login({ username: this.user.username, password: this.user.password }).subscribe();
      },
      error => {
        // Obsługa błędów rejestracji
        console.error('Registration error', error);
      }
    );
  }

  confirmPassword: string = '';
}
