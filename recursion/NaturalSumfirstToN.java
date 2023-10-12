package com.recursion;

public class NaturalSumfirstToN {

	public static void sumNaturalNumber(int i, int n,int sum)
	{
		if(i==n)
		{
			sum+=i;
			System.out.println("Sum of Natural Number is :"+sum);
			return;
		}
		sum+=i;
		sumNaturalNumber(i+1, n, sum);
//		System.out.println(i);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sumNaturalNumber(1, 5, 0);

	}

}
