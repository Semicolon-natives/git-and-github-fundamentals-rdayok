import java.util.Scanner;

public class AreaOfTriangle{

	public static void main(String[] args){
		
		Scanner userInput = new Scanner(System.in);
		
		System.out.print("Enter the three points (x1 and y1 of each point) of a Triangle separated by spaces: ");
		
		double x1 = userInput.nextDouble();
		double y1 = userInput.nextDouble();
		double x2 = userInput.nextDouble();
		double y2 = userInput.nextDouble();
		double x3 = userInput.nextDouble();
		double y3 = userInput.nextDouble();
		
		// calculating the sides of triangle
		double side1 = Math.sqrt(Math.pow(x2 -x1, 2) + Math.pow(y2 - y1, 2));
		double side2 = Math.sqrt(Math.pow(x3 - x2, 2) + Math.pow(y3 - y2, 2));
		double side3 = Math.sqrt(Math.pow(x1 - x3, 2) + Math.pow(y1 - y3, 2));
		
		double s = (side1 + side2 + side3)/2;
		
		// calculating are
		double area = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
		
		System.out.println("The area of the triangle is: " + area);
	}
}
