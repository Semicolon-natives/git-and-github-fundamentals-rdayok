import java.util.Scanner;

public class Energy{
	public static void main(String[] arga){
		
		Scanner userInput = new Scanner(System.in);
		
		System.out.print("Enter the amount of wate in kilogram: ");
		double m = userInput.nextDouble();
		
		System.out.print("Enter the initial temperature: ");
		double initialTemperature = userInput.nextDouble();
		
		System.out.print("Enter the final temperature: ");
		double finalTemperature = userInput.nextDouble();
		
		double q = m * ( finalTemperature - initialTemperature ) * 4184;
		
		System.out.println("The energy needed is "+ q);
	}
}
