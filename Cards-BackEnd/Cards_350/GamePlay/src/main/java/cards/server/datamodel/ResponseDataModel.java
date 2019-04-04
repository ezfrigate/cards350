package cards.server.datamodel;

import java.util.List;

import cards.basic.Card;
import cards.basic.Hand;
import cards.basic.Suit;

public class ResponseDataModel {
	private String sessionID;
	
	private boolean trumpDisplay;
	
	private Suit trumpSuit;
	
	private int numberOfCards;
	
	private List<Card> cardsAlive;
	
	private List<Card> cardsPlayable;
	
	private List<Card> cardPool;
	
	private boolean isAlly;
	
	private Hand lastHand;
	
	public ResponseDataModel() {
		super();
	}

	public ResponseDataModel(String sessionID, boolean trumpDisplay, Suit trumpSuit, int numberOfCards,
			List<Card> cardsAlive, List<Card> cardsPlayable, List<Card> cardPool, boolean isAlly, Hand lastHand) {
		super();
		this.setSessionID(sessionID);
		this.setTrumpDisplay(trumpDisplay);
		this.setTrumpSuit(trumpSuit);
		this.setNumberOfCards(numberOfCards);
		this.setCardsAlive(cardsAlive);
		this.setCardsPlayable(cardsPlayable);
		this.setCardPool(cardPool);
		this.setAlly(isAlly);
		this.setLastHand(lastHand);
	}

	public String getSessionID() {
		return sessionID;
	}

	public void setSessionID(String sessionID) {
		this.sessionID = sessionID;
	}

	public boolean isTrumpDisplay() {
		return trumpDisplay;
	}

	public void setTrumpDisplay(boolean trumpDisplay) {
		this.trumpDisplay = trumpDisplay;
	}

	public Suit getTrumpSuit() {
		return trumpSuit;
	}

	public void setTrumpSuit(Suit trumpSuit) {
		this.trumpSuit = trumpSuit;
	}

	public int getNumberOfCards() {
		return numberOfCards;
	}

	public void setNumberOfCards(int numberOfCards) {
		this.numberOfCards = numberOfCards;
	}

	public List<Card> getCardsAlive() {
		return cardsAlive;
	}

	public void setCardsAlive(List<Card> cardsAlive) {
		this.cardsAlive = cardsAlive;
	}

	public List<Card> getCardsPlayable() {
		return cardsPlayable;
	}

	public void setCardsPlayable(List<Card> cardsPlayable) {
		this.cardsPlayable = cardsPlayable;
	}

	public List<Card> getCardPool() {
		return cardPool;
	}

	public void setCardPool(List<Card> cardPool) {
		this.cardPool = cardPool;
	}

	public boolean isAlly() {
		return isAlly;
	}

	public void setAlly(boolean isAlly) {
		this.isAlly = isAlly;
	}

	public Hand getLastHand() {
		return lastHand;
	}

	public void setLastHand(Hand lastHand) {
		this.lastHand = lastHand;
	}
	
	
}
