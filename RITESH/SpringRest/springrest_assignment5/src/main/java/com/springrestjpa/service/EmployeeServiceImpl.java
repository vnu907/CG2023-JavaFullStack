package com.springrestjpa.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;
import com.springrestjpa.entity.Employee;
import com.springrestjpa.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService {
  @Autowired
  public EmployeeRepository eRepository;

  @Override
  public Employee saveEmployee(Employee employee) {
    
    return  eRepository.save(employee);
  }

  

  @Override
  public Employee getSingleEmployee(Long id) {
    Optional<Employee> employee=eRepository.findById(id);
    
    return employee.get();
  }

  @Override
  public void deleteEmployee(Long id) {
    eRepository.deleteById(id);
    
  }

  @Override
  public Employee updateEmployee(Employee employee) {
    
    return eRepository.save(employee);
  }

  

  @Override
  public List<Employee> getEmployees() {
    
    return  eRepository.findAll();
  }

  

  
  

}
