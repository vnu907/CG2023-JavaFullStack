package com.question6.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NumberController {
	
	@GetMapping(value="/add/{num1}/{num2}")
	public int addNumber(@PathVariable int num1, @PathVariable int num2) {
		return (num1+num2);
		
	}
	
	@GetMapping(value="/sub/{num1}/{num2}")
	public int subNumber(@PathVariable int num1, @PathVariable int num2) {
		return (num1-num2);
		
	}
	
	@GetMapping(value="/mul/{num1}/{num2}")
	public int mulNumber(@PathVariable int num1, @PathVariable int num2) {
		return (num1*num2);
	}
	
	@GetMapping(value="/div/{num1}/{num2}")
	public int divNumber(@PathVariable int num1, @PathVariable int num2) {
		return (num1/num2);
	}
	
	@GetMapping(value="/sqrt/{num1}")
	public int sqrtNumber(@PathVariable int num1) {
		return (int) Math.sqrt(num1);
	}

}
