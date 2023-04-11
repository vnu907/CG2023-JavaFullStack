package com.springrestjpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.springrestjpa.entity.Employee;

//here  i am using jpa repository for crud operation for creating table
@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
   
   
}
