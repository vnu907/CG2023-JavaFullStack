package com.springrest.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.springrest.dao.ProductDao;
import com.springrest.model.Product;

@Service
public class ProductService {

  @Autowired
  ProductDao productDao;
  
  public void addProduct(Product product) {
    productDao.save(product);
  }
  
  public Product getProduct(int id) {
    return productDao.findById(id).get();
  }
  
  public List<Product> getAllProducts() {
    return productDao.findAll();
  }
  
  public void updateProduct(Product product) {
    productDao.save(product);
  }
  
  public void deleteProduct(int id) {
    productDao.deleteById(id);
  }
  
}
