import { Component, OnInit, Input } from '@angular/core';
import { ResponseDataModel, UserPlayDataModel } from './GameTableDataModel';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-game-table',
  templateUrl: './game-table.component.html',
  styleUrls: ['./game-table.component.css']
})
export class GameTableComponent implements OnInit {
  @Input('rdm') rdm : ResponseDataModel;
  sessionID: string;
  userPlayDataModel : UserPlayDataModel;
  constructor(private httpClient : HttpClient) { }

  ngOnInit(){
    this.refreshPage()
  }

  refreshPage(){
    this.httpClient.get('http://localhost:8680/cards/currentState').subscribe((res : ResponseDataModel)=>{
      this.rdm = res;
      console.log('hi')
      setTimeout(() => {
        this.refreshPage()
      }, 10000000);

    });
  }

  playThisCard(i : number) {
    this.sessionID = "hardcoded"
      let userPlayDataModel =  new UserPlayDataModel()
      userPlayDataModel.cardPlayed = this.rdm.cardsAlive[i]
      userPlayDataModel.sessionID = this.sessionID;
  
      this.httpClient.post('http://localhost:8680/cards/updateTable', userPlayDataModel).subscribe((res : String)=>{
        console.log(res)
      })
  }
}
