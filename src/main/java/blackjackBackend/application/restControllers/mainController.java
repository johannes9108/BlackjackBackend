package blackjackBackend.application.restControllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import blackjackBackend.application.service.BlackJackService;

@RestController
public class mainController {
	
	@Autowired
	private BlackJackService blackjackService;

	
	@GetMapping(value = "/",produces = {MediaType.APPLICATION_JSON_VALUE})
	public ResponseEntity<String> home(){
		
		
		return new ResponseEntity<String>(blackjackService.toString(), HttpStatus.OK);
	}
	
	
	
	
}
