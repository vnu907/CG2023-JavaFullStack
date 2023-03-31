package com.capgemini.assignment5.repository;

import org.springframework.data.repository.CrudRepository;

import com.capgemini.assignment5.employee.Employee;


public interface EmployeeRepository extends CrudRepository<Employee, String> {

}
