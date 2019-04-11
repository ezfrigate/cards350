package cards.server.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
	
	@PostMapping(value = "/setNewBid", consumes = {MediaType.APPLICATION_JSON_VALUE})
	public void applyNewBidFromUser(@RequestBody BiddingUser biddingUser) {
		biddingService.setNewBid(biddingUser);
	}
	
	@PostMapping(value = "/setAllies", consumes = {MediaType.APPLICATION_JSON_VALUE})
	public void setAllies(@RequestBody String[] cards) {
		biddingService.setAllies(cards);
		System.out.println(cards); //test line
	}
}
