////////////////////////////////////////////////////////////////////////////////
//Victoria Rodrigues
//September 16 2014
//CSE 02
//Bicycle
//
//  first compile the program
//      javac Bicycle.java
//  run the program
//      java Bicycle//

//  import the scanner class in order to use it

import java.util.Scanner;

public class Bicycle
{
    public static void main (String [] args) {

    Scanner s=new Scanner(System.in);
    System.out.print("Enter the Number of Seconds: ");
    int seconds = s.nextInt();
    System.out.print("Enter the Number of Counts: ");
    int counts = s.nextInt();


//secsTrip1:number of minutes for each trip
//countsTrip1:the distance of each trip in miles
    
    int secsTrip1=seconds;  //
    int countsTrip1=counts;   //

//double wheelDiameter= diameter of both wheels
//PI= the numeric vaule of pi
//feetPerMile: number of feet in a mile
//inchesPerFoot: number of inches in a foot
//secondsPerMinute: numner of seconds in a minute
//double distanceTrip1: the distance of first trip

    double wheelDiameter=27.0,  //
    PI=3.14159, //
    feetPerMile=5280,   //
    inchesPerFoot=12,   //
    secondsPerMinute=60;    //
    double distanceTrip1;
    distanceTrip1=countsTrip1*wheelDiameter*PI/inchesPerFoot/feetPerMile;  // Converts to distance in miles
    //Above gives distance in inches
    //(for each count, a rotation of the wheel travels
    //the diameter in inches times PI)
    
    System.out.println("The Distance was "+ 
            ((int)(distanceTrip1*100))/100.0+" miles and took "+
            secsTrip1/secondsPerMinute+" minutes.");
    


    //Print out the output data.
    System.out.println ("The average mph was "+ ((int)((distanceTrip1/(secsTrip1/secondsPerMinute/60))*100))/100.0);
        
    }   //end of main method
    
    
    
    
    
    
    
    
}
