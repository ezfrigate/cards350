import { Component, OnInit, Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs/Observable'
import 'rxjs/add/operator/map'
import { Card } from './datamodel';

@Component({
  selector: 'app-first-page',
  templateUrl: './first-page.component.html',
  styleUrls: ['./first-page.component.css']
})

@Injectable()
export class FirstPageComponent implements OnInit {
  private deck: Card[]
  constructor(private httpClient: HttpClient) { }

  ngOnInit() {
    console.log("hi");
    this.httpClient.get('http://localhost:8680/cards/shuffle').subscribe((bunch : Card[]) =>{
      this.deck = bunch;
      console.dir(this.deck);
    });
    console.log("check");
  }
}
