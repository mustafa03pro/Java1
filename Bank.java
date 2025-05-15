package com.may07;

public class Bank 
{
	 private int accontNumber ;
	 private String customerName;
	  private double customerbalance;
	  
	  static String bankName="State bank of india" ;
	 static  String bankAddress="Ameerpet";
	   static String bankIFSCCode="SBIHYD0007";
	  
	  public void setCustomerDetail(int id,String name,double balance) 
	  {
		  customerName=name;
		   accontNumber=id;
		  customerbalance=balance;
		  //name="mustafa";
		  
	  }
	  public void withdraw(double amount) {
		  if(customerbalance<amount) {
			  System.out.println("you have insuffient fund");
			  return;
		  }
		  else {
			  customerbalance=customerbalance-amount;
			  
		  }
		  
		  
		  
	  }
	  public void deposit(double amount) {
		  if(amount<=0) {
			  System.out.println("you entered wrong input");
			  return;
		  }
		  else {
			  customerbalance=customerbalance+amount;
			  
		  }
		  
		  
		  
	  }
	  public void currentBalance() {
		  
		  System.out.println("your current balance avilable "+customerbalance);
		  
	  }
	  public String displayDetails() {
		  
		  return "your name is "+ customerName +"your Accont number "+ accontNumber +"your current balance avilable "+ customerbalance +"your bank name"+ bankName +"your bamk ifsc code"+ bankIFSCCode +"your bank addres"+ bankAddress;
		  
		  
		  
	  }

}
