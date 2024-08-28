package com.nit;

import java.util.Scanner;

public class Demo {
	static void menu() {
		System.out.println("1.Deposit");
		System.out.println("2.withDraw");
		System.out.println("3.Check Balance");
		System.out.println("please enter opt");
	}

	public static void main(String[] args) {
		
		SBIAccount johnAcc = new SBIAccount("190876",5000,"John",
				new Address("MG Road","HYD","TS","500001")); 
		Scanner sc = new Scanner(System.in);
		do{
			
			menu();	
			int opt = sc.nextInt();
			if(opt ==1) {
				System.out.println("enter amount to deposit");
				int amt = sc.nextInt();
				johnAcc.deposit(amt);
			}
			else if(opt ==2) {
				System.out.println("enter amount to withDraw");
				int amt = sc.nextInt();
				
				johnAcc.withDraw(amt);
			}
			else if(opt ==3) {
				johnAcc.checkbalance();
			}
			else {
				System.out.println("Wrong optin");
			}
			System.out.println("do u want to repeat....press 9 to repeat ");
			int no = sc.nextInt();
			if(no != 9) break;
			
		}while(1==1);
	}

}

