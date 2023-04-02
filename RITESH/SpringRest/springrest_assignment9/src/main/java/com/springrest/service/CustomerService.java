package com.springrest.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springrest.dao.CustomerDao;
import com.springrest.model.Customer;

@Service
public class CustomerService {

	@Autowired
	private CustomerDao customerDao;
	
	public void createCustomer(Customer customer) {
		customerDao.save(customer);
	}
	public Customer getCustomerById(int id) {
		return customerDao.findById(id).get();
	}
	public void updateCustomer(Customer customer) {
		customerDao.save(customer);
	}
	public List<Customer> getAllCustomers() {
		List<Customer> list = new ArrayList<>();
		customerDao.findAll().forEach(cust -> list.add(cust));
		return list;
	}
	public void deleteCustomer(int id) {
		customerDao.deleteById(id);
	}
}
