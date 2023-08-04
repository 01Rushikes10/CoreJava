package com.assignment1.itpreneurpune;

// 16.Write a  java program to find those numbers which are divisible by 7 and multiple of 5, between
// 1500 and 2700 (both included).

public class DivisibleBy7mulOf5 {
    public static void main(String[] args) {
        System.out.println("Numbers divisible by 7 and multiple of 5 between 1500 and 2700:");
        
        for (int number = 1500; number <= 2700; number++) {
            if (number % 7 == 0 && number % 5 == 0) {
                System.out.print(number + " ");
            }
        }
    }
}
