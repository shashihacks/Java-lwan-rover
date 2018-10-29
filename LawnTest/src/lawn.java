import java.util.*;
//Lawn class
public class lawn {
//	Variables and constants declarations
	
	int lawnFee1 ;
	int lawnFee2 ;
	int lawnFee3;
	int lawnFee4 ;
	double maxFee=0;
	double lowestFee=100.0;
	double totalFee=0;
	int lawnNumber;
	
	double lawnHighestfee=40.0;

	

	
	//constructor initilzanation
	public  lawn(int lawnFee1,int lawnFee2, int lawnFee3, int lawnFee4 ) {
		this.lawnFee1=lawnFee1;
		this.lawnFee2=lawnFee2;
		this.lawnFee3=lawnFee3;
		this.lawnFee4=lawnFee4;
		
	}
	
	//Calculating lawn mowing fee
	public double lawnMowingFee(double area)
	{ 
	

		if(area<500) {
			if(maxFee<lawnFee1) {
				maxFee=lawnFee1;
			}

			
			lowestFee=lawnFee1;
			totalFee +=lawnFee1;
			return lawnFee1;
//			System.out.println("The weekly fee for lawn 1 is  $" + lawnFee1);
		}
		else if(area>=500 && area <900) {
			if(maxFee<lawnFee2) {
				maxFee=lawnFee2;
			}
			if(lawnFee2<lowestFee) {
				lowestFee=lawnFee2;
			}
			
			totalFee+=lawnFee2;
			return lawnFee2;
//			System.out.println("The weekly fee for lawn 2 is  $" + lawnFee2);
			
		}
		else if(area>=900 && area<1500) {
			if(maxFee<lawnFee3) {
				maxFee=lawnFee3;
			}
			if(lawnFee3<lowestFee) {
				lowestFee=lawnFee3;
			}

			
			totalFee += lawnFee3;
			return lawnFee3;
//			System.out.println("The weekly fee for lawn 3 is  $" + lawnFee3);
			
		}
		else if(area>=1500) {
			if(maxFee<lawnFee4) {
				maxFee=lawnFee4;
			}
			if(lawnFee4<lowestFee) {
				lowestFee=lawnFee4;
			}
			totalFee +=lawnFee4;
			return lawnFee4;
//			System.out.println("The weekly fee for lawn 4 is  $" + lawnFee4);
		}
	


		return maxFee;
		
	}
	
	// get lawn number method
	public int lawnNumber(double fee)
	{
	
	
		
		if(fee==40.0) {
		lawnNumber = 1;
		return lawnNumber;
		}
		else if(fee==60.0) {
			lawnNumber  = 2;
		}
		else if(fee==75.0) {
			lawnNumber = 3;
		}
		else if(fee==100.0) {
			lawnNumber =4;
		}
		return lawnNumber;
	}
	
	
	
}
