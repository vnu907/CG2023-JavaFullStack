package com.springrest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.springrest.model.Address;
import com.springrest.service.AddressService;

@Controller
public class HomeController {

	@Autowired
	AddressService addressService;
	
	@GetMapping("/")
	public String homePage() {
		return "home";
	}
	
	@ResponseBody
	@PostMapping("location")
	public Address getLocation(@RequestParam("zipcode") long zipcode) {
		return addressService.findByZipcode(zipcode);
	}
	
}
