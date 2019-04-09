import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { HttpModule } from '@angular/http';
import { HttpClientModule } from '@angular/common/http'

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { GameHomeComponent } from './game-home/game-home.component';
import { FirstPageComponent } from './first-page/first-page.component';
import { CardFlipComponent } from './card-flip/card-flip.component';
import { StartPageComponent } from './start-page/start-page.component';
import { GameTableComponent } from './game-table/game-table.component';
import { JoinGameComponent } from './join-game/join-game.component';
import { CookieService } from 'ngx-cookie-service';

@NgModule({
  declarations: [
    AppComponent,
    GameHomeComponent,
    FirstPageComponent,
    CardFlipComponent,
    StartPageComponent,
    GameTableComponent,
    JoinGameComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpModule,
    HttpClientModule,
  ],
  providers: [ CookieService ],
  bootstrap: [AppComponent]
})
export class AppModule { }
