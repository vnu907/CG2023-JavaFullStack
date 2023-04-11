package com.springrestjpa.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
//it specifies that the class is an entity and mapped to a database
@Entity

//it allow to specify the details in the table
@Table(name="tbl_employee")

public class Employee {
	//it specify the primary key of an entity
  @Id
  
  //it automatically generated the primary key values
  @GeneratedValue(strategy=GenerationType.IDENTITY)
  
  //it is used to add the column
  @Column(name="id")
  private Long id;
  @Column(name="name")
  private String name;
  @Column(name="age")
  private int age;
  @Column(name="location")
  private String location;
  @Column(name="email")
  private String email;
  
  
public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public String getLocation() {
	return location;
}
public void setLocation(String location) {
	this.location = location;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
//inform the compiler that the element is override and element is declared in super class or parent class
@Override
public String toString() {
	return "Employee [id=" + id + ", name=" + name + ", age=" + age + ", location=" + location + ", email=" + email
			+ "]";
}

  
  
  
  
  

}
