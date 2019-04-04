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

export class Token {
    tokenValue : String;
}