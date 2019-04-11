package cards.server.service;

import cards.server.datamodel.BiddingUser;

public interface BiddingService {

	BiddingUser getcurrentBid();

	void setNewBid(BiddingUser biddingUser);

	void setAllies(String[] cards);

}
