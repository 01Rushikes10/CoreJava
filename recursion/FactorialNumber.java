package com.recursion;

public class FactorialNumber {

	public static int factorial(int n )
	{
		if(n==1 || n==0)
		{
			return 1;
		}
		int fact=factorial(n-1);
		int fact1=fact*(n);
		return fact1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		int result=factorial(n);
		System.out.println(result);

	}

}
