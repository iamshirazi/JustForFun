/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.hdsb.gwss.shirazi.ics3u.u3;
import java.util.Scanner;
/**
 *
 * @author Matthew
 */
public class HallCost {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner input = new Scanner( System.in );
    String numbers;
    
    // VARIABLES
    
    double G; // GUESTS
    double C; // COST PER GUEST
    double H = 350; // HALL RENTAL
    String name; // HOST'S NAME
    double T = 1.13; // TAX HST
    
    // INPUT
    
    System.out.println("What is your name?");
    name = input.nextLine(); 
    
    System.out.println("Enter the Number of Guests.");
    G = input.nextDouble(); 
    
    System.out.println("Enter the Cost Per Person in Dollars.");
    C = input.nextDouble();  
    
    // OUTPUT
    
    System.out.println( name + " ,the Cost of the Banquet will be:");
    System.out.println( Math.abs( (H + (G * C) * T ) )); 

         
    }
    
}