package com.may09;

public class Bowler {
	private String bowlerName;
	 private int  bowlerWickets ;
	 private int  bowlerMatches ;
	  private int ballsbowled;
	  private int  runsconceded;
	  private int avg;
	  
	  public void bowlerDetails(String name, int wickets, int matches, int ball , int runs) {
		  if(matches<0||wickets<0||ball<0) {
			  System.out.println("Error");
			  return;
		  }
		  if((wickets>0||ball>0)&&matches==0) {
			  System.out.println("invalid matyches");
			  return;
		  }
		  else {
			  bowlerName=name;
			  bowlerWickets=wickets;
			  bowlerMatches=matches;
			  ballsbowled=ball;
			  runsconceded=runs;
			  
		  }
		  
		  
		  
		  
	  }
	  public void computeBowlingAverage() {
		  double avg= (double)runsconceded/bowlerWickets;
		  if(avg<0) {
			  System.out.println("invalid input");
			  return;
		  }
		  
	  }
	  public void strikeRateAverage() {
		  double  strikeRate= (double)runsconceded/ballsbowled;
		  if(strikeRate<0) {
			  System.out.println("invalid input");
			  return;
		  }
		  
	  }
	  public void showStatistics() {
		  System.out.println("name= "+ bowlerName);
		  System.out.println("matches= "+ bowlerMatches);
		  System.out.println("wikets= "+ bowlerWickets);
		  System.out.println("balls= "+ ballsbowled);
		  System.out.println("runs= "+ runsconceded);
		  System.out.println("average= "+ avg);
	  }

}
