import java.util.Scanner;

public class InvestmentCalculator {
    
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        
        System.out.print("Enter investment amount: ");
        double investmentAmount = userInput.nextDouble();
        
        System.out.print("Enter annual interest rate (%): ");
        double annualInterestRate = userInput.nextDouble();
        
        System.out.print("Enter number of years: ");
        int numberOfYears = userInput.nextInt();
        
        double monthlyInterestRate = annualInterestRate / 12.0 / 100.0;
        
        double futureInvestmentValue = investmentAmount * Math.pow(1 + monthlyInterestRate, numberOfYears * 12);
        
        System.out.println("Future investment value is: "+ futureInvestmentValue);
    }
    
}

