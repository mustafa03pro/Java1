package com.may07;

public class EmployeSalary 
{
	 int employeeNumber ;
	 String employeeName;
	  double employeeSalary;
	  double increment;
	  public void getEmployeDetail(int id,String name,double salary) 
	  {
		  employeeName=name;
		  employeeNumber=id;
		  employeeSalary=salary;
		  
	  }
	  public void calculateIncrement() {
		  if(employeeSalary<=50000) {
			  increment=employeeSalary*0.10;
			  employeeSalary=employeeSalary+employeeSalary*0.10;
			  
		  }
		  else if(employeeSalary>50000&&employeeSalary<80000) {
			  increment=employeeSalary*0.07;
			  employeeSalary=employeeSalary+employeeSalary*0.07;
		  }
		  else if(employeeSalary>80000) {
			  increment=employeeSalary*0.05;
			  employeeSalary=employeeSalary+employeeSalary*0.05;
		  }
	  }
	  public void setEmployeeDetails() {
		  System.out.println("the employe name "+employeeName);
		  System.out.println("the employe id  "+employeeNumber);
		  System.out.println("the salary increment  "+increment);

		  System.out.println("the employe salary "+employeeSalary);

	  }
}
