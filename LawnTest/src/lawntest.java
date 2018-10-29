import java.util.*;

public class lawntest {

	public static void main(String[] args) {
		int lawnFee1 = 40;
		int lawnFee2 = 60;
		int lawnFee3 = 75;
		int lawnFee4 =100;
		int lawnNumber=1;
	double lawnHighestfee=40.0;
		//Highest number of student roll digit
		final int N =7;
	
		//creating lawn class object
		lawn lawnObj = new lawn(lawnFee1,lawnFee2,lawnFee3,lawnFee4);
		System.out.println("Welcome to Lawn Mowing Management..");
		//For loop to value of N
		for(int i=1 ; i<=N; i++) {
			Scanner obj = new Scanner(System.in);
			System.out.println("Enter the area for lawn: " + i);
		
			
			if (!obj.hasNextDouble()) {
				System.out.println("Invalid input terminated the program. Please try again");
				System.exit(0);
			}
			double area = obj.nextDouble();
			
			 
			double fee = lawnObj.lawnMowingFee(area);
			System.out.println("The weekly fee for lawn "+i+ " is  $" + fee);
			if(fee>lawnHighestfee) {
				lawnNumber = i;
				lawnHighestfee=fee;
			}
//			int number = lawnObj.lawnNumber(fee);

		}

		int number = lawnObj.lawnNumber(lawnObj.maxFee);
		if(number>lawnNumber) {
			number = lawnNumber;
		}
		
//		---report   generation-------------

		System.out.println("\n-----------------report---------------------");
		System.out.println("Total weekly lawn mowing fee: $" + lawnObj.totalFee);
		System.out.println("Lowest weekly lawn mowing fee: $" + lawnObj.lowestFee);
		System.out.println("Highest weekly lawn mowing fee: $" + lawnObj.maxFee);
		System.out.println("Average weekly lawn mowing fee: $" + lawnObj.totalFee/N);
		System.out.println("Lawn number with highest monthly fee: " + lawnNumber  );
		System.out.println("Program terminated successfully");
	   
		System.exit(0);
		
			
		
		
		
	
	}

}
