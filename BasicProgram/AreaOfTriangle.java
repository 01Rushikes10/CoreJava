package com.assignment1.itpreneurpune;


import java.util.Scanner;

//3. Write a program to calculate the area of triangle. Ask input from user (0.5*base*height)

class Area
{
	void calculate(float base,float height)
	{
		float area;
		area=(float)0.5*base*height;
		System.out.println("Area of triangle is: "+area);
	}
	
}
public class AreaOfTriangle {

	public static void main(String[] args) {
		Area a=new Area();
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the base of triangle");
		float base=sc.nextFloat();
		System.out.println("Enter the height of triangle");
		float height=sc.nextFloat();
		a.calculate(base, height);

	}

}
