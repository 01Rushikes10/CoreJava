package com.recursion;

public class P5To1Number {

	public static void recursion(int n)
	{
		if(n==6)
		{
			return;
		}
		System.out.println(n);
		recursion(n+1);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=1;
		recursion(n);
	}

}
