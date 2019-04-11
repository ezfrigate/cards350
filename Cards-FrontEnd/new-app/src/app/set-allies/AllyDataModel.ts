export class User {
    inGameNick : string
    sessionID : string 
    constructor(values: Object = {}) {
        Object.assign(this, values);
      }
}