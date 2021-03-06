package cards.server.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import cards.basic.Card;
import cards.basic.Deck;
import cards.basic.Hand;
import cards.server.datamodel.ResponseDataModel;
import cards.server.datamodel.UserPlayDataModel;
import cards.server.service.BasicGameActionService;
@CrossOrigin()
@RestController
public class BasicResource {
	@Autowired
	BasicGameActionService basicGameActionService;
	
	@Autowired
	TestObjects testObjects;
	
	@GetMapping(value = "/shuffle",produces= {MediaType.APPLICATION_JSON_VALUE})
	public List<Card> shuffleDeck() {
		Deck deck = basicGameActionService.shuffleDeck();
		return deck.getAllCards();
	}
	
	@GetMapping(value = "/dealHands",produces= {MediaType.APPLICATION_JSON_VALUE})
	public List<Hand> dealHands() {
		return basicGameActionService.deal();		
	}

	@GetMapping(value = "/currentState", produces= {MediaType.APPLICATION_JSON_VALUE})
	public ResponseDataModel currentState() {
		/*
		 * 
		 * please add "isYourTurn" flag in the model which will enabled only for the current user
		 */
		return testObjects.dummyResponseModel(); //test code
		//return basicGameActionService.currentState(); //this is real line
	}
	
	@PostMapping(value = "/updateTable", consumes= {MediaType.APPLICATION_JSON_VALUE}, produces = {MediaType.APPLICATION_JSON_VALUE})
	public void updateTable(@RequestBody UserPlayDataModel currentState) {
		basicGameActionService.updateTable(currentState);
		System.out.println(currentState.getSessionID());
		System.out.println("object Received");
		System.out.println(currentState.getCardPlayed().getSuit().getSuitString());
		System.out.println(currentState.getCardPlayed().getRank().getRankSymbol());
		//add logger : "user x played this card"
	}
	
	@PostMapping(value = "/openTrump", consumes= {MediaType.APPLICATION_JSON_VALUE})
	public void openTrump(@RequestBody String sessionID) {
		basicGameActionService.openTrump(sessionID);
	}
	
	@GetMapping(value = "/startGame")
	public void startGame() {
		basicGameActionService.startGame();
	}
}
