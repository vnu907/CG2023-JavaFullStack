package com.q6;

import org.springframework.context.ApplicationContext;

import org.springframework.context.support.ClassPathXmlApplicationContext;



public class Test {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationcontextq6.xml");
		Bank b=context.getBean("bank1",Bank.class);
		b.details();

	}

}