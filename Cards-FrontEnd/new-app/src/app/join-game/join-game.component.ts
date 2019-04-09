import { Component, OnInit, Output, Input } from '@angular/core';
import { CookieService } from 'ngx-cookie-service';
import { HttpClient } from '@angular/common/http';
import { User, Token, NumberOfPlayers } from './JoinGameDataModel';

@Component({
  selector: 'app-join-game',
  templateUrl: './join-game.component.html',
  styleUrls: ['./join-game.component.css']
})
export class JoinGameComponent implements OnInit {
  user = new User()
  @Output('ign') ign : string
  @Input('playersJoined') playersJoined : string
  userJoinedFlag : boolean
  constructor( private cookieService: CookieService, private httpClient : HttpClient) {}

  ngOnInit() {
    this.userJoinedFlag = false
    if(!this.cookieService.check('sessionID')){
      this.httpClient.get('http://localhost:8680/cards/startSession').subscribe((res : Token)=>{
        this.cookieService.set('sessionID', res.tokenValue)
      });
    }
  this.refreshPage()
  }

  joinGame(){

    this.user.sessionID = this.cookieService.get('sessionID')
    this.user.inGameNick = "UserX"
    this.httpClient.post('http://localhost:8680/cards/addPlayer', this.user).subscribe((res : string)=>{

    })
    this.userJoinedFlag = true
  }

  isPlayerJoined(){
    return this.userJoinedFlag
  }
  setIGN() {
    this.cookieService.set('IGN' , '')
  }

  setPlayersJoined(){
    this.httpClient.get('http://localhost:8680/cards/numberOfPlayers').subscribe((res : NumberOfPlayers)=>{
      let num =  res.num
      this.playersJoined = num.toString()
    })
  }

  refreshPage(){
    this.setPlayersJoined()
    setTimeout(() => {
      this.refreshPage()
    }, 1000);
  }
}