/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.hdsb.gwss.shirazi.ics3u.u3;

import java.util.Scanner;
/**
 *
 * @author 1shirazimat
 */
public class Change {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
 
        Scanner input = new Scanner( System.in );
        String money;
        
        // VARIABLES
        
        int T; // TOTAL IN CENTS
        int Q = 25; // QUARTER
        int D = 10; // DIME
        int N = 5; // NICKEL
        int P = 100; // PENNY
      
        // INPUT
        
         System.out.println("Enter Your Change in Cents That is Beolw $1.00.");
        T = input.nextInt();
        
        // OUTPUT
        
        System.out.println( "Minimum Change In Cents:");
        System.out.println("Total Amount of Coins:");
        System.out.println("Quarters:" + T / Q);
        System.out.println("Dimes:" + ( T / N) / 2);
        System.out.println("Nickels:" + ( T / N ) / N);
        System.out.println("Pennies:" + (T % D)); 
        
        
    }
    
}