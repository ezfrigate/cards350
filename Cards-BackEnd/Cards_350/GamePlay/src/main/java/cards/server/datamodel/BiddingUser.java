package cards.server.datamodel;

public class BiddingUser {
	private User user;
	
	private int bid;
	
	public BiddingUser() {
		super();
	}

	public BiddingUser(User user, int bid) {
		super();
		this.user = user;
		this.bid = bid;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public int getBid() {
		return bid;
	}

	public void setBid(int bid) {
		this.bid = bid;
	}
	
	
}
