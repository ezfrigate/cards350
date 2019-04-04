import { Component, OnInit, Input, Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Token } from './dataModel'

@Component({
  selector: 'app-start-page',
  templateUrl: './start-page.component.html',
  styleUrls: ['./start-page.component.css']
})

@Injectable()
export class StartPageComponent implements OnInit {

  @Input('joinedPlayers') joinedPlayers : String[];

  token : Token;
  buttonDisabled: boolean = false;

  constructor(private httpClient: HttpClient) { }

  ngOnInit() {

  }
  

  buttonClick(){
    this.httpClient.get('http://localhost:8680/cards/startSession').subscribe((res : Token) =>{
      this.token = res;
      console.log(this.token);
      if(this.token.tokenValue == "Already"){
        console.log("stop")
      } else {
        this.buttonDisabled = true;
      }
    });
  }

}
