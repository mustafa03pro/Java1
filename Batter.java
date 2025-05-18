package com.may09;

public class Batter {

		private String batterName;
		
		 private int  batterMatches ;
		  
		  private int  batterruns;
		  private double avg;
		  
		  public void bowlerDetails(String name,  int matches,  int runs) {
			  if(name==""||matches<0||runs<0) {
				  System.out.println("Error");
				  return;
			  }
			  if(runs>0&&matches<=0) {
				  System.out.println("invalid matyches");
				  return;
			  }
			  else {
				  batterName=name;
					 batterMatches=matches;
					 
					  
					  batterruns=runs;
				  
			  }
			 
			  
			  
			  
		  }
		  public void computeBowlingAverage() {
			 avg= (double)batterruns/batterMatches;
			  if(avg<0) {
				  System.out.println("invalid input");
				  return;
			  }
			  System.out.println("name= "+ batterName);
			  System.out.println("average= "+ avg);
			  
		  }
		  public void showStatistics() {
			  System.out.println("name= "+ batterName);
			  System.out.println("matches= "+ batterMatches);
			  
			  
			  System.out.println("runs= "+ batterruns);
			  System.out.println("average= "+ avg);
		  }

	}



