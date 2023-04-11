package com.q1;
import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@ContextConfiguration(locations = "classpath:applicationcontextq1.xml")
public class CustomerTest {
    @Autowired
    private Customer customer;

    @Test
    public void testCustomer() {
        assertEquals(1, customer.getCustomerId());
        assertEquals("John Doe", customer.getCustomerName());
        assertEquals("123-456-7890", customer.getCustomerContact());
        assertEquals("123 Main St", customer.getCustomerAddress().getStreet());
        assertEquals("Anytown", customer.getCustomerAddress().getCity());
        assertEquals("CA", customer.getCustomerAddress().getState());
        assertEquals("12345", customer.getCustomerAddress().getZip());
        assertEquals("USA", customer.getCustomerAddress().getCountry());
    }
}