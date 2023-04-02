package com.springrest.dao;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.springrest.model.Order;


public interface OrderDao extends MongoRepository<Order, Integer>{

  
}
