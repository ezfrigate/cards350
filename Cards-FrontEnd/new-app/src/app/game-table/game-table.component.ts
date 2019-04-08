import { Component, OnInit, Input } from '@angular/core';
import { ResponseDataModel } from './GameTableDataModel';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-game-table',
  templateUrl: './game-table.component.html',
  styleUrls: ['./game-table.component.css']
})
export class GameTableComponent implements OnInit {
  @Input('rdm') rdm : ResponseDataModel;

  constructor(private httpClient : HttpClient) { }

  ngOnInit() {
    this.httpClient.get('http://localhost:8680/cards/currentState').subscribe((res : ResponseDataModel)=>{
      this.rdm = res;
      console.log(this.rdm)
    });


  }

  refreshPage(){
    this.httpClient.get('http://localhost:8680/cards/currentState').subscribe((res : ResponseDataModel)=>{
      this.rdm = res;
    });

  }

}
