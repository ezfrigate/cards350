import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { CardFlipComponent } from './card-flip/card-flip.component';
import { GameTableComponent } from './game-table/game-table.component';
import { JoinGameComponent } from './join-game/join-game.component';
import { SetAlliesComponent } from './set-allies/set-allies.component';

const routes: Routes = [
  {path: 'card-flip', component: CardFlipComponent},
  {path: 'game-table', component: GameTableComponent},
  {path: 'join-game', component: JoinGameComponent},
  {path: 'set-ally', component: SetAlliesComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
