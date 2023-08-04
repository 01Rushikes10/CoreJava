package com.assignment1.itpreneurpune;


//10. Write a program to swap two numbers(interchange the numbers)

import java.util.Scanner;

class Swap
{
	void swappingNum(int num1,int num2)
	{
		
		int temp=num1;
		num1=num2;
		num2=temp;
		System.out.println("After reversing the number, it would become.");
		System.out.println("Numeber1 is "+num1);
		System.out.println("Numeber2 is "+num2);

	}
	void swappingString(String st1,String st2)
	{
		
		String temp=st1;
		st1=st2;
		st2=temp;
		System.out.println("After reversing the String, it would become.");
		System.out.println("String1 is "+st1);
		System.out.println("String2 is "+st2);

	}
}
public class SwapNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Swap obj=new Swap();
		char ch;
		do
		{
			System.out.println("Enter the Which Operation you want to perform\n1.Number swapping\t2.String swapping");
			int choice=sc.nextInt();
			switch(choice)
			{
			case 1:
				System.out.println("Enter the numeber1");
				int num1=sc.nextInt();
				System.out.println("Enter the numeber2");
				int num2=sc.nextInt();
				obj.swappingNum(num1,num2);
				break;
			case 2:
				System.out.println("Enter the String1");
				String st1=sc.next();
				System.out.println("Enter the String2");
				String st2=sc.next();
				obj.swappingString(st1,st2);
				break;
			default:
				System.out.println("Enter correct option");
			}
			System.out.println("Do you want to continue\nEnter 'y'|'Y'");
			 ch=sc.next().charAt(0);
		}while(ch=='y' || ch=='Y');
		

	}

}
