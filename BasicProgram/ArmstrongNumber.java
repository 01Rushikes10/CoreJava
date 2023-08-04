package com.assignment1.itpreneurpune;

// 13. Write a program to check the number entered by a user is Armstrong or not.
// (Hint 153=13+53 +33 )

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        if (isArmstrongNumber(number)) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is not an Armstrong number.");
        }
    }

    public static boolean isArmstrongNumber(int number) {
        int originalNumber = number;
        int result = 0;
        int remainder;
        int n = String.valueOf(number).length();

        while (number != 0) {
            remainder = number % 10;
            result += remainder*remainder*remainder;
            number /= 10;
        }

        return originalNumber == result;
    }
}
