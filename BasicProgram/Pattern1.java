package com.assignment1.itpreneurpune;

public class Pattern1 {

	public static void main(String[] args) {
		        pattern1();
		        System.out.println();
		        pattern2();
		        System.out.println();
		        pattern3();
		        System.out.println();
		        pattern4();
		        System.out.println();
		        pattern5();
		        System.out.println();
		        pattern6();
		    }
		    
		    public static void pattern1() {
		        for (int i = 1; i <= 5; i++) {
		            for (int j = 1; j <= i; j++) {
		                if ((i + j) % 2 == 0) {
		                    System.out.print("1");
		                } else {
		                    System.out.print("0");
		                }
		            }
		            System.out.println();
		        }
		    }
		    
		    public static void pattern2() {
		        for (int i = 1; i <= 5; i++) {
		            for (int j = 1; j <= i; j++) {
		                if ((i + j) % 2 == 0) {
		                    System.out.print("0");
		                } else {
		                    System.out.print("1");
		                }
		            }
		            System.out.println();
		        }
		    }
		    
		    public static void pattern3() {
		        for (int i = 1; i <= 5; i++) {
		            for (int j = 1; j <= i; j++) {
		                if (j % 2 == 0) {
		                    System.out.print("0");
		                } else {
		                    System.out.print("1");
		                }
		            }
		            System.out.println();
		        }
		    }
		    
		    public static void pattern4() {
		        for (int i = 1; i <= 5; i++) {
		            for (int j = 1; j <= i; j++) {
		                if (j % 2 == 0) {
		                    System.out.print("1");
		                } else {
		                    System.out.print("0");
		                }
		            }
		            System.out.println();
		        }
		    }
		    
		    public static void pattern5() {
		        for (int i = 1; i <= 5; i++) {
		            for (int j = 1; j <= i; j++) {
		                if ((i + j) % 2 == 0) {
		                    System.out.print("1");
		                } else {
		                    System.out.print("0");
		                }
		                System.out.print(" ");
		            }
		            System.out.println();
		        }
		    }
		    
		    public static void pattern6() {
		        for (int i = 1; i <= 9; i++) {
		            if (i == 5) {
		                for (int j = 1; j <= 5; j++) {
		                    System.out.print("+");
		                }
		            } else {
		                System.out.println("      +");
		            }
		        }
	}

}
