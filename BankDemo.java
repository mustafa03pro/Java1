package com.may07;

import java.util.Scanner;

public class BankDemo {

	public static void main(String[] args) {
		Bank hamza=new Bank();
		Scanner sc=new Scanner(System.in);
		//int hamza=sc.nextInt();
		System.out.print("Enter the acco no:");
		int accno=sc.nextInt();
		sc.nextLine();
		System.out.print("Enter the cust name:");
		String name=sc.nextLine();
		//=sc.nextLine();
		System.out.print("Enter the balance");
		double bal=sc.nextDouble();
		hamza.setCustomerDetail(accno, name, bal);
		
		//hamza.withdraw(15000);
		
		hamza.deposit(0);
		//hamza.currentBalance();
		
		 
//		hamza.getCustomerDetail(1234, "sravan", 10000);
		
		System.out.println(hamza.displayDetails());
		//hamza.deposit(2000);
		hamza.currentBalance();
		
		//hamza.displayDetails();
		sc.close();
		
	}

}
