import java.util.Scanner;

public class CostOfDriving{
	
	public static void main(String[] args){
		
		Scanner userInput = new Scanner(System.in);
		
		System.out.print("Enter the driving distance: ");
		double distance = userInput.nextDouble();
		
		System.out.print("Enter miles per gallon: ");
		double gallon = userInput.nextDouble();
		
		System.out.print("Enter price per gallon: ");
		double price = userInput.nextDouble();
		
		double cost = ( distance / gallon ) * price;
		
		System.out.println("The cost of driving is "+ cost);
	}
}
