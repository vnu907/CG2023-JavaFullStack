package com.springrest.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.springrest.dao.OrderDao;
import com.springrest.model.Order;

@Service
public class OrderService {

  @Autowired
  OrderDao orderDao;
  
  public void placeOrder(Order order) {
    orderDao.save(order);
  }
  
  public Order getOrder(int id) {
    return orderDao.findById(id).get();
  }
  
  public List<Order> getAllOrders() {
    return orderDao.findAll();
  }
  
  public void updateOrder(Order order) {
    orderDao.save(order);
  }
  
  public void deleteOrder(int id) {
    orderDao.deleteById(id);
  }
  
}
