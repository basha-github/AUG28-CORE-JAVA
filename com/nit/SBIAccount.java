package com.nit;

public class SBIAccount extends BankAccount{

	public SBIAccount(String accNo, int balance, String name, Address address) {
		super(accNo, balance, name, address);
		// TODO Auto-generated constructor stub
	}
void deposit(int amount) {
	
	System.out.println("From SBI Bank...");
		if(amount < 100000) {
			balance = balance + amount;
			System.out.println("Successfully deposited Amount...."+amount);
			
		}

		else {
			System.out.println("Day Limit Exceeds");
		}
	}
	
}
