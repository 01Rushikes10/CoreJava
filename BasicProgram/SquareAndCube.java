package com.assignment1.itpreneurpune;

public class SquareAndCube {

	public static void main(String[] args) {
	
		        int start = 1;
		        int end = 10;
		        
		        calculateSquareAndCube(start, end);
		    }
		    
		    public static void calculateSquareAndCube(int start, int end) {
		        System.out.println("Number\tSquare\tCube");
		        
		        for (int i = start; i <= end; i++) {
		            int square = i * i;
		            int cube = i * i * i;
		            
		            System.out.println(i + "\t" + square + "\t" + cube);
		        }
		    }		
	
}
