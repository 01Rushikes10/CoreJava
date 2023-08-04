package com.assignment1.itpreneurpune;



import java.util.Scanner;

//2. Write a program to take input from user for empId , name, salary and print the Employee Details.

class EmployeeDetails
{
	int empId;
	String name;
	float salary;
	void accept()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the employee Id");
		empId=sc.nextInt();
		System.out.println("Enter the name");
		name=sc.next();
		System.out.println("Enter the salary");
		salary=sc.nextFloat();
		
	}
	void display()
	{
		
		System.out.println("employee Id:"+empId);
		System.out.println("employee name:"+name);
		System.out.println("employee salary:"+salary);
			
	}
}
public class Employee {

	public static void main(String[] args) {
		EmployeeDetails obj=new EmployeeDetails();
		obj.accept();
		obj.display();

	}

}
