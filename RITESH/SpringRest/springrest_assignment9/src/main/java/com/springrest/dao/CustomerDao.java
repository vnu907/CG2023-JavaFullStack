package com.springrest.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

import com.springrest.model.Customer;

public interface CustomerDao extends CrudRepository<Customer, Integer> {
	
}
