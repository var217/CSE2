//////////////////////////////////////////////////////////////
//Victoria Rodrigues
//September 6 2014
//CSE 02
//Arithmetic
//
//  first compile the program
//      javac Arithmetic.java
//  run the program
//      java Arithmetic//

//  define a class
public class Arithmetic {
    //add a main method
    public static void main (String [] args) {
    //Number of pairs of socks
    int nSocks=3;
    //Cost per pair of socks
    //('$' is part of the varible name)
    double sockCost$=2.58;
    
    //Number of drinking glasses
    int nGlasses=6;
    //Cost per glass
    double glassCost$=2.29;
    
    //Number of boxes of envelopes
    int nEnvelopes=1;
    //Cost per box of envelopes
    double envelopeCost$=3.25;
    double taxPercent=0.06;
    
    //double totalSockCost$: total cost of socks
    //double totalGlassCost$: total cost of drinking glasses
    //double totalEnvelopeCost$: total cost of Envelopes
    //double totalPurchase$: total cost of purchases before tax
    //double totalPurchaseTax$: total cost of purchase with tax
    double totalSockCost$;
    double totalGlassCost$;
    double totalEnvelopeCost$;
    double totalPurchase$;
    double totalPurchaseTax$;
    
    totalSockCost$=nSocks*sockCost$; //Gives total sock cost without tax
    totalGlassCost$=nGlasses*glassCost$; //Gives total drinking glass cost without tax
    totalEnvelopeCost$=nEnvelopes*envelopeCost$; //Gives total envelope cost without tax
    totalPurchase$=totalSockCost$+totalGlassCost$+totalEnvelopeCost$; //Gives total cost of purchase before taxes
    totalPurchaseTax$=totalPurchase$*taxPercent+totalPurchase$; //Gives total cost of purchase with tax
    System.out.println("Total cost of socks bought is "+
        (nSocks*sockCost$)+" and sales tax was "+(totalSockCost$*taxPercent));
    System.out.println("Total cost of drinking glass bought is "+
        (nGlasses*glassCost$)+"and sales tax was "+(totalGlassCost$*taxPercent));
    System.out.println("Total cost of envelopes bought is "+
        (nEnvelopes*envelopeCost$)+"and sales tax was "+(totalEnvelopeCost$*taxPercent));
    System.out.println("Total cost of purchases before tax is "+
        (totalSockCost$+totalGlassCost$+totalEnvelopeCost$));
    System.out.println("Total cost of purchase with tax is "+
        (totalPurchaseTax$));
    } //end main method
}   //end of class