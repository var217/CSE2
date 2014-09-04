////////////////////////////////////////////////////////////////
//Victoria Rodrigues
//September 4 2014
//CSE 02
//Cyclometer 
//
//  first compile the program
//      javac Cyclometer.java
//  run the program
//      java Cyclometer//

//  define a class
public class Cyclometer {
    //main method required for every Java program
    public static void main (String [] args) {

//secsTrip1:number of minutes for each trip
//secsTrip2:number of counts for each trip
//countsTrip1:the distance of each trip in miles
//countsTrip2:distance for the two trips combined
    
    int secsTrip1=480;  //
    int secsTrip2=3220; //
    int countsTrip1=1561;   //
    int countsTrip2=9037;  //

//double wheelDiameter= diameter of both wheels
//PI= the numeric vaule of pi
//feetPerMile: number of feet in a mile
//inchesPerFoot: number of inches in a foot
//secondsPerMinute: numner of seconds in a minute
//double distanceTrip1: twice the distance of first trip
//distanceTrip2: distance of second trip
//totalDistance: distance of trip 1 and trip 2

    double wheelDiameter=27.0,  //
    PI=3.14159, //
    feetPerMile=5280,   //
    inchesPerFoot=12,   //
    secondsPerMinute=60;    //
    double distanceTrip1, distanceTrip2, totalDistance; 
    
    System.out.println("Trip 1 took "+ 
            (secsTrip1/secondsPerMinute)+" minutes and had "+
            countsTrip1+" counts.");
    System.out.println("Trip 2 took "+
            (secsTrip2/secondsPerMinute)+" minutes and had "+
            countsTrip2+" counts.");
    
    distanceTrip1=countsTrip1*wheelDiameter*PI;
    //Above gives distance in inches
    //(for each count, a rotation of the wheel travels
    //the diameter in inches times PI)
    distanceTrip1/=inchesPerFoot*feetPerMile;  // Converts to distance in miles
    distanceTrip2=countsTrip2*wheelDiameter*PI/inchesPerFoot/feetPerMile;
    totalDistance=distanceTrip1+distanceTrip2;
    
    //Print out the output data.
    System.out.println ("Trip 1 was "+distanceTrip1+" miles");
    System.out.println ("Trip 2 was "+distanceTrip2+" miles");
    System.out.println ("The total distance was "+totalDistance+" miles");
        
    }   //end of main method
}   //end of class
