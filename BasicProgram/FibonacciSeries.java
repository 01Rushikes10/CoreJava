package com.assignment1.itpreneurpune;

// 12. Generate Fibonacci series of a given range. (example 1 1 2 3 8...)

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the range for Fibonacci series: ");
        int range = scanner.nextInt();

        System.out.println("Fibonacci series within the range:");
        generateFibonacci(range);
    }

    public static void generateFibonacci(int range) {
        int first = 1;
        int second = 1;
        int next;

        System.out.print(first + " " + second + " ");

        while (true) {
            next = first + second;

            if (next > range) {
                break;
            }

            System.out.print(next + " ");

            first = second;
            second = next;
        }
    }
}
