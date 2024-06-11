import { Component, OnInit } from '@angular/core';
import { AuthService } from '../auth.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {
  goToAddItem(): void {
    this.router.navigate(['/add-item']);
  }
  userProfile: any = {};

  constructor(private authService: AuthService, private router: Router) {}

  ngOnInit(): void {
    this.authService.getProfile().subscribe(
      profile => {
        this.userProfile = profile;
      },
      error => {
        console.error('Error fetching profile', error);
      }
    );
  }
}
