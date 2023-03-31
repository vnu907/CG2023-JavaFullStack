package com.question9.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.question9.customer.Customer;
import com.question9.service.CustomerService;

@RestController
public class CustomerController {

	@Autowired
	private CustomerService customerService;

	@GetMapping("/customer")
	public List<Customer> getAllCustomer() {
		return customerService.getAllCustomer();
	}

	@PostMapping("/customer")
	public void addTopic(@RequestBody Customer customer) {
		customerService.addCustomer(customer);
	}

	@GetMapping("/customer/{id}")
	public Optional<Customer> getCustomer(@PathVariable int id) {
		return customerService.getCustomer(id);
	}

	@PutMapping("/customer/{id}")
	public void updateCustomer(@RequestBody Customer customer, @PathVariable int id) {
		customerService.updateCustomer(customer);
	}

	@DeleteMapping("/customer/{id}")
	public void deleteCustomer(@PathVariable int id) {
		customerService.deleteCustomer(id);
	}

}
