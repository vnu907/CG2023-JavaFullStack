package com.q10;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test implements ApplicationContextAware {

    private static ApplicationContext context;

    public static void main(String[] args) {
    	AbstractApplicationContext context = new ClassPathXmlApplicationContext("applicationcontextq10.xml");
        MyBean myBean = (MyBean) context.getBean("myBean");
        myBean.getMessage();
    }

    public void setApplicationContext(ApplicationContext context) {
    	
        Test.context = context;
    }
}