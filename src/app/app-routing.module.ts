import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { HomeComponent } from './home/home.component';
import { OrdersComponent } from './orders/orders.component';
import { AboutComponent } from './about/about.component';
import { ServiceComponent } from './service/service.component';
import { MakeorderComponent } from './makeorder/makeorder.component';
import { PaymentComponent } from './payment/payment.component';
import { LoginComponent } from './login/login.component';

const routes: Routes = [
  {path:'',redirectTo: 'home',pathMatch: 'full'},
  {path:'home',component:HomeComponent},
  {path:'orders',component:OrdersComponent},
  {path:'about',component:AboutComponent},
  {path:'service',component:ServiceComponent},
  {path:'makeorder',component:MakeorderComponent},
  {path:'payment',component:PaymentComponent},
  {path:'login',component:LoginComponent}
  
  
];


@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
