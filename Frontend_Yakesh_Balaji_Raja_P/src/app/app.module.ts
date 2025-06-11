import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { DashboardComponent } from './components/dashboard/dashboard.component';
import { AddplayerComponent } from './components/addplayer/addplayer.component';
import { ViewComponent } from './components/view/view.component';
import { UpdateplayerComponent } from './components/updateplayer/updateplayer.component';
import {HttpClientModule} from '@angular/common/http';
import {FormsModule} from '@angular/forms';
@NgModule({
  declarations: [
    AppComponent,
    DashboardComponent,
    AddplayerComponent,
    ViewComponent,
    UpdateplayerComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
