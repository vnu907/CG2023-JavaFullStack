package com.springrestjpa.service;

import java.util.List;
import com.springrestjpa.entity.Employee;

public interface EmployeeService {
  List<Employee> getEmployees();

  Employee saveEmployee(Employee employee);

  Employee getSingleEmployee(Long id);

  void deleteEmployee(Long Id);

  Employee updateEmployee(Employee employee);

 
  
  
}
