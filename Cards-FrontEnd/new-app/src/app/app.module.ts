import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { HttpModule } from '@angular/http';
import { HttpClientModule } from '@angular/common/http'

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { GameHomeComponent } from './game-home/game-home.component';
import { FirstPageComponent } from './first-page/first-page.component';
import { CardFlipComponent } from './card-flip/card-flip.component';

@NgModule({
  declarations: [
    AppComponent,
    GameHomeComponent,
    FirstPageComponent,
    CardFlipComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpModule,
    HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
