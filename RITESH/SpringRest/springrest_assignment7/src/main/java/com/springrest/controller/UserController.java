package com.springrest.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.springrest.model.Order;
import com.springrest.service.OrderService;

@RestController
public class UserController {

  @Autowired
  OrderService orderService;
  
  @GetMapping("/orders")
  public List<Order> getOrders() {
    return orderService.getAllOrders();
  }
 
  @GetMapping("/order/{id}")
  public Order getOrder(@PathVariable int id) {
    return orderService.getOrder(id);
  }
  
  @PostMapping("/order")
  public void placeOrder(@RequestBody Order order) {
    orderService.placeOrder(order);
  }
  
  @PutMapping("/order")
  public void updateOrder(@RequestBody Order order) {
    orderService.updateOrder(order);
  }
  
  @DeleteMapping("/order/{id}")
  public void deleteOrder(@PathVariable int id) {
    orderService.deleteOrder(id);
  }
  
  
}
