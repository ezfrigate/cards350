export class ResponseDataModel{
    sessionID : String
	trumpDisplay : Boolean
	trumpSuit : Suit
	numberOfCards : number
    cardsAlive : Card[]
	cardsPlayable : Card[]
	cardPool : Card[]
	isAlly : Boolean
	lastHand : Hand
	
	constructor(values: Object = {}) {
        Object.assign(this, values);
      }
}

export class Card {
    suit : string;
    rank : string;
    points : number;
    cardString : string;

    constructor(values: Object = {}) {
        Object.assign(this, values);
      }
}

export class Hand {
    myCards : Card[];
}

export class Suit {
	suitString : string;

	constructor(values: Object = {}) {
        Object.assign(this, values);
      }
}