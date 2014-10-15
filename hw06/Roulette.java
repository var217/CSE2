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
public class Roulette {
	public static void main(String[] args) {
		// Number of times to gamble
		int num = 1000;
		// Number of times nothing was won
		int nothing = 0;
		// Number of times it was won
		int won = 0;
		// Store our profits
		int profits = 0;
		// Loop until num is equal to 0
		while (num > 0) {
			// Number of roulette spins to do
			int spins = 100;
			// Get a random number. Math.random() is a double usually less than 1.0D so multiply by 100 to get a good integer
			int betNum = (int) (Math.random() * 100);
			// Holds how many times the right number is guessed
			int cameUp = 0; 
			// If betNum is greater than 38 then we need a new random number until it isn't
			while (betNum > 38) {
				// Get a new random number
				betNum = (int) (Math.random() * 100);
			}
			// Loop until spins is equal to 0
			while (spins > 0) {
				// Get the winning number
				int landed = (int) (Math.random() * 100);
				// Do the same as above and make sure it's within 0-38
				while (betNum > 38) {
					// Get a new random number
					landed = (int) (Math.random() * 100);
				}
				// Check if we guessed right
				if (betNum == landed) {
					// If so add one to our counter
					cameUp += 1;
				}
				// Subtract one from spins
				spins--;
			}
			// If the number never came up...
			if (cameUp == 0) {
				// Add one to our "nothing came up" counter
				nothing++;
			
			} else if (cameUp == 1) {
				// Add $36 to the profit
				profits += 36;
			// If it was greater than or equal to 3
			} else if (cameUp >= 3) {
				// Add the number of times it came up multiplied by 36
				profits += cameUp * 36;
			}
			// Subtract one from num
			num--;
		}
		// The number of times it was won is 1000 subtracted by the losing amount
		won = 1000 - nothing;
		// Print out the data line by line
		System.out.println("Lost: " + nothing);
		System.out.println("Won: " + won);
		System.out.println("Profit: $" + profits);
	}
}