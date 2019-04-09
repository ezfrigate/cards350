package cards.server.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cards.basic.Dealer;
import cards.basic.Deck;
import cards.basic.Hand;
import cards.server.datamodel.ResponseDataModel;
import cards.server.datamodel.User;
import cards.server.datamodel.UserPlayDataModel;
import cards.server.service.BasicGameActionService;
import cards.server.service.SessionResourceService;

@Service
public class BasicGameActionServiceImpl implements BasicGameActionService{
	@Autowired
	private SessionResourceService sessionResourceService;
	
	@Override
	public Deck shuffleDeck() {
		Deck deck = new Deck();
		deck.shuffleDeck();
		return deck;
	}
	
	@Override
	public ArrayList<Hand> deal(){
		Dealer dealer = new Dealer();
		return dealer.getHands();
	}
	
	@Override
	public ResponseDataModel currentState() {
		//build your response here
		return null;
	}

	@Override
	public void updateTable(UserPlayDataModel currentState) {
		//update table here
	}
	
	@Override
	public void openTrump(String sessionID) {
		//open trump Logic here
	}

	@Override
	public void startGame() {
		List<User> users = sessionResourceService.getUsers();
		//build shuffle all the hands to the users
		
	}
}
