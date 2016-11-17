/*
Name: Matthew Shirazi
Date:  Wednesday November 16, 2016
Version 1.0
Description:
           Checks if a SIN is legit.
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.hdsb.gwss.shirazi.ics3u.u5;

import java.util.Scanner;

/**
 *
 * @author 1shirazimat
 */
public class SINCheck {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // OBJECTS
        Scanner input = new Scanner(System.in);
        String sin;
        String sinlength = "";
        int n, sumEven = 0, sumOdd = 0;
        
        // VARIABLES
        int p = 1;
        
        // GET SIN
        System.out.println("Enter the Social Insurance Number.");
        sin = input.nextLine();
        
        // STEP 1 AND 2
        for (int i = 1; i < 8; i+=2 ) {
            n = Integer.parseInt( sin.charAt(i) + "" );
            n = n * 2;
            if (n > 9) {
                n = n % 10;
                p = n /10;
            }
            sumEven = sumEven + n + p;
            //System.out.println( n );
            
        }
        System.out.println( "Even Sum: " + sumEven);
        
        // STEP 3
        for (int i = 0; i < 8; i+=2 ) {
            n = Integer.parseInt( sin.charAt(i) + "" );
            p = n + n;
            sumOdd = n + p;
            //System.out.println( n );
        }
         System.out.println( "Odd Sum: " + sumOdd);
         
        // STEP 4
        int allSum = sumEven + sumOdd;
        System.out.println( "Total: " + allSum );
        
        // STEP 5
        n = Integer.parseInt( sin.charAt(8) + "" );
        int multiply = n * 10;
        int sumMultiply = multiply - allSum;
        System.out.println( "Subtraction: " + sumMultiply );
        
        if (sumMultiply == n) {
            System.out.println("The SIN is valid. Have a nice day.");
        } else {
            System.out.println("The SIN is INVALID.");
        }
        
        
    }   

}
