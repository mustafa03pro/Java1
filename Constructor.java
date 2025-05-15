package com.may07;

public class Constructor {
	int id;
	String name;
	double salary;
	public void shoeDetails() {
		System.out.println("The name is "+name);
		System.out.println("The name is "+id);
		System.out.println("The name is "+salary);
	}
	

	public static void main(String[] args) {
		Constructor raj=new Constructor();
		raj.shoeDetails();
		

	}

}
