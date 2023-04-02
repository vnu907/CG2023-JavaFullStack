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

import com.springrest.model.Customer;
import com.springrest.service.CustomerService;

@RestController
public class CustomerController {

	@Autowired
	CustomerService customerService;
	
	@GetMapping("/customers")	
	public List<Customer> getCustomers() {
		return customerService.getAllCustomers();
	}
	
	@GetMapping("/customer/{id}")
	public Customer getCustomer(@PathVariable("id") int id) {
		return customerService.getCustomerById(id);
	}

	@PostMapping("/customer")
	public void addCustomer(@RequestBody Customer customer) {
	    customerService.createCustomer(customer);
	}
	
	@PutMapping("/customer")
	public void updateCustomer(@RequestBody Customer customer) {
		customerService.updateCustomer(customer);
	}
	
	@DeleteMapping("/customer/{id}")
	public void deleteCustomer(@PathVariable("id") int id) {
		customerService.deleteCustomer(id);
	}
	
}
