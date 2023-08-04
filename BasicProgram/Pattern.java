package com.assignment1.itpreneurpune;

/*
14. Print the following patterns :

a) A
   B C
   D E F
   G H I J

b) 1
   1 2
   1 2 3
   1 2 3 4
   1 2 3 4 5
c) 1
   2 2
   3 3 3
   4 4 4 4
   5 5 5 5 5 
   */

import java.util.Scanner;



public class Pattern{
    static void PatternA()
     {
        int rows = 4;
        int alphabet = 65;

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print((char) alphabet + " ");
                alphabet++;
            }
            System.out.println();
        }
}

static void  PatternB()
{
        int rows = 5;

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    
}

 static void PatternC()
  {
   
        int rows = 5;

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
    }
}
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("1.A\r\n" + //
                "   B C\r\n" + //
                "   D E F\r\n" + //
                "   G H I J\n"+"2.1\r\n" + //
                        "   1 2\r\n" + //
                        "   1 2 3\r\n" + //
                        "   1 2 3 4\r\n" + //
                        "   1 2 3 4 5\n"+" 1\r\n" + //
                                "   2 2\r\n" + //
                                "   3 3 3\r\n" + //
                                "   4 4 4 4\r\n" + //
                                "   5 5 5 5 5 ");
        System.out.println("Which pattern do you want to print");
        int p=sc.nextInt();
        switch(p)
        {
            case 1:
                PatternA();
                break;
            case 2:
                PatternB();
                break;
            case 3:
                PatternC();
                break;
            default:
            System.out.println("Enter valid choice:");

        }
    }
}