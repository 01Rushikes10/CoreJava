package com.assignment1.itpreneurpune;



import java.util.Scanner;

//1. Write a Program to take two numbers from user and perform basic operations addition, subtraction,
//division and remainder.
class Operation
{
	int result;
	void sum(int num1,int num2)
	{
		result=num1+num2;
		System.out.print(result);
	}
	void sub(int num1,int num2)
	{
		result=num1-num2;
		System.out.print(result);
	}
	void mul(int num1,int num2)
	{
		result=num1*num2;
		System.out.print(result);
	}
	void div(int num1,int num2)
	{
		result=num1/num2;
		System.out.print(result);
	}
	void rem(int num1)
	{
		result=num1%10;
		System.out.print(result);
	}
}
public class Calculator {

	public static void main(String[] args) {
		int num1,num2;
		Operation obj=new Operation();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two number");
		num1=sc.nextInt();
		num2=sc.nextInt();
		
		System.out.println("Enter Which opearation you want to perform\n Enter number\n1.addition\t2.subtraction\t3.Multiplication\t4division\t5.remainder");
		int no=sc.nextInt();
		switch(no)
		{
		case 1:
			System.out.println("Addition of number is: ");
			obj.sum(num1,num2);
			break;
		case 2:
			System.out.println("Substraction of number is: ");
			obj.sub(num1,num2);
			break;
		case 3:
			System.out.println("Multiplication of number is: ");
			obj.mul(num1,num2);
			break;
		case 4:
			System.out.println("Division of number is: ");
			obj.div(num1,num2);
			break;
		case 5:
			System.out.println("Remainder of number1 is: ");
			obj.rem(num1);
			System.out.println("Remainder of number2 is: ");
			obj.rem(num2);
			break;
			default:
				System.out.println("Enter vaild Number:");
			
		}
	}

}
