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
  gameReadyFlag : boolean
  constructor( private cookieService: CookieService, private httpClient : HttpClient) {}
  

  ngOnInit() {
    this.gameReadyFlag = false
    if(!this.cookieService.check('sessionID')){
      this.userJoinedFlag = false
    } else {
      this.userJoinedFlag =true
    }
  this.refreshPage()
  }

  joinGame(){
    this.user.inGameNick = this.ign
    console.log(this.user.inGameNick)
    if(!this.userJoinedFlag){
      this.httpClient.get('http://localhost:8680/cards/startSession').subscribe((res : Token)=>{
        this.cookieService.set('sessionID', res.tokenValue)
        this.user.sessionID = res.tokenValue
       // this.user.inGameNick = "UserX"
        this.httpClient.post('http://localhost:8680/cards/addPlayer', this.user).subscribe((res : string)=>{
          
        })
        this.userJoinedFlag = true
      });
    }

  }
  isPlayerJoined(){
    return this.userJoinedFlag
  }

  isGameReady(){
    return this.gameReadyFlag
  }
  setIGN() {
    this.cookieService.set('IGN' , '')
  }

  setPlayersJoined(){
    this.httpClient.get('http://localhost:8680/cards/numberOfPlayers').subscribe((res : NumberOfPlayers)=>{
      let num =  res.num
      if(num == 6)this.gameReadyFlag =true
      this.playersJoined = num.toString()
    })
  }

  startGame(){
    //to bidding page
  }
  refreshPage(){
    this.setPlayersJoined()
    setTimeout(() => {
      this.refreshPage()
    }, 1000);
  }

  onSubmit(event : any) {
    this.ign = event.target.value
 }
}