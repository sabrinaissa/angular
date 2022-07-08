import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import {MatToolbarModule} from '@angular/material/toolbar';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { HeaderComponent } from './header/header.component';
import { HomeComponent } from './home/home.component';
import { OrdersComponent } from './orders/orders.component';
import {MatCardModule} from '@angular/material/card';
import {MatChipsModule} from '@angular/material/chips';
import {MatIconModule} from '@angular/material/icon';
import { AboutComponent } from './about/about.component';
import { ServiceComponent } from './service/service.component';
import {MatFormFieldModule} from '@angular/material/form-field';
import { MakeorderComponent } from './makeorder/makeorder.component';
import { PaymentComponent } from './payment/payment.component';
import { LoginComponent } from './login/login.component';



@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    HomeComponent,
    OrdersComponent,
    AboutComponent,
    ServiceComponent,
    MakeorderComponent,
    PaymentComponent,
    LoginComponent,
    
   
    
    
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    BrowserAnimationsModule,
    MatToolbarModule,
    MatCardModule,
    MatChipsModule,
    MatIconModule,
    MatFormFieldModule,

  
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
