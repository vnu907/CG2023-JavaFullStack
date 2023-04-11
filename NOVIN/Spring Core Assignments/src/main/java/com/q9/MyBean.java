package com.q9;

import org.springframework.beans.factory.config.BeanPostProcessor;
//Bean life cycle
class MyBean implements BeanPostProcessor {

    private String message;

    public void setMessage(String message) {
        this.message = message;
    }

    public void getMessage() {
        System.out.println("Message: " + message);
    }

    public void init() {
        System.out.println("Custom init method called.");
    }

    public void destroy() {
        System.out.println("Custom destroy method called.");
    }

    public Object postProcessBeforeInitialization(Object bean, String beanName) {
        System.out.println("Before initialization of bean " + beanName + ".");
        return bean;
    }

    public Object postProcessAfterInitialization(Object bean, String beanName) {
        System.out.println("After initialization of bean " + beanName + ".");
        return bean;
    }
}
