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
// it is use to create restful web services using spring mvc
@RestController
public class EmployeeController {
	//it is used to inject the object dependency implicitly, It internally uses Setter or Constructor injection
  @Autowired
  public EmployeeService eService;

 //mapping http get request onto specific handler
  @GetMapping("/employees")
  public List<Employee> getEmployees() {


    return eService.getEmployees();
  }

  //it is used for creating new resources
  @GetMapping("/employees/{id}")
  public Employee getSingleEmployee(@PathVariable Long id) {
    return eService.getSingleEmployee(id);

  }

  //it is used for updating an existing resource 
  @PostMapping("/employees")
  public Employee saveEmployee(@RequestBody Employee employee) {
    return eService.saveEmployee(employee);
  }

  //it is a request for deleting 
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
