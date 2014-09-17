////////////////////////////////////////////////////////////////////////////////
//Victoria Rodrigues
//September 16 2014
//CSE 02
//Four Digits
//
//  first compile the program
//      javac FourDigits.java
//  run the program
//      java FourDigits//

//  import the scanner class in order to use it

import java.util.Scanner;

public class FourDigits
{
    public static void main (String [] args)    {
        
    Scanner s=new Scanner(System.in);
    System.out.print("Enter a double ");
    double num=s.nextDouble();
    int numInt=(int)num;
    double decimals=num-numInt;
    decimals*=10000;
    System.out.println((int)decimals);
    
    
    }
    
}