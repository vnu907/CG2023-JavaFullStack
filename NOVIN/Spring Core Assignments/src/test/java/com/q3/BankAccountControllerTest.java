package com.q3;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.q3.BankAccountController;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationcontextq3.xml"})
public class BankAccountControllerTest {
    private ApplicationContext context;
    @Autowired
    private BankAccountController bankAccountController;
    
    @Before
    public void setUp() {
        context = new ClassPathXmlApplicationContext("applicationcontextq3.xml");
        bankAccountController = (BankAccountController) context.getBean("bankAccountController");
    }

    @Test
    public void testWithdraw() {
        double newBalance = bankAccountController.withdraw(123456L, 2000);
        assertEquals(8000, newBalance, 0);
    }

    @Test
    public void testDeposit() {
        double newBalance = bankAccountController.deposit(234567L, 500);
        assertEquals(5500, newBalance, 0);
    }

    @Test
    public void testGetBalance() {
        double balance = bankAccountController.getBalance(123456L);
        assertEquals(10000, balance, 0);
    }

    @Test
    public void testFundTransfer() {
        boolean result = bankAccountController.fundTransfer(123456L, 234567L, 1000);
        assertTrue(result);
        
        result = bankAccountController.fundTransfer(123456L, 234567L, 10000);
        assertFalse(result);
    }
}