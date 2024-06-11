import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { AuthInterceptor } from './auth.interceptor';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { LoginFormComponent } from './login-form/login-form.component';
import { HTTP_INTERCEPTORS, HttpClientModule } from "@angular/common/http";
import { RegisterFormComponent } from './register-form/register-form.component';
import { HomeComponent } from './home/home.component';
import { FormsModule } from '@angular/forms';
import { AddItemComponent } from './add-item/add-item.component';
import { AddCpuComponent } from './add-item/add-cpu/add-cpu.component';
import { AddCpuCoolerComponent } from './add-item/add-cpu-cooler/add-cpu-cooler.component';
import { AddGraphicsCardComponent } from './add-item/add-graphics-card/add-graphics-card.component';
import { AddHddComponent } from './add-item/add-hdd/add-hdd.component';
import { AddMotherboardComponent } from './add-item/add-motherboard/add-motherboard.component';
import { AddPowerSupplyComponent } from './add-item/add-power-supply/add-power-supply.component';
import { AddRamComponent } from './add-item/add-ram/add-ram.component';
import { AddSsdComponent } from './add-item/add-ssd/add-ssd.component';
import { AddPcCaseComponent } from './add-item/add-case/add-case.component';
@NgModule({
  declarations: [
    AppComponent,
    LoginFormComponent,
    RegisterFormComponent,
    HomeComponent,
    AddItemComponent,
    AddCpuComponent,
    AddCpuCoolerComponent,
    AddGraphicsCardComponent,
    AddHddComponent,
    AddMotherboardComponent,
    AddPowerSupplyComponent,
    AddRamComponent,
    AddSsdComponent,
    AddPcCaseComponent,
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule 
  ],
  providers: [{ provide: HTTP_INTERCEPTORS, useClass: AuthInterceptor, multi: true }],
  bootstrap: [AppComponent]
})
export class AppModule { }
