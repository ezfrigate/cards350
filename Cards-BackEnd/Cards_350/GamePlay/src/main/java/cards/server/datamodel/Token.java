package cards.server.datamodel;

public class Token {
	private String tokenValue;
	 
	public Token(String tokenValue) {
		super();
		this.tokenValue = tokenValue;
	}

	public Token() {
		super();
	}

	public String getTokenValue() {
		return tokenValue;
	}

	public void setTokenValue(String tokenValue) {
		this.tokenValue = tokenValue;
	}
	 
}
