package com.capgemini.assignment9.repository;

import org.springframework.data.repository.CrudRepository;

import com.capgemini.assignment9.customer.Customer;

public interface CustomerRepository extends CrudRepository<Customer, Integer>{

}
