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
        System.out.println("Enter your change in cents.");
        money = input.nextLine();
        
        
        
        double T; // TOTAL IN CENTS
        double Q = T / 25;
        double D = T / 10; // DIME
        double N = T / 5; // NICKEL
        double P = T / 1; // PENNY
     
         System.out.println("Enter your change in cents.");
        money = input.nextLine();
        
        System.out.println( "Change In Cents:" + T);
        
        System.out.println("Total Amount of Coins:");
        System.out.println("Quarters:" + Q * 32);
        System.out.println("Dimes:" + D * 10);
        System.out.println("Nickels:" + N * 0);
        System.out.println("Pennies:" + P * 200); 
        
        
    }
    
}
