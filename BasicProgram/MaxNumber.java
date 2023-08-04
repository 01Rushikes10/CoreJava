package com.assignment1.itpreneurpune;

public class MaxNumber {

	public static void main(String[] args) {
		int num1 = 10;
        int num2 = 20;
        int num3 = 15;

        int max = findMax(num1, num2, num3);
        System.out.println("The maximum number is: " + max);
    }

    public static int findMax(int num1, int num2, int num3) {
        int max = num1;

        if (num2 > max) {
            max = num2;
        }

        if (num3 > max) {
            max = num3;
        }

        return max;
    }
}