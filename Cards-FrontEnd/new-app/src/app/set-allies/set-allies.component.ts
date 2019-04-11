import { Component, OnInit, Input } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-set-allies',
  templateUrl: './set-allies.component.html',
  styleUrls: ['./set-allies.component.css']
})
export class SetAlliesComponent implements OnInit {

  @Input('fr') firstRank : string
  @Input('fs') firstSuit : string
  @Input('sr') secondRank : string
  @Input('ss') secondSuit : string
  cards : string[4]
  constructor(private httpClient : HttpClient) { }

  ngOnInit() {
    //this.setFS()
  }


  setFR(value : string){
    this.firstRank = value
  }

  setFS(value : string){
    this.firstSuit = value
  }

  setSR(value : string){
    this.secondRank = value
  }

  setSS(value : string){
    this.secondSuit = value
  }

  confirmAllies(){
    let cards : string[] = [this.firstRank, this.firstSuit, this.secondRank, this.secondSuit]
    this.httpClient.post('http://localhost:8680/cards/setAllies', cards).subscribe((res : String)=>{
      console.log(res)
    })
  }
  
}
