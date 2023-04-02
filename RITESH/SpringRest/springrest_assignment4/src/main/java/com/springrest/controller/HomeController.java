package com.springrest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.springrest.service.CreditcardService;

@Controller
public class HomeController {

	@Autowired
	private CreditcardService creditCardService;
	
	@ResponseBody
	@RequestMapping("/checkCard")
	public String getCard(@RequestParam("card") String cardNo) {
		return creditCardService.getValidCard(cardNo);
	}
	
}
