package com.q3;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.example.bank")
public class AppConfig {
    @Bean
    public BankAccountRepository bankAccountRepository() {
        return new BankAccountRepositoryImpl();
    }
    
    @Bean
    public BankAccountService bankAccountService() {
        return new BankAccountServiceImpl(bankAccountRepository());
    }
    
    @Bean
    public BankAccountController bankAccountController() {
        return new BankAccountController(bankAccountService());
    }
}