package com.q5;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("com/annotationQ5/Q5config.xml");
		Employee ob=(Employee) context.getBean("emp");
		System.out.println(ob);

	}

}