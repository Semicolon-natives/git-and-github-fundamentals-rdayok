import java.util.Scanner;

public class DigitSum{

	public static void main(String[] args){
	
		Scanner userInput = new Scanner(System.in);
		
		System.out.print("Enter a number between 0 and 1000: ");
		int number = userInput.nextInt();
		
		if (number <= 99){
		int a = number % 10;
		int b = number / 10;
		int sum = a + b;
		
		System.out.println("The sum of the degits is "+ sum);
		}
		
		if (number >= 100 && number <= 999){
		int a = number % 10;
		int b = number / 10;
		int c = b % 10;
		int d = b / 10;
		int sum = a + c + d;
		
		System.out.println("The sum of the degits is "+ sum);
		}
		
		if (number == 1000){
		System.out.println("The sum of the degits is "+ 1);
		}
		
	}
}
