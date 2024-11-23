import java.util.Scanner;

public class IT24103913Lab5Q3{
	public static void main(String[]args){
		
		int MIN_DAY = 1;
		int MAX_DAY = 31;
		double ROOM_CHARGES_PER_DAY = 48000.0;
		
		Scanner input = new Scanner (System.in);
		
		System.out.print ("Enter start date (1-31): ");
		int startDate = input.nextInt();
		
		System.out.print ("Enter end date (1-31): ");
		int endDate = input.nextInt();
		
		System.out.println();
		
		
		if (startDate < MIN_DAY || startDate > MAX_DAY || endDate < MIN_DAY || endDate > MAX_DAY){
			System.out.println ("Error: Days must be between 1 and 31");
			return;
		}
		
		if (startDate >= endDate) {
			System.out.println ("Error: Start Date must be less than End date");
			return;
		}
		
		int daysReserved = endDate - startDate;
		
		int discountRate;
		if (daysReserved < 3) {
			discountRate = 0;
		}
		
		else if (daysReserved <= 4){
		discountRate = 10;
	}
	else if (daysReserved >= 5);{
	discountRate = 20;
}

 double totalAmount = daysReserved * ROOM_CHARGES_PER_DAY;
 double discount = totalAmount * discountRate/100;
 double finalAmount = totalAmount - discount;

System.out.println ("Room charges per day: 48000.0/=");
System.out.println ("Number of days reserved: " + daysReserved);
System.out.println ("Total amount to be paid: " + finalAmount);

}
}
			
		
		
		