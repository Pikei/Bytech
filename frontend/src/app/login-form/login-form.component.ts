import { Component } from '@angular/core';
import { AuthService } from '../auth.service';

@Component({
  selector: 'login-form',
  templateUrl: './login-form.component.html',
  styleUrls: ['./login-form.component.css']
})
export class LoginFormComponent {

  credentials = { username: '', password: '' };

  constructor(private authService: AuthService) {}

  login(): void {
    this.authService.login(this.credentials).subscribe(
      response => {
        // Logowanie udane, obsługiwane w AuthService
      },
      error => {
        // Obsługa błędów logowania
        console.error('Login error', error);
      }
    );
  }
}
