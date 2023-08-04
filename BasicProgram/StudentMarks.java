package com.assignment1.itpreneurpune;


//11. Write a program to input student marks by condition :
// a) Marks is greater than 0 and less than 50--FAIILED
// b) Marks is greater than 50 and less than 75--1st Class
// c) Marks greater than 75 –and less than 100 Distinction

import java.util.Scanner;

public class StudentMarks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter student marks: ");
        int marks = scanner.nextInt();

        if (marks > 0 && marks < 50) {
            System.out.println("Grade: FAILED");
        } else if (marks >= 50 && marks < 75) {
            System.out.println("Grade: 1st Class");
        } else if (marks >= 75 && marks < 100) {
            System.out.println("Grade: Distinction");
        } else {
            System.out.println("Invalid marks entered.");
        }
    }
}
