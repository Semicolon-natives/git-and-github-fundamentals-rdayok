import java.util.Scanner;

public class Length{
	public static void main(String[] args){
	
		Scanner userInput = new Scanner(System.in);
		
		System.out.print("Enter speed: ");
		double speed = userInput.nextDouble();
		
		System.out.print("Enter acceleration: ");
		double acceleration = userInput.nextDouble();
		
		double length = Math.pow(speed, 2) / ( 2 * acceleration );
		
		System.out.println("The minimum runway length for this airplane is: "+ length);
	}
}
