import java.util.*;



public class CricketMatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] scoreArray = new int[30];
		//Random rand = new Random();
		 
		 for(int i=0; i< scoreArray.length ; i++) {
			 
			 scoreArray[i] = (int)(Math.random()*7);
			 
			 System.out.println(scoreArray[i]);
		 }
		 
		 System.out.println("=================TOTAL RUNS====================");
		 
		 int totalRuns = 0;
		 
		 for(int i=0; i< scoreArray.length; i++) {
			 
			 totalRuns = totalRuns + scoreArray[i];
		 }
		 
		 System.out.println("The total number of runs scored are: "+ totalRuns);
		 
		 System.out.println("=================NUMBER OF 0s, 1s, 2s, 3s, 4s, 6s====================");
		 
		 int zeroNo = 0;
		 int oneNo = 0;
		 int twoNo = 0;
		 int threeNo = 0;
		 int fourNo = 0;
		 int sixNo = 0;
		 
		 for(int j=0; j<scoreArray.length; j++) {
			 
			 if(scoreArray[j]==0) {
				 
				 zeroNo=zeroNo+1;
			 }
			 
			 else if (scoreArray[j]==1) {
				 
				 oneNo= oneNo+1;
			 }
			 
			 else if(scoreArray[j]== 2) {
				 
				 twoNo = twoNo+1;
			 }
			 
             else if(scoreArray[j]== 3) {
				 
				 threeNo = threeNo+1;
			 }
			 
             else if(scoreArray[j]== 4) {
	 
	              fourNo = fourNo+1;
	              
             }
			 
             else if(scoreArray[j]== 6) {
	 
	              sixNo = sixNo+1;
             }
			 
			 
		 }
		 
		 System.out.println("No. of 0s are: "+ zeroNo);
		 System.out.println("No. of 1s are: "+ oneNo);
		 System.out.println("No. of 2s are: "+ twoNo);
		 System.out.println("No. of 3s are: "+ threeNo);
		 System.out.println("No. of 4s are: "+ fourNo);
		 System.out.println("No. of 6s are: "+ sixNo);
		 
		 System.out.println("=================STRIKE RATE====================");
		 
		 double strikeRate = (totalRuns/scoreArray.length)*100;
		 
		 System.out.println("Strike rate is: "+ strikeRate);
		 
		 System.out.println("======================LAST 5 INNINGS DETAILS=======================");
		 
		 Assignment3 last = new Assignment3();
		 int lastruns = last.lastTotalRuns();
		 
         System.out.println("=================TOTAL RUNS IN LAST 5 INNINGS====================");
		 
		 System.out.println("The total number of runs in last 5 inings are: "+ lastruns);
		 
		 System.out.println("=================AVERAGE SCORE IN LAST 5 INNINGS====================");
		 
		 float average = lastruns/5;
		 
		 System.out.println("The average score is: "+ average);
		 
         System.out.println("=================STRIKE RATE IN LAST 5 INNINGS====================");
		 
		 double strikeRate1 = (lastruns/150)*100;
		 
		 System.out.println("Strike rate is: "+ strikeRate1);
		 
		 
		 
		 
		 
	}
	
}

class Assignment3 {
	
	public int lastTotalRuns() {
		
		int[] scoreArray1 = new int[150]; 
		 
		for(int i=0; i< scoreArray1.length ; i++) {
			
			scoreArray1[i] = (int)(Math.random()*7);
			System.out.println(scoreArray1[i]);
			
		 }
		
		int totalRuns1 = 0;
		 
		 for(int i=0; i< scoreArray1.length; i++) {
			 
			 totalRuns1 = totalRuns1 + scoreArray1[i];
		 }
		 
		 //return totalRuns1;
		  
		
         System.out.println("=================NUMBER OF 0s, 1s, 2s, 3s, 4s, 6s====================");
		 
		 int zeroNo = 0;
		 int oneNo = 0;
		 int twoNo = 0;
		 int threeNo = 0;
		 int fourNo = 0;
		 int sixNo = 0;
		 
		 for(int j=0; j<scoreArray1.length; j++) {
			 
			 if(scoreArray1[j]==0) {
				 
				 zeroNo=zeroNo+1;
			 }
			 
			 else if (scoreArray1[j]==1) {
				 
				 oneNo= oneNo+1;
			 }
			 
			 else if(scoreArray1[j]== 2) {
				 
				 twoNo = twoNo+1;
			 }
			 
             else if(scoreArray1[j]== 3) {
				 
				 threeNo = threeNo+1;
			 }
			 
             else if(scoreArray1[j]== 4) {
	 
	              fourNo = fourNo+1;
	              
             }
			 
             else if(scoreArray1[j]== 6) {
	 
	              sixNo = sixNo+1;
             }
			 
			 
		 }
		 
		 System.out.println("No. of 0s are: "+ zeroNo);
		 System.out.println("No. of 1s are: "+ oneNo);
		 System.out.println("No. of 2s are: "+ twoNo);
		 System.out.println("No. of 3s are: "+ threeNo);
		 System.out.println("No. of 4s are: "+ fourNo);
		 System.out.println("No. of 6s are: "+ sixNo);
		
		 return totalRuns1;
	}
	
	
}








