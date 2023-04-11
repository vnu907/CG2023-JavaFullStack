package com.q3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class BankAccountController {
	private BankAccountService bankAccountService;

	public BankAccountController() {

	}

	@Autowired
	public BankAccountController(BankAccountService bankAccountService) {
		this.bankAccountService = bankAccountService;
	}

	public BankAccountService getBankAccountService() {
		return bankAccountService;
	}

	public void setBankAccountService(BankAccountService bankAccountService) {
		this.bankAccountService = bankAccountService;
	}

	public double withdraw(long accountId, double balance) {
		if (bankAccountService == null) {
			throw new IllegalStateException("bankAccountService is null. Autowiring did not work.");
		}
		double newBalance = bankAccountService.withdraw(accountId, balance);
		System.out.println("New balance of account " + accountId + " after withdrawal: " + newBalance);
		return newBalance;
	}

	public double deposit(long accountId, double balance) {
		return bankAccountService.deposit(accountId, balance);
	}

	public double getBalance(long accountId) {
		return bankAccountService.getBalance(accountId);
	}

	public boolean fundTransfer(long fromAccount, long toAccount, double amount) {
		return bankAccountService.fundTransfer(fromAccount, toAccount, amount);
	}
}