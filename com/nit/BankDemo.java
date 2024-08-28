package com.nit;

public class BankDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BankAccount bankAcc = null;
		
		SBIAccount johnSBIAcc = new SBIAccount("190876",5000,"John",
				new Address("MG Road","HYD","TS","500001")); 
		HDFCAccount johnHDFCAcc = new HDFCAccount("223399",15000,"John",
				new Address("MG Road","HYD","TS","500001")); 
		
		bankAcc = johnSBIAcc;
		
		bankAcc.deposit(3000);
		bankAcc.checkbalance();
		
		bankAcc = johnHDFCAcc;
		
		bankAcc.deposit(3000);
		bankAcc.checkbalance();
			
	}

}
