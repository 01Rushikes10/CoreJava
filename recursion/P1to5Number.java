package com.recursion;

public class P1to5Number {

	
	public static void printNumber(int num)
	{
		if(num==0)
		{
			return;
		}
		System.out.println(num);
		printNumber(num-1);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=5;
		
		printNumber(num);
		

	}

}
