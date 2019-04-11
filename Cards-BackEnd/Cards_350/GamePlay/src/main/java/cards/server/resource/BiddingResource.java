package cards.server.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import cards.server.datamodel.BiddingUser;
import cards.server.service.BiddingService;

@CrossOrigin()
@RestController
public class BiddingResource {
	@Autowired
	private BiddingService biddingService;
	
	@GetMapping(value = "/getBidding",produces= {MediaType.APPLICATION_JSON_VALUE})
	public BiddingUser getCurrentBidAndUser() {
		return biddingService.getcurrentBid();
	}
	/*
	@PostMapping(value = "/setNewBid", produces = {MediaType.APPLICATION_JSON_VALUE})
	public 
	*/
}
