package cards.server.datamodel;

public class User {
	private String inGameNick;
	
	private String SessionID;
	
	public User() {
		super();
	}

	public User(String inGameNick, String sessionID) {
		super();
		this.inGameNick = inGameNick;
		SessionID = sessionID;
	}

	public String getInGameNick() {
		return inGameNick;
	}

	public void setInGameNick(String inGameNick) {
		this.inGameNick = inGameNick;
	}

	public String getSessionID() {
		return SessionID;
	}

	public void setSessionID(String sessionID) {
		SessionID = sessionID;
	}
	
}
