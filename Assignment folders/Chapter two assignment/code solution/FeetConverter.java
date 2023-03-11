import java.util.Scanner;

public class FeetConverter{
	
	public static void main(String[] args){
		
		Scanner userInput = new Scanner(System.in);
		
		System.out.print("Enter a value for feet: ");
		double feet = userInput.nextDouble();
		
		double meters = feet * 0.305;
		
		System.out.println( feet + " feet is "+ meters + " meters ");
	}
}
