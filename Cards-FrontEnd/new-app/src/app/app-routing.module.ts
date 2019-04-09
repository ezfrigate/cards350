import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { GameHomeComponent } from './game-home/game-home.component';
import { FirstPageComponent } from './first-page/first-page.component';
import { CardFlipComponent } from './card-flip/card-flip.component';
import { StartPageComponent } from './start-page/start-page.component';
import { GameTableComponent } from './game-table/game-table.component';
import { JoinGameComponent } from './join-game/join-game.component';

const routes: Routes = [
  {path: 'game-home', component: GameHomeComponent},
  {path: 'first-page', component: FirstPageComponent},
  {path: 'card-flip', component: CardFlipComponent},
  {path: 'start-page', component: StartPageComponent},
  {path: 'game-table', component: GameTableComponent},
  {path: 'join-game', component: JoinGameComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
