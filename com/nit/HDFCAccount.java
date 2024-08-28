package com.nit;

public class HDFCAccount extends BankAccount{

	public HDFCAccount(String accNo, int balance, String name,Address address) {
		super(accNo, balance, name,address);
		// TODO Auto-generated constructor stub
	}
	
	void deposit(int amount) {
		System.out.println("From HDFC Bank...");
		if (amount < 300000) {
			balance = balance + amount;
			System.out.println("Successfully deposited Amount...." + amount);

		}
		else {
			System.out.println("Day Limit Exceeds");
		}
	}
	void withDraw(int amount) {
		System.out.println("From HDFC Bank...");
		if (amount < 300000) {
			balance = balance - amount;
			System.out.println("Successfully withdrawn Amount...." + amount);

		}
		else {
			System.out.println("Day Limit Exceeds");
		}
	}


	
	
}
