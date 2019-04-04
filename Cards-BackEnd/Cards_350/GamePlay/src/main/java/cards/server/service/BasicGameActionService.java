package cards.server.service;

import java.util.ArrayList;

import cards.basic.Deck;
import cards.basic.Hand;
import cards.server.datamodel.ResponseDataModel;
import cards.server.datamodel.UserPlayDataModel;

public interface BasicGameActionService {

	public Deck shuffleDeck();

	public ArrayList<Hand> deal();

	public ResponseDataModel currentState();

	public void updateTable(UserPlayDataModel currentState);

	public void openTrump(String sessionID);

	public void startGame();

}
