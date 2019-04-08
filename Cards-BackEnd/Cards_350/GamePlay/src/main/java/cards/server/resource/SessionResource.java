package cards.server.resource;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import cards.server.datamodel.Token;
import cards.server.service.SessionResourceService;

@RestController
public class SessionResource {
	
	@Autowired
	private SessionResourceService sessionResourceService;
	
	@GetMapping(value = "/startSession", produces= {MediaType.APPLICATION_JSON_VALUE})
	public Token sessionTest(HttpServletRequest request, HttpSession session) {
		return sessionResourceService.getToken(request.getSession());
	}
}
