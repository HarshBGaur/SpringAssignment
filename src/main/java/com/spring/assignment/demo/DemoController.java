package com.spring.assignment.demo;


import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
public class DemoController {
	
	//@Autowired
	//DemoImplInterface demoService ;

	@RequestMapping(value="/creditcardsystem/{id}")
	public ResponseEntity<CardCheckService> fetchCardCheckServiceResponse(@PathVariable("id") String id){
		CardCheckService cardCheckService = new CardCheckService();
		cardCheckService.setCreditcardNumber(id);
		//Luhn luhn = new Luhn();
		if(Luhn.Check(id)) {cardCheckService.setStatus("true"); };
		
		return ResponseEntity.status(HttpStatus.OK).contentType(MediaType.APPLICATION_JSON_UTF8).body(cardCheckService);
	}
		


	
}