package com.assignment1.itpreneurpune;



import java.util.Scanner;

//6. Write a program to find the cube of number upto the given numbers by the user.

class Cube
{
	void find(int number)
	{
		int result=number*number*number;
		System.out.println("Cube of Given Number is:"+result);
	}
}
public class CubeOfNumber {

	public static void main(String[] args) {
		Cube c=new Cube();
		Scanner sc=new Scanner(System.in);
		System.out.println("Which Number you want to Cube\nEnter the number:");
		int number=sc.nextInt();
		c.find(number);

	}

}
