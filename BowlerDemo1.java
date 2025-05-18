package com.may09;

public class BowlerDemo1 {
	


	    public static void main(String[] args) {
	        Bowler1 b = new Bowler1();

	        // Valid test case
	        b.bowlerDetails("Abhishek Sharma", 10, 5, 750, 463);
	        b.computeBowlingAverage();
	        b.computeStrikeRate();
	        b.showStatistics();

	        System.out.println("\n--- Invalid test case (negative values) ---");
	        b.bowlerDetails("Invalid Bowler", -1, 5, 750, 463);  // Should print Error

	        System.out.println("\n--- Invalid test case (matches = 0 but data > 0) ---");
	        b.bowlerDetails("Invalid Bowler", 10, 0, 750, 463);  // Should print Error
	    }
	}



