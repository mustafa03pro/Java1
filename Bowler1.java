package com.may09;

public class Bowler1 {


	
	    private String bowlerName;
	    private int bowlerWickets;
	    private int bowlerMatches;
	    private int balls_bowled;
	    private int runs_conceded;

	    // Method to initialize bowler details
	    public void bowlerDetails(String name, int wickets, int matches, int balls, int runs) {
	        if (name == null || name.isEmpty() || wickets < 0 || matches < 0 || balls < 0 || runs < 0) {
	            System.out.println("Error");
	            return;
	        }

	        if ((runs > 0 || balls > 0) && matches == 0) {
	            System.out.println("Error");
	            return;
	        }

	        this.bowlerName = name;
	        this.bowlerWickets = wickets;
	        this.bowlerMatches = matches;
	        this.balls_bowled = balls;
	        this.runs_conceded = runs;
	    }

	    // Compute and print Bowling Average
	    public void computeBowlingAverage() {
	        if (hasInvalidState()) return;

	        if (bowlerWickets == 0) {
	            System.out.println("Bowling average cannot be calculated (wickets = 0)");
	            return;
	        }

	        double avg = (double) runs_conceded / bowlerWickets;
	        System.out.println("Name: " + bowlerName);
	        System.out.println("bowling_avg=" + avg);
	    }

	    // Compute and print Strike Rate
	    public void computeStrikeRate() {
	        if (hasInvalidState()) return;

	        if (balls_bowled == 0) {
	            System.out.println("Strike rate cannot be calculated (balls_bowled = 0)");
	            return;
	        }

	        double strikeRate = (double) runs_conceded / balls_bowled;
	        System.out.println("Name: " + bowlerName);
	        System.out.println("Strike_rate=" + strikeRate);
	    }

	    // Show bowler statistics
	    public void showStatistics() {
	        if (hasInvalidState()) return;

	        System.out.println("Name=" + bowlerName);
	        System.out.println("wickets=" + bowlerWickets);
	        System.out.println("matches=" + bowlerMatches);
	        System.out.println("balls_bowled=" + balls_bowled);
	        System.out.println("runs_conceded=" + runs_conceded);
	    }

	    // Utility method for validations
	    private boolean hasInvalidState() {
	        if (bowlerName == null || bowlerName.isEmpty() || 
	            bowlerWickets < 0 || bowlerMatches < 0 || 
	            balls_bowled < 0 || runs_conceded < 0) {
	            System.out.println("Error");
	            return true;
	        }

	        if ((runs_conceded > 0 || balls_bowled > 0) && bowlerMatches == 0) {
	            System.out.println("Error");
	            return true;
	        }

	        return false;
	    }
	}



