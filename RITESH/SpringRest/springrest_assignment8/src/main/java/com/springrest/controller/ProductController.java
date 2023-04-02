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
import com.springrest.model.Product;
import com.springrest.service.ProductService;

@RestController
public class ProductController {

  @Autowired
  ProductService productService;
  
  @GetMapping("/products")
  public List<Product> getOrders() {
    return productService.getAllProducts();
  }
 
  @GetMapping("/product/{id}")
  public Product getOrder(@PathVariable int id) {
    return productService.getProduct(id);
  }
  
  @PostMapping("/product")
  public void placeOrder(@RequestBody Product product) {
    productService.addProduct(product);
  }
  
  @PutMapping("/product")
  public void updateOrder(@RequestBody Product product) {
    productService.updateProduct(product);
  }
  
  @DeleteMapping("/product/{id}")
  public void deleteOrder(@PathVariable int id) {
    productService.deleteProduct(id);
  }
  
  
}
