package cards.server.datamodel;

import java.util.List;

import cards.basic.Card;

public class PlayerFull { 
	
	private List<Card> currentCards;
	
	private boolean isAlly;
	
	private int teamPoints;

	public PlayerFull() {
		super();
	}

	public PlayerFull(String sessionID, List<Card> currentCards, boolean isAlly, int teamPoints) {
		super();
		this.setCurrentCards(currentCards);
		this.setAlly(isAlly);
		this.setTeamPoints(teamPoints);
	}

	public List<Card> getCurrentCards() {
		return currentCards;
	}

	public void setCurrentCards(List<Card> currentCards) {
		this.currentCards = currentCards;
	}

	public boolean isAlly() {
		return isAlly;
	}

	public void setAlly(boolean isAlly) {
		this.isAlly = isAlly;
	}

	public int getTeamPoints() {
		return teamPoints;
	}

	public void setTeamPoints(int teamPoints) {
		this.teamPoints = teamPoints;
	}
	
	
}
