export class User {
    inGameNick : string
    sessionID : string 
    constructor(values: Object = {}) {
        Object.assign(this, values);
      }
}

export class Token {
    tokenValue : string;
}

export class NumberOfPlayers{
    num : number;
}