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
        String cents;
        System.out.println("Enter your change in cents.");
        cents = input.nextLine();
        
        
        
        
        double Q = 0.25; // QUARTER
        double D = 0.10; // DIME
        double N = 0.05; // NICKEL
        double P = 0.01; // PENNY
        int T = 212; // TOTAL IN CENTS
        
        // CHANGE IN CENTS = 100,000 CENTS
        System.out.println( "Change In Cents:" + T);
        
        System.out.println("Total Amount of Coins:");
        System.out.println("Quarters:" + Q * 32);
        System.out.println("Dimes:" + D * 10);
        System.out.println("Nickels:" + N * 0);
        System.out.println("Pennies:" + P * 200); 
        
        
    }
    
}
