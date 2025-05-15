package com.may07;

public class EmployeSalaryIncrementDemo {

	public static void main(String[] args) {
		EmployeSalary varun=new EmployeSalary();
		varun.getEmployeDetail(101, "varun", 30000);
		varun.calculateIncrement();
		varun.setEmployeeDetails();
	}

}
