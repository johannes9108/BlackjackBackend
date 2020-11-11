package blackjackBackend.application.restControllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class mainController {

	
	@GetMapping(value = "/",produces = {MediaType.APPLICATION_JSON_VALUE})
	public ResponseEntity<String> home(){
		
		return new ResponseEntity<String>("Hej", HttpStatus.OK);
	}
	
	
	
	
}
