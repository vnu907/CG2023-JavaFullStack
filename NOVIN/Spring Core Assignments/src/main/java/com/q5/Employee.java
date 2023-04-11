package com.q5;

import javax.annotation.Resource;

public class Employee {
private int employeeId;
private String employeeName;


@Resource
private Pancard pancard;


public int getEmployeeId() {
	return employeeId;
}


public void setEmployeeId(int employeeId) {
	this.employeeId = employeeId;
}
public String getEmployeeName() {
	return employeeName;
}


public void setEmployeeName(String employeeName) {
	this.employeeName = employeeName;
}
public Pancard getPancard() {
	return pancard;
}


public void setPancard(Pancard pancard) {
	this.pancard = pancard;
}
@Override
public String toString() {
	return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", pancard=" + pancard + "]";
}
public Employee() {
	super();
	// TODO Auto-generated constructor stub
}

}