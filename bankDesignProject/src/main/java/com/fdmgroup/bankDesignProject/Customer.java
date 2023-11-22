package com.fdmgroup.bankDesignProject;

import java.util.ArrayList;
import java.util.List;

public abstract class Customer {

	private final long CUSTOMER_ID;
	private static long nextCustomerId = 2000000;
	private String name;
	private String address;
	private List<Account> accounts = new ArrayList<Account>();
	

	
	public Customer(String name, String address) {
		super();
		this.name = name;
		this.address = address;
		this.CUSTOMER_ID = nextCustomerId;
		nextCustomerId += 7;
	}

	public void addAccount(Account account) {
		
			this.accounts.add(account);
	
	}
	
	public void removeAccount(Account account) {
		
		this.accounts.remove(account);
		}
		
		
	
	
	public abstract void chargeAllAccounts(double amount);

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public List<Account> getAccounts() {
		return accounts;
	}


	public long getCUSTOMER_ID() {
		return this.CUSTOMER_ID;
	}


	
	
	
	
}
