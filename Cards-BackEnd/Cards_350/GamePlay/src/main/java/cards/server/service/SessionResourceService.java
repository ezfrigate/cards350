package cards.server.service;

import java.util.List;

import javax.servlet.http.HttpSession;

import cards.server.datamodel.Token;

public interface SessionResourceService {

	public Token getToken(HttpSession session);

	public List<String> getSessionIDs();

}
