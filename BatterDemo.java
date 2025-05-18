package com.may09;

public class BatterDemo {

	public static void main(String[] args) {
		Batter d1=new Batter();
		d1.bowlerDetails("raj", 2, 200);
		d1.computeBowlingAverage();
		d1.showStatistics();
		System.out.println("===============================");
		Batter d2=new Batter();
		d2.bowlerDetails("raj", 0, 200);
		d2.computeBowlingAverage();
		d2.showStatistics();

	}

}
