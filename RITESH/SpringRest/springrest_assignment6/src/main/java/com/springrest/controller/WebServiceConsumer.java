package com.springrest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class WebServiceConsumer {

  @Autowired
  RestTemplate restTemplate;
  
  private static final String URL =  "http://localhost:8090/springrest_assignment6/api/";
    
  @GetMapping("/addition")
  public String addition() {
     return "Addition result is: " + restTemplate.getForObject(URL + "add", String.class);
  }
  @GetMapping("/subtraction")
  public String subtraction() {
     return "Subtraction result is " + restTemplate.getForObject(URL + "subtract", String.class);
  }
  @GetMapping("/multiplication")
  public String multiplication() {
     return "Multiplication result is: " +  restTemplate.getForObject(URL + "multiply", String.class);
  }
  @GetMapping("/division")
  public String division() {
     return "Division result is: " + restTemplate.getForObject(URL + "divide", String.class);
  }
  @GetMapping("/squareroot")
  public String squareRoot() {
     return "Square root of 25 is: " + restTemplate.getForObject(URL + "root", String.class);
  }
  
}
