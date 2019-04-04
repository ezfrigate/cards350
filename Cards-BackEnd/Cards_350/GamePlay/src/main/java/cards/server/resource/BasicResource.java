package cards.server.resource;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
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

@RestController
public class BasicResource {
	@Autowired
	BasicGameActionService basicGameActionService;
	
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
		return basicGameActionService.currentState();
	}
	
	@PostMapping(value = "/updateTable", consumes= {MediaType.APPLICATION_JSON_VALUE})
	public void updateTable(@RequestBody UserPlayDataModel currentState) {
		basicGameActionService.updateTable(currentState);
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
