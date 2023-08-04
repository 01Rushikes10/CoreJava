package com.assignment1.itpreneurpune;

public class SquareNumber1To30 {

	public static void main(String[] args) {
		        int start = 1;
		        int end = 30;
		        
		        printSquareList(start, end);
		    }
		    
		    public static void printSquareList(int start, int end) {
		        for (int i = start; i <= end; i++) {
		            int square = i * i;
		            System.out.println(square);
		        }
		    }
		}

	}
}
