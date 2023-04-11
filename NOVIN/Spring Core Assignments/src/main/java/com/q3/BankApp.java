package com.q3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BankApp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationcontextq3.xml");
        
        BankAccountController bankAccountController = context.getBean("bankAccountController", BankAccountController.class);
        
        // Withdraw some amount from account 123456
        double newBalance = bankAccountController.withdraw(123456L, 2000);
        System.out.println("New balance of account 123456 after withdrawal: " + newBalance);
        
        // Deposit some amount to account 234567
        newBalance = bankAccountController.deposit(234567L, 500);
        System.out.println("New balance of account 234567 after deposit: " + newBalance);
        
        // Check balance of account 123456
        double balance = bankAccountController.getBalance(123456L);
        System.out.println("Balance of account 123456: " + balance);
        
        // Transfer some amount from account 123456 to account 234567
        boolean result = bankAccountController.fundTransfer(123456L, 234567L, 1000);
        if (result) {
            System.out.println("Fund transfer successful");
        } else {
            System.out.println("Fund transfer failed");
        }
    }
}