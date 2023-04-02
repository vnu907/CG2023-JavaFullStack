package com.springrestjpa.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.springrestjpa.entity.Employee;
import com.springrestjpa.service.EmployeeService;

@RestController
public class EmployeeController {
  @Autowired
  public EmployeeService eService;

 
  @GetMapping("/employees")
  public List<Employee> getEmployees() {


    return eService.getEmployees();
  }

  @GetMapping("/employees/{id}")
  public Employee getSingleEmployee(@PathVariable Long id) {
    return eService.getSingleEmployee(id);

  }

  @PostMapping("/employees")
  public Employee saveEmployee(@RequestBody Employee employee) {
    return eService.saveEmployee(employee);
  }

  @DeleteMapping("/employees/{id}")
  public void deleteEmployee(@PathVariable Long id) {
    eService.deleteEmployee(id);
  }
 
  @PutMapping("/employees/{id}")
  public Employee updateEmployee(@PathVariable Long id, @RequestBody Employee employee) {
    employee.setId(id);
    return eService.updateEmployee(employee);
  }
  
  
}
