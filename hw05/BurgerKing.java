////////////////////////////////////////////////////////////////
//Victoria Rodrigues
//September 30 2014
//CSE 02
//Burger King
//
//  first compile the program
//      javac BurgerKing.java
//  run the program
//      java BurgerKing//

//  import the scanner class in order to use it

import java.util.Scanner;

//
//
//add the class and main method
//
//

public class BurgerKing {
    public static void main (String [] args)    {
        Scanner myScanner=new Scanner (System.in);
        String myString="food";
        String myString2="fixins";
        String myString3="soda";
        String myString4="fry";
        System.out.println(
            "Enter a letter to indicate a choice of burger, soda, or fries");
            String food = myScanner.next();
            switch (food)
            {   case "B":
                case "b":
                 String fixins= myScanner.next();
                    switch (fixins)
            {   case "A":
                case "a":
                    System.out.println("You ordered a burger with all the fixins");
                case "C":
                case "c":
                    System.out.println("You ordered a burger with cheese");
                case "N":
                case "n":
                    System.out.println("You ordered a burger with none of the above");
            
                    break;
            }
                case "S":
                case "s":
                    System.out.println("Soda");
                    System.out.println("Do you want Pepsi, Sprite, or Mountain Dew");
                    String soda=myScanner.next();
                    switch(soda)
            {   case "P":
                case "p":
                    System.out.println("You ordered a Pepsi");
                    break;
                case "C":
                case "c":
                    System.out.println("You ordered a Coke");
                    break;
                case "S":
                case "s":
                    System.out.println("You ordered a sprite");
                    break;
                case "M":
                case "m":
                    System.out.println("You ordered a Mountain Dew");
                    break;
            }
                case "F":
                case "f":
                    System.out.println("Do you want a large or small order of fries");
                    String fry=myScanner.next();
                    switch (fry)
            {   case "L":
                case "l":
                    break;
                    System.out.println("You ordered a large fry");
                case "S":
                case "s":
                    break;
           
                    System.out.println("You ordered a small fry");
                    
                    break;
            }
            }
      
            
            
    }
}
            