package cards.server.resource;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import cards.server.datamodel.NumberOfPlayers;
import cards.server.datamodel.Token;
import cards.server.datamodel.User;
import cards.server.service.SessionService;

@CrossOrigin
@RestController
public class SessionResource {
	
	@Autowired
	private SessionService sessionResourceService;
	
	@GetMapping(value = "/startSession", produces= {MediaType.APPLICATION_JSON_VALUE})
	public Token sessionTest(HttpServletRequest request, HttpSession session) {
		return sessionResourceService.getToken(request.getSession());
	}
	
	@GetMapping(value = "/numberOfPlayers", produces= {MediaType.APPLICATION_JSON_VALUE})
	public NumberOfPlayers getNumberOfPlayers() {
		return sessionResourceService.getNumberOfPlayers();
	}
	
	@PostMapping(value = "/addPlayer", consumes = {MediaType.APPLICATION_JSON_VALUE})
	public void addPlayer(@RequestBody User user) {
		sessionResourceService.addPlayer(user);
	}
}
