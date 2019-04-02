import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { GameHomeComponent } from './game-home/game-home.component';
import { FirstPageComponent } from './first-page/first-page.component';
import { CardFlipComponent} from './card-flip/card-flip.component';

const routes: Routes = [
  {path: 'game-home', component: GameHomeComponent},
  {path: 'first-page', component: FirstPageComponent},
  {path: 'card-flip', component: CardFlipComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
