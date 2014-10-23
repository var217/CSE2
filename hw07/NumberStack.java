////////////////////////////////////////////////////////////////
//Victoria Rodrigues
//October 21 2014
//CSE 02
//Number Stack
//
//  first compile the program
//      javac NumberStack.java
//  run the program
//      java NumberStack//

//  import the scanner class in order to use it

import java.util.Scanner;

//
//
//add the class and main method
//
//

public class NumberStack {
    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);

        System.out.println("Enter an integer 1-9");

        int nNum = myScanner.nextInt();

        for (int index = 1; index <= nNum; index++) {
            for (int index0 = 1; index0 <= index; index0++) {
                for (int index1 = 1; index1 <= index - 1 + index; index1++) {
                    System.out.print(index);
                }
                System.out.println();
                if (index0 == index) {
                    for (int index1 = 0; index1 <= index - 2 + index; index1++) {
                        System.out.print("_");
                    }
                    System.out.println("");
                }
        
            }
        }
    int index =1;
    int index0=1;
    int index1=1;
    while (index<=nNum){
        index++;
            while(index0<=index){
            index0++;
                while(index1<=- 1+ index){
                index1++;
                System.out.print(index);
                }
                System.out.println();
                if (index0==index) {
                    while(index1<=index - 2 + index) {
                        index1++;
                        System.out.print("_");
                    }
                    System.out.println("");
                }
            }
    }
    
                    }
                }
                
        
    
        
        
        
        
        
                

    
