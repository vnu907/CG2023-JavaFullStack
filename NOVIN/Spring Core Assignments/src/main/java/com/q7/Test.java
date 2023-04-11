package com.q7;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationcontextq7.xml");

		Demo d1=context.getBean("Demo",Demo.class);
		System.out.println(d1);
		
	}

}