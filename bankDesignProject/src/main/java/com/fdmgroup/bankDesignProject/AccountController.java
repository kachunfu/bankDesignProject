package com.fdmgroup.bankDesignProject;

import java.util.ArrayList;
import java.util.List;

public class AccountController {

	private List<Customer> customers = new ArrayList<Customer>();
	private List<Account> accounts = new ArrayList<Account>();
	
	
	public Customer createCustomer(String name, String address, String type) {
		
		
			if(type.equals("person")) {
				Person person = new Person(name, address);
				customers.add(person); 
				return person;
			}
			else {
				Company company = new Company(name, address);
				customers.add(company);
				return company;
		}
	}
	
	public Account createAccount(Customer customer, String type ) {
		
			if(type.equals("checking")) {
				
				CheckingAccount checkingAccount = new CheckingAccount();
				accounts.add(checkingAccount);
				customer.addAccount(checkingAccount);
				return checkingAccount;
			}else {
				
				SavingsAccount savingsAccount = new SavingsAccount();
				accounts.add(savingsAccount);
				customer.addAccount(savingsAccount);
				return savingsAccount;
			}
	}
	
	public void removeCustomer(Customer customer) {
		
		this.customers.remove(customer);
		
		for(Account account: customer.getAccounts()) {
		accounts.remove(account);
		}
	}
	
	public void removeAccount(Account account) {
		this.accounts.remove(account);
		
		for(Customer customer: this.getCustomers()) {
			customer.removeAccount(account);
		}
	}

	public List<Customer> getCustomers() {
		return customers;
	}


	public List<Account> getAccounts() {
		return accounts;
	}







	
	
	
	
	
}
