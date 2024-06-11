import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { LoginFormComponent } from './login-form/login-form.component';
import { RegisterFormComponent } from './register-form/register-form.component';
import { HomeComponent } from './home/home.component';
import { AddItemComponent } from './add-item/add-item.component';
import { UserConfigrationComponent } from './user-configration/user-configration.component';

const routes: Routes = [
  { path: '', component: HomeComponent },
  { path: 'login', component: LoginFormComponent },
  { path: 'register', component: RegisterFormComponent },
  { path: 'add-item', component: AddItemComponent },
  { path: 'user-configuration', component: UserConfigrationComponent },
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
