////////////////////////////////////////////////////////////////
//Victoria Rodrigues
//September 21 2014
//CSE 02
//Income Tax
//
//  first compile the program
//      javac IncomeTax.java
//  run the program
//      java IncomeTax//

//  import the scanner class in order to use it

import java.util.Scanner;

//
//
//add the class and main method
//
//

public class IncomeTax  {
    //main method required for every Java program
    public static void main (String [] args)    {
        
        Scanner myScanner = new Scanner (System.in);
        
        //prompts user for an int that gives thousands of dollars of income
        System.out.println(
            "Enter an int giving the numner of thousands-" );
            
            if (myScanner.hasNextInt());    {
                int num = myScanner.nextInt();
                
                double tax=0.0;
                if(num<=0)
                {
                    System.out.println("You did not enter a positive int");
                }
                else if (num <20)    {
                tax=num*.05;
                System.out.println("The Tax rate on "+ num*1000+" is 5%, and the tax is "+ tax*1000 +"." );
                }
                else if (num>=20&&num<40)  {
                tax=num*.07;
                System.out.println("The tax rate on "+ num*1000+" is 7%, and the tax is "+ tax*1000+".");
                }
                else if (num>=40&&num<78)  {
                tax=num*.12;
                System.out.println("The tax rate on "+ num*1000+" is 12%, and the tax is "+tax*1000+".");
                }
                else  {
                tax=num*.14;
                System.out.println("The tax rate on "+num*1000+" is 14%, and the tax is "+tax*1000+".");
                }
                }
                
                }
                    
                
}
