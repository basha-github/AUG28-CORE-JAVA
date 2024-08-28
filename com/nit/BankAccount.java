package com.nit;

abstract public class BankAccount {
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

	abstract void deposit(int amount);
	
	abstract void withDraw(int amt);
	void checkbalance() {
		
		System.out.println("From Account.."+name+"..Current Available Balance--->"+balance);
	}
}
