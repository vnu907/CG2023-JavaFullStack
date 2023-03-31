package com.capgemini.assignment7.repository;

import org.springframework.data.repository.CrudRepository;

import com.capgemini.assignment7.order.Order;


public interface OrderRepository extends CrudRepository<Order, String>{

}
