import java.util.Scanner;

public class YearsDays{

	public static void main(String[] args){
	
		Scanner userInput = new Scanner(System.in);
		
		System.out.print("Enter the number of minutes: ");
		int min = userInput.nextInt();
		
		int days = min / 1440;
		int years = days / 365;
		int remainingDays = days % 365;
		
		System.out.println ( min +" minutes is approximately "+ years +" years and "+ remainingDays + " days");
		
	}
}
