package cards.server.datamodel;

import cards.basic.Card;

public class UserPlayDataModel {
	private String sessionID;
	
	private Card cardPlayed;
	
	public UserPlayDataModel() {
		super();
	}

	public UserPlayDataModel(String sessionID, Card cardPlayed) {
		super();
		this.sessionID = sessionID;
		this.cardPlayed = cardPlayed;
	}

	public String getSessionID() {
		return sessionID;
	}

	public void setSessionID(String sessionID) {
		this.sessionID = sessionID;
	}

	public Card getCardPlayed() {
		return cardPlayed;
	}

	public void setCardPlayed(Card cardPlayed) {
		this.cardPlayed = cardPlayed;
	}
}
