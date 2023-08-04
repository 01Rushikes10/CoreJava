package com.assignment1.itpreneurpune;


import java.util.Scanner;
//4. Write a program to convert temperature from Fahrenheit to Celsius degree.

class Conversion
{
	void calculate(int fahrenheit)
	{
		
		 double celsius =(double)(fahrenheit - 32) * 5 / 9;
		 System.out.println("After convert temperature from Fahrenheit to Celsius degree is: "+celsius);
		
	}
}
public class ConversionFtoC {

	public static void main(String[] args) {
		Conversion c=new Conversion();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the temperature in fahrenheit: ");
		int faherenhit=sc.nextInt();
		c.calculate(faherenhit);
		

	}

}
