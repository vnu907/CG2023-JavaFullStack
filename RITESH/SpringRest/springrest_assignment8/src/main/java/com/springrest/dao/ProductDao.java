package com.springrest.dao;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.springrest.model.Product;


public interface ProductDao extends MongoRepository<Product, Integer>{

  
}
