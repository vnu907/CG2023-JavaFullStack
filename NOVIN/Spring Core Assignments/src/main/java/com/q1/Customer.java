package com.q1;
public class Customer {
    private int customerId;
    private String customerName;
    private String customerContact;
    private Address customerAddress;

    // This is an example of constructor injection, where the class is dependent on another object (Address) which is passed in as a parameter.
    public Customer(int customerId, String customerName, String customerContact, Address customerAddress) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.customerContact = customerContact;
        this.customerAddress = customerAddress;
    }

    // Getters
    public int getCustomerId() {
        return customerId;
    }
    public String getCustomerName() {
        return customerName;
    }
    public String getCustomerContact() {
        return customerContact;
    }
    public Address getCustomerAddress() {
        return customerAddress;
    }

    // toString() method
    @Override
    public String toString() {
        return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", customerContact=" + customerContact + ", customerAddress=" + customerAddress + "]";
    }
}