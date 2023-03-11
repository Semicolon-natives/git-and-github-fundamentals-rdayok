import java.util.Scanner;

public class BMI{
	
	public static void main(String[] args){
	
		Scanner userInput = new Scanner(System.in);
		
		System.out.print("Enter your weight in pounds: ");
		double pounds = userInput.nextDouble();
		
		System.out.print("Enter your height in inches: ");
		double inches = userInput.nextDouble();
		
		double weight = 0.45359237 * pounds;
		double height = 0.0254 * inches;
		
		double bmi = weight / (height * height);
		
		System.out.println("Your BMI is: " + bmi);
	}
	
}
