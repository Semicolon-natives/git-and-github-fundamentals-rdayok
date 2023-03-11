import java.util.Scanner;

public class Interest {

	public static void main(String[] args){
	
		Scanner userInput = new Scanner(System.in);
		
		System.out.print("Enter balance and interest rate (e.g., 3 for 3%): ");
		double balance = userInput.nextDouble();
		double interestRate = userInput.nextDouble();
		
		double interest = balance * (interestRate / 1200);
		
		System.out.println("The interest rate is: "+ interest);
		
	}
}
