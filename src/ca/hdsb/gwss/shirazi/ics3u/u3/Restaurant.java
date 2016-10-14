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
public class Restaurant {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner input = new Scanner( System.in );
    String numbers;
    
    // VARIABLES
    
        double F; // F IS FOR FOOD
        double D; // D IS FOR DRINK
        double T = 1.13; // T IS FOR HST TAX
        
        // INPUT
        
       System.out.println("Enter the Price of Your Food.");
        F = input.nextDouble();
        
        System.out.println("Enter the Price of Your Drink.");
        D = input.nextDouble();
        
        // PROCESSING
        
        double t = Math.abs((F + D) * T );
        
        // OUTPUT
        
        System.out.println("Your Total Comes to: " + t);
              
    }
    
}