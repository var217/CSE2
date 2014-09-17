////////////////////////////////////////////////////////////////////////////////
//Victoria Rodrigues
//September 16 2014
//CSE 02
//Root
//
//  first compile the program
//      javac Root.java
//  run the program
//      java Root//

//  import the scanner class in order to use it

import java.util.Scanner;

public class Root
{
    public static void main (String [] args) {

    Scanner s=new Scanner(System.in);
    System.out.print("Enter a double ");
    double x = s.nextDouble();
    double guess=x/3;
    guess= (2*guess*guess*guess+x)/(3*guess*guess);
    guess= (2*guess*guess*guess+x)/(3*guess*guess);
    guess= (2*guess*guess*guess+x)/(3*guess*guess);
    guess= (2*guess*guess*guess+x)/(3*guess*guess);
    guess= (2*guess*guess*guess+x)/(3*guess*guess);
    
    System.out.println(guess);
    System.out.println(guess*guess*guess);
    
    }
    
}

    
    