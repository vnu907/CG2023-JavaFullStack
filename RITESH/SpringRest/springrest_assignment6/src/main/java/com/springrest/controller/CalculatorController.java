package com.springrest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class CalculatorController {

  private int num1 = 10, num2 = 5;
  private int num = 25;
  
  @GetMapping("/add")
  public String addition() {
    int ans = num1 + num2;
    return String.valueOf(ans);
  }
  
  @GetMapping("/subtract")
  public String subtract() {
    int ans = num1-num2;
    return String.valueOf(ans);
  }
  
  @GetMapping("/multiply")
  public String multiplication() {
    int ans = num1*num2;
    return String.valueOf(ans);
  }

  @GetMapping("/divide")
  public String division() {
    int ans = num1/num2;
    return String.valueOf(ans);
  }
  
  @GetMapping("/root")
  public String squareRoot() {
    int ans = (int) Math.sqrt(num);
    return String.valueOf(ans);
  }
  
}
