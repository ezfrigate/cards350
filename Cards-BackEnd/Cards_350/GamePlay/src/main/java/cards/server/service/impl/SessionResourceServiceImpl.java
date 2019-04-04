package cards.server.service.impl;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

import cards.server.datamodel.Token;
import cards.server.service.SessionResourceService;

public class SessionResourceServiceImpl implements SessionResourceService{
	
	private List<String> sessionArray = new ArrayList<>();

	public List<String> getSessionArray() {
		return sessionArray;
	}

	public void setSessionArray(List<String> sessionArray) {
		this.sessionArray = sessionArray;
	}
	 
	@Override
	public Token getToken(HttpSession newSession) {
		System.out.println(newSession.getId());
		Token token = new Token();
		if(!sessionArray.contains(newSession.getId())) {
			sessionArray.add(newSession.getId());
			token.setTokenValue(newSession.getId());
		} else {
			token.setTokenValue("Already");
		}
		return token;
	}

	@Override
	public List<String> getSessionIDs() {
		// TODO Auto-generated method stub
		return null;
	}
}
