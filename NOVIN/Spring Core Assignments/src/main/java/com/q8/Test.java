package com.q8;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationcontextq8.xml");
        MyBean myBean = (MyBean) context.getBean("myBean");
        myBean.getMessage();
        context.close();
    }
}