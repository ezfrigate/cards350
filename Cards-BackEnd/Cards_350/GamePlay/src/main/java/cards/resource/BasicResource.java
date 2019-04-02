package cards.resource;

import java.util.List;

import javax.ws.rs.core.Response;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import cards.basic.Card;
import cards.basic.Deck;
import cards.service.BasicGameActionService;

@RestController
public class BasicResource {
	@Autowired
	BasicGameActionService basicGameActionService;
	
	@GetMapping(value = "/shuffle",produces= {MediaType.APPLICATION_JSON_VALUE})
	public List<Card> shuffleDeck() {
		Deck deck = basicGameActionService.shuffleDeck();
		return deck.getAllCards();
	}
}
