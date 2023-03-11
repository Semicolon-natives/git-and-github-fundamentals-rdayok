import java.util.Scanner;

public class WeightConverter{
	
	public static void main(String[] args){
	
		Scanner userInput = new Scanner(System.in);
		
		System.out.print("Please enter your weight in pounds: ");
		double pounds = userInput.nextDouble();
		
		double kG = 0.454 * pounds;
		
		System.out.println( pounds + " pounds is "+ kG +" kilograms " );
		
	}
}
