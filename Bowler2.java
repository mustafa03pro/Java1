package com.may09;

public class Bowler2 {
	

	
	    private String bowlerName;
	    private int bowlerWickets;
	    private int bowlerMatches;
	    private int ballsbowled;
	    private int runsconceded;
	    private double avg;  // Changed to double
	    private double strikeRate;

	    public void bowlerDetails(String name, int wickets, int matches, int balls, int runs) {
	        if (name == null || name.isEmpty() || wickets < 0 || matches < 0 || balls < 0 || runs < 0) {
	            System.out.println("Error");
	            return;
	        }

	        if ((wickets > 0 || balls > 0 || runs > 0) && matches == 0) {
	            System.out.println("Error: Invalid input - stats provided but matches = 0");
	            return;
	        }

	        this.bowlerName = name;
	        this.bowlerWickets = wickets;
	        this.bowlerMatches = matches;
	        this.ballsbowled = balls;
	        this.runsconceded = runs;
	    }

	    public void computeBowlingAverage() {
	        if (bowlerWickets == 0) {
	            System.out.println("Cannot compute average: Wickets = 0");
	            return;
	        }

	        avg = (double) runsconceded / bowlerWickets;
	        System.out.println("Name: " + bowlerName);
	        System.out.println("bowling_avg=" + avg);
	    }

	    public void strikeRateAverage() {
	        if (ballsbowled == 0) {
	            System.out.println("Cannot compute strike rate: Balls bowled = 0");
	            return;
	        }

	        strikeRate = (double) runsconceded / ballsbowled;
	        System.out.println("Name: " + bowlerName);
	        System.out.println("Strike_rate=" + strikeRate);
	    }

	    public void showStatistics() {
	        if (bowlerName == null) {
	            System.out.println("No data available. Please enter bowler details first.");
	            return;
	        }

	        System.out.println("Name= " + bowlerName);
	        System.out.println("Wickets= " + bowlerWickets);
	        System.out.println("Matches= " + bowlerMatches);
	        System.out.println("Balls bowled= " + ballsbowled);
	        System.out.println("Runs conceded= " + runsconceded);
	        System.out.println("Bowling average= " + avg);
	        System.out.println("Strike rate= " + strikeRate);
	    }
	}



