////////////////////////////////////////////////////////////////
//Victoria Rodrigues
//October 14 2014
//CSE 02
//Root
//
//  first compile the program
//      Root.java
//  run the program
//      java Root//
import java.util.Scanner;

public class Root {
	/*
	 * This has to be static since it will be used in the main method (which is static)
	 * This is a double since the end result will be a decimal
	 */
	public static double bisection(double x) {
		// Low is set to 0 by default
		double low = 0;
		double high = 1 + x;
		double middle = high / 2;
		while ((high - low) >= (0.0000001 * (1 + x))) {
			// Square middle and check if it is greater than x
			if ((middle * middle) > x) {
				
				high = middle;
			} else {
				low = middle;
			}
			middle = (high + low) / 2;
		}
		// Return the value of middle to the caller
		return middle;
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		// Ask the user to input a number they want to get the root of
		System.out.println("Please input a number that you want the root of: ");
		// Wait until we get a decimal
		if (s.hasNextBigDecimal()) {
			// Get the input number
			double input = s.nextDouble();
			// Call our bisection() function, send it input, and output what it sends back
			System.out.println("Root: " + bisection(input));
		}
	}
}
