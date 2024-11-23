import java.util.Scanner;

public class IT24103913Lab5Q2{
public static void main(String[]args){
	
	Scanner input = new Scanner(System.in);
	
	System.out.print ("Enter the number of new members introduced: ");
	int newMembers = input.nextInt();
	
	if (newMembers < 0){
		System.out.print ("Input must be a number 0 or greater");
	}
	
	
	String prize;
	switch (newMembers){
		
case 0 :
System.out.println("No prize");
return;	


	case 1:
		prize = "Pen";
		break;
		
		case 2:
		prize = "Umbrella";
		break;
		
		case 3:
		prize = "Bag";
		break;
		
		case 4:
		prize = "Travelling chair";
		break;
		
		default:
		prize = "Headphone";
		break;
	}
	
	System.out.println ("Prize is a : " + prize);
	}
}

	