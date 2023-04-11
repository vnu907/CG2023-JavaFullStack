package com.q3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BankAccountServiceImpl implements BankAccountService {
	private BankAccountRepository bankAccountRepository;

	public BankAccountServiceImpl() {

	}

	@Autowired
	public BankAccountServiceImpl(BankAccountRepository bankAccountRepository) {
		this.bankAccountRepository = bankAccountRepository;
	}

	public BankAccountRepository getBankAccountRepository() {
		return bankAccountRepository;
	}

	public void setBankAccountRepository(BankAccountRepository bankAccountRepository) {
		this.bankAccountRepository = bankAccountRepository;
	}

	public double withdraw(long accountId, double balance) {
		double currentBalance = bankAccountRepository.getBalance(accountId);
		if (currentBalance < balance) {
			return -1;
		}
		double newBalance = currentBalance - balance;
		bankAccountRepository.updateBalance(accountId, newBalance);
		return newBalance;
	}

	public double deposit(long accountId, double balance) {
		double currentBalance = bankAccountRepository.getBalance(accountId);
		double newBalance = currentBalance + balance;
		bankAccountRepository.updateBalance(accountId, newBalance);
		return newBalance;
	}

	public double getBalance(long accountId) {
		return bankAccountRepository.getBalance(accountId);
	}

	public boolean fundTransfer(long fromAccount, long toAccount, double amount) {
		double fromAccountBalance = bankAccountRepository.getBalance(fromAccount);
		if (fromAccountBalance < amount) {
			return false;
		}
		double toAccountBalance = bankAccountRepository.getBalance(toAccount);
		bankAccountRepository.updateBalance(fromAccount, fromAccountBalance - amount);
		bankAccountRepository.updateBalance(toAccount, toAccountBalance + amount);
		return true;
	}
}