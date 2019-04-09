package cards.server.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import cards.server.datamodel.NumberOfPlayers;
import cards.server.datamodel.Token;
import cards.server.datamodel.User;

public interface SessionResourceService {

	public Token getToken(HttpSession session);

	public NumberOfPlayers getNumberOfPlayers();

	public void addPlayer(User user);

	public List<User> getUsers();

}
