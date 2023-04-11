package com.q9;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

    public static void main(String[] args) {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("applicationcontextq9.xml");
        MyBean myBean = (MyBean) context.getBean("myBean");
        myBean.getMessage();
        context.close();
    }
}