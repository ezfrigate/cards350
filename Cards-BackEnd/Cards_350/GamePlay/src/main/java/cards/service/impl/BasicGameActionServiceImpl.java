package cards.service.impl;

import org.springframework.stereotype.Service;

import cards.basic.Deck;
import cards.service.BasicGameActionService;

@Service
public class BasicGameActionServiceImpl implements BasicGameActionService{
	
	@Override
	public Deck shuffleDeck() {
		Deck deck = new Deck();
		deck.shuffleDeck();
		return deck;
	}
}
