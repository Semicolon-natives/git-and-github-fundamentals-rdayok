import java.util.Scanner;

public class NumberSeparator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a five-digit integer: ");
        int userInput = input.nextInt();

        if (userInput >= 10000) {
            int digit1 = userInput / 10000;
            int digit2 = (digit1 / 1000) % 10;
            int digit3 = (userInput / 100) % 10;
            int digit4 = (userInput / 10) % 10;
            int digit5 = userInput % 10;

            System.out.printf("%d   %d   %d   %d   %d%n", digit5, digit4, digit3, digit2, digit1);
        } 
        
        if (userInput <= 9999) {
            System.out.println("You must enter a five-digit integer.");
        }
    }
}
