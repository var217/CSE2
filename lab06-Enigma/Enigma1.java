////////////////////////////////////////////////////////////////
//Victoria Rodrigues
//October 17 2014
//CSE 02
//Enigma1
//
//  first compile the program
//      Enigma1.java
//  run the program
//      java Enigma1//

/* The user is supposed to enter a number between 0 and 99.
 * The program interprets that as a percentage, converts it to
 * a prorportion and then displays the proportion (out of 1)
 * remaining. It does not always work. Find out when it doesn't
 */

import java.util.Scanner;
public class Enigma1 {
    public static void main(String[] arg) {
        double percent;
        System.out.print("Enter a value for the percent (0, 1,...99)- ");
        double x = ((new Scanner(System.in)).nextDouble());
        System.out.println("You entered " + x + "%");
        System.out.println("The proportion remaining is " + (100-x)/(100);
    }
}

/* Error report: 
 *    (Exlain the error(s) that occur here, in this comment,
 *    and fix the errors)
 *    Hint: What kinds of input are unacceptable? What kinds of
 *        acceptable input don't produce the correct answer?
 *
 *
 *
 *
 */
