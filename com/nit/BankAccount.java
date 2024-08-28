package com.nit;

public class BankAccount {

	// relations
	// IS
	// have
	
	String accNo;
	int balance;
	String name;
	Address address;
	
	
	

	
	public BankAccount(String accNo, int balance, String name,
			Address address) {
		super();
		this.accNo = accNo;
		this.balance = balance;
		this.name = name;
		this.address = address;
	}

	void deposit(int amount) {
		
		balance = balance + amount;
		System.out.println("Successfully deposited Amount...."+amount);
		
	}
	
	void withDraw(int amt) {
		
		balance = balance - amt;
		System.out.println("Successfully withdrawn amount....."+amt);
	}
	
	void checkbalance() {
		
		System.out.println("From Account.."+name+"..Current Available Balance--->"+balance);
	}
}
