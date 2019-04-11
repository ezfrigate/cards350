package cards.server.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Service;

import cards.server.datamodel.NumberOfPlayers;
import cards.server.datamodel.Token;
import cards.server.datamodel.User;
import cards.server.service.SessionService;

@Service
public class SessionServiceImpl implements SessionService{

	private List<User> users = new ArrayList<>();
	
	@Override
	public List<User> getUsers(){
		return this.users;
	}
	 
	@Override
	public Token getToken(HttpSession newSession) {
		System.out.println(newSession.getId());
		return new Token(newSession.getId());
	}

	@Override
	public NumberOfPlayers getNumberOfPlayers() {
		return new NumberOfPlayers(this.users.size());
	}

	@Override
	public void addPlayer(User user) {
		if(!users.stream().map(User::getSessionID).collect(Collectors.toList()).contains(user.getSessionID())) {
			if(users.size() < 6) {
				users.add(user);
			} else {
				System.out.println("playerpool max");
			}
		} else {
			System.out.println("user already joined");
		}
		
	}
}
