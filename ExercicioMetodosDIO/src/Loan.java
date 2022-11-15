package exerciseClasses;

//A java class example - Loan //
public class Loan {
	
	
	public static int getTwoParcels() {
		return 2;
	}
	
	public static int getThreeParcels() {
		return 3;
		
	}
	
	public static double getTwoParcelsTaxes() {
		return 0.3;
		
	}
	public static double getThreeParcelsTaxes () {
		return 0.45;
		
	}
	
	public static void toCalculate (double value, int parcels) {
		
		if (parcels == 2) {
			double finalvalue = value + (value *getTwoParcelsTaxes());
			
			System.out.println("The total amount to pay will be: "+finalvalue);
		} else if (parcels == 3) {
			
			double finalvalue = value + (value * getThreeParcelsTaxes ());
			System.out.println("The total amount to pay will be:"+finalvalue);
		}else {
			System.out.println ("The quantity of times have achieved the limit parcels allowed.");
		}
	}

	private static double value(double d) {
		return 0;
	}
}
