package cards.server.service.impl;

import org.springframework.stereotype.Service;

import cards.server.datamodel.BiddingUser;
import cards.server.service.BiddingService;
@Service
public class BiddingServiceImpl implements BiddingService{

	@Override
	public BiddingUser getcurrentBid() {
		// return the current highest bid and the player
		return null;
	}
	
	@Override
	public void setNewBid(BiddingUser biddingUser) {
		//you will recieve new bid by user(might be pass or might be higher) set it inside your code
	}

	@Override
	public void setAllies(String[] cards) {
		// string array, first two elements represent 1 card, rank and suit, last 2, second, rank suit set allies inside your code
	}
	
}
