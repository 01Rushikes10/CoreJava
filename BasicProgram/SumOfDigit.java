package com.assignment1.itpreneurpune;


import java.util.Scanner;

//7. Write a program to find the sum of digits of a number.

class DigitSum
{
	int find()
	{
		System.out.println("Which Number You Want to find sum of digits\nEnter the Number:");
		Scanner sc=new Scanner(System.in);
		int number=sc.nextInt();
		int digit;
		int sum=0;
		while(number!=0)
		{
			digit=number%10;
			sum+=digit;
			number=number/10;
		}
		return sum;
	}
}
public class SumOfDigit {

	public static void main(String[] args) {
		DigitSum ds=new DigitSum();
		int result=ds.find();
		System.out.println("Sum of Digit is: "+result);

	}

}
