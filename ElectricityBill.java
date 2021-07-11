import java.util.Scanner;

public class ElectricityBill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("WELCOME TO ELECTRIC BILL CALCULATOR");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of units: ");
		int unit = sc.nextInt();
		System.out.println("Calculating amount...");
		double amt = calculateBill(unit);
		
		System.out.println("The Electric bill amount is Rs "+ amt );
		
		sc.close();
		
	}
	
	public static double calculateBill(int unit) {
		
		double amount;
		double stdPrice= 1.2;
		int remUnit = 0;
				
		if(unit<=100) {
			amount = unit*stdPrice;
		}
		
		else if(unit>100 && unit<=300) {
			
			remUnit= unit-100;
			amount = remUnit*2 + 100*stdPrice;
		}
		
		else
		{	
			remUnit = unit-300;
			amount = remUnit*3 + 200*2 + 100*stdPrice;
		}
		
		return amount;
	}

}
