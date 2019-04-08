package cards.server.resource;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import cards.basic.Deck;
import cards.basic.Hand;
import cards.basic.Suit;
import cards.server.datamodel.ResponseDataModel;

@Service
public class TestObjects {
	private ResponseDataModel responseDataModel;
	
	public ResponseDataModel dummyResponseModel() {
		Deck deck = new Deck();
		deck.shuffleDeck();
		
		ResponseDataModel rdm = new ResponseDataModel();
		rdm.setSessionID("ID");
		
		rdm.setTrumpDisplay(true);
		
		rdm.setCardPool(new ArrayList<>());
		rdm.getCardPool().add(deck.popTopCard());
		rdm.getCardPool().add(deck.popTopCard());
		rdm.getCardPool().add(deck.popTopCard());
		rdm.getCardPool().add(deck.popTopCard());
		rdm.getCardPool().add(deck.popTopCard());
		
		rdm.setCardsAlive(new ArrayList<>());
		rdm.getCardsAlive().add(deck.popTopCard());
		rdm.getCardsAlive().add(deck.popTopCard());
		rdm.getCardsAlive().add(deck.popTopCard());
		
		rdm.setCardsPlayable(new ArrayList<>());
		rdm.getCardsPlayable().add(rdm.getCardsAlive().get(0));
		
		rdm.setAlly(true);
		
		rdm.setLastHand(new Hand(new ArrayList<>(), 100));
		
		rdm.getLastHand().getMyCards().add(deck.popTopCard());
		rdm.getLastHand().getMyCards().add(deck.popTopCard());
		rdm.getLastHand().getMyCards().add(deck.popTopCard());
		rdm.getLastHand().getMyCards().add(deck.popTopCard());
		rdm.getLastHand().getMyCards().add(deck.popTopCard());
		rdm.getLastHand().getMyCards().add(deck.popTopCard());
		
		rdm.setTrumpSuit(Suit.HEARTS);
		return rdm;
	}

	public ResponseDataModel getResponseDataModel() {
		return responseDataModel;
	}

	public void setResponseDataModel(ResponseDataModel responseDataModel) {
		this.responseDataModel = responseDataModel;
	}
}
