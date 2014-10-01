////////////////////////////////////////////////////////////////////////////////
//Victoria Rodrigues
//September 17 2014
//CSE 02
//Big Mac Again
//
//  first compile the program
//      javac BigMacAgain.java
//  run the program
//      java BigMacAgain//

//  import the scanner class in order to use it

import java.util.Scanner;

//
//
//add the class and main method
//
//
public class BigMacAgain    {
    //main method required for every Java program
    public static void main (String [] args)    {
        
       Scanner myScanner = new Scanner ( System.in );
        //can now accept input
        
        //prompts the user for the numner of Big Macs
        System.out.print(
            "Enter the numner of Big Macs : ");
            
        //accept user input & check if input is an integer
        
    int num;
    
        
        if (myScanner.hasNextInt()) {
             num = myScanner.nextInt();
            if (num >= 0) {
            System.out.println(num + " is positive.");
            System.out.println("You ordered" + num*2.22 + " big macs for a cost of" +num +"*2.22="+ ((int)(num*2.22*100))/100.0 );
        }
            else{
            System.out.println("Negative input.");
            return;
        }
        }
            else{
            System.out.println("You did not enter an int");
            return;     //leaves the program
        }
       
            
        
       
        
        System.out.print(
            "Do you want an order of fries (Y/y/N/n)?");
            
            String answer=myScanner.next();
                if (answer.equals("Y") || answer.equals ("y")) {
                System.out.println("You ordered fries at a cost of $2.15");
                System.out.println("The total cost of the meal is $"+ (2.15*num));
                }
                else if (answer.equals ("N") || answer.equals ("n")) {
                System.out.println("The total cost of the meal is $" + (num));
                }
                else {
                    System.out.println("You did not enter one of 'y', 'Y', 'N', 'n'");
                }
            
            
        
    }
}