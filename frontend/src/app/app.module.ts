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
import { UserConfigrationComponent } from './user-configration/user-configration.component';
import { CpuComponent } from './user-configuration/cpu/cpu.component';
import { CaseComponent } from './user-configuration/case/case.component';
import { CpuCoolerComponent } from './user-configuration/cpu-cooler/cpu-cooler.component';
import { GpuComponent } from './user-configuration/gpu/gpu.component';
import { HddComponent } from './user-configuration/hdd/hdd.component';
import { MotherboardComponent } from './user-configuration/motherboard/motherboard.component';
import { PowerSupplyComponent } from './user-configuration/power-supply/power-supply.component';
import { RamComponent } from './user-configuration/ram/ram.component';
import { SsdComponent } from './user-configuration/ssd/ssd.component';
import { UserConfigurationComponent } from './user-configuration/user-configuration.component';
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
    UserConfigrationComponent,
    CpuComponent,
    CaseComponent,
    CpuCoolerComponent,
    GpuComponent,
    HddComponent,
    MotherboardComponent,
    PowerSupplyComponent,
    RamComponent,
    SsdComponent,
    UserConfigurationComponent,
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
