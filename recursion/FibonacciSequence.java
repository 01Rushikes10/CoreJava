package com.recursion;

public class FibonacciSequence {

	public static void squence(int a,int b,int num)
	{
		if(a==num)
		{
			return;
		}
		int sum=a+b;
		System.out.print(sum+" ");
		
		squence(b,sum,num);
	}
	public static void main(String[] args) {
		int num=5;
		
		System.out.print("0 ");
		System.out.print("1 ");
		squence(0,1,num-2);

	}

}
