package com.recursion;

//base( x power n
public class BasePower {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int base=2;
		int power=3;
		int result=Result.calResult(base,power,1);
		System.out.println(result);
	}

}
class Result{
	public static int calResult(int base,int power,int result)
	{
		if(power==0)
		{
			return result; 
		}
		result*=base;
		return calResult(base,power-1,result);
	}
}
