import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { HttpModule } from '@angular/http';
import { HttpClientModule } from '@angular/common/http'

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { CardFlipComponent } from './card-flip/card-flip.component';
import { GameTableComponent } from './game-table/game-table.component';
import { JoinGameComponent } from './join-game/join-game.component';
import { CookieService } from 'ngx-cookie-service';
import { SetAlliesComponent } from './set-allies/set-allies.component';

@NgModule({
  declarations: [
    AppComponent,
    CardFlipComponent,
    GameTableComponent,
    JoinGameComponent,
    SetAlliesComponent
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
