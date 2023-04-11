package com.q3;

import org.springframework.stereotype.Repository;

@Repository
public interface BankAccountRepository {
    double getBalance(long accountId);
    double updateBalance(long accountId, double newBalance);
}