package com.fdmgroup.bankDesignProject;

public class Company extends Customer {

	public Company(String name, String address) {
		super(name, address);
	
	}

	@Override
	public void chargeAllAccounts(double amount) {
		
		for(Account account: this.getAccounts()) {
			
			if(account instanceof SavingsAccount) {
				account.withdraw(amount*2); 
				
			}
			if(account instanceof CheckingAccount) {
				account.withdraw(amount);
			}
			
		}
	}



}
