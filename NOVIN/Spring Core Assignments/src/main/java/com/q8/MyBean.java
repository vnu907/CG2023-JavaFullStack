package com.q8;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

class MyBean implements InitializingBean, DisposableBean {

    private String message;

    public void setMessage(String message) {
        this.message = message;
    }

    public void getMessage() {
        System.out.println("Message: " + message);
    }

    public void afterPropertiesSet() throws Exception {
        System.out.println("InitializingBean method called.");
    }

    public void destroy() throws Exception {
        System.out.println("DisposableBean method called.");
    }
    @PostConstruct
    public void init() {
    	System.out.println("@postconstruct method called");
    }
    @PreDestroy
    public void destroys() {
    	System.out.println("@predestroy method called");
    }
}