package com.question4.card;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CardController {
	
	@Autowired
	private CardService cardService;
	
	@GetMapping("/{cardNumber}")
	public String checkCard(@PathVariable String cardNumber) {
		return cardService.checkCard(cardNumber);
	}

}
