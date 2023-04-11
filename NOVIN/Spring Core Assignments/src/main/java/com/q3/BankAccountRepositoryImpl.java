package com.q3;


import java.util.HashMap;
import java.util.Map;

public class BankAccountRepositoryImpl implements BankAccountRepository {
    private Map<Long, BankAccount> accounts = new HashMap<Long, BankAccount>();

    public BankAccountRepositoryImpl() {
        accounts.put(123456L, new BankAccount(123456L, "John Doe", "Savings", 10000));
        accounts.put(234567L, new BankAccount(234567L, "Jane Doe", "Current", 5000));
    }

    public double getBalance(long accountId) {
        return accounts.get(accountId).getAccountBalance();
    }

    public double updateBalance(long accountId, double newBalance) {
        accounts.get(accountId).setAccountBalance(newBalance);
        return accounts.get(accountId).getAccountBalance();
    }
}