package com.assignment1.itpreneurpune;

public class PerfectNumberCheck {

	public static void main(String[] args) {
		int number = 28;
        boolean isPerfect = checkPerfectNumber(number);
        
        if (isPerfect) {
            System.out.println(number + " is a perfect number.");
        } else {
            System.out.println(number + " is not a perfect number.");
        }
    }
    
    public static boolean checkPerfectNumber(int number) {
        if (number <= 1) {
            return false;
        }
        
        int sum = 1;
        for (int i = 2; i * i <= number; i++) {
            if (number % i == 0) {
                sum += i;
                if (i * i != number) {
                    sum += number / i;
                }
            }
        }
        
        return sum == number;
    }
}