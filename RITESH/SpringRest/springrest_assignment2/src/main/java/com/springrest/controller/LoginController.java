package com.springrest.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

	@PostMapping("/login")
	public String handleForm(@RequestParam String username, @RequestParam String password) {
		String uname = "Ritesh";
		String pass = "Kumar";
		if(uname.equals(username) && pass.equals(password)) {
			return "Valid User";
		}
		return "Invalid User";
	}
	
}
