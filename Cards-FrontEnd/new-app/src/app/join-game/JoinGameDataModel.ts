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

export class Hero {

    constructor(
      public id: number,
      public name: string,
      public power: string,
      public alterEgo?: string
    ) {  }
  
  }