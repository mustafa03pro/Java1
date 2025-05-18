package com.may09;

public class Bowler2Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bowler2 c1=new Bowler2();
		c1.bowlerDetails("md", 2, 20, 100, 300);
		c1.computeBowlingAverage();
		c1.strikeRateAverage();
		c1.showStatistics();
		Bowler2 c2=new Bowler2();
		c2.bowlerDetails("hr",0,0,200,560);
		c2.computeBowlingAverage();
		c2.strikeRateAverage();
		c2.showStatistics();


	}

}
