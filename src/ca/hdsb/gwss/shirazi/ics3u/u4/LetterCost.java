/*
Name: Matthew Shirazi
Date:  Saturday October 22, 2016
Version 1.0
Description:
           This program calculates the cost of sending a first class or second 
class letter depending on its weight.
 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.hdsb.gwss.shirazi.ics3u.u4;
import java.util.Scanner;
import java.text.NumberFormat;
/**
 *
 * @author Matthew
 */
public class LetterCost {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
    // CONSTANTS
    final double FIRST_THIRTY_GRAMS = 0.40;
    final double FIRST_FIFTY_GRAMS = 0.60;
    final double FIRST_HUNDRED_GRAMS = 0.80;
    final double SECOND_THIRTY_GRAMS = 0.30;
    final double SECOND_FIFTY_GRAMS = 0.50;
    final double SECOND_HUNDRED_GRAMS = 0.60;
    
    // VARIABLES
    int choice;
    int grams = 0;
    
    // OBJECTS
    Scanner input = new Scanner(System.in);
    NumberFormat money = NumberFormat.getCurrencyInstance();
    
    // FIRST CLASS OR SECOND CLASS?
    System.out.println("Press 1 for First Class or press 2 for Second Class.");
    choice = input.nextInt();
    
    // INVALID DATA
      if (choice > 2 || choice < 1) {
        System.out.println("Cannot compute. Please choose 1 for First Class or 2 for Second Class.");
    
    // GET MASS OF LETTER FROM USER    
    } if ( choice == 1 ) {
        System.out.println("Enter the mass of the letter in grams.");
        grams = input.nextInt();
        
    // INVALID DATA (FIRST CLASS)
    
    if ( grams < 0 ) {
         System.out.println("Invalid Data");
    }
    }
    // GET MASS FROM USER (SECOND CLASS)
    else if ( choice == 2 ) {
         System.out.println("Enter the mass of the letter in grams.");
         grams = input.nextInt();
    }    
    
    // CALCULATIONS
    
     double everyFirstFiftyGrams = Math.abs( ((grams - 100) / 50) * 0.29);
     double everySecondFiftyGrams = Math.abs( ((grams - 100) / 50) * 0.19);
     
    // DETERMINES THE PRICE OF THE LETTER
    
    if ( choice == 1 && grams > 0 ) { 
    
    if ( grams <= 30 ) {
        System.out.println("The cost of sending the letter is: " + money.format (FIRST_THIRTY_GRAMS) );
    } else if ( grams > 30 && grams <= 50 ) {
        System.out.println("The cost of sending the letter is: " + money.format (FIRST_FIFTY_GRAMS) );
    } else if ( grams > 50 && grams <= 149 ) {
        System.out.println("The cost of sending the letter is: " + money.format (FIRST_HUNDRED_GRAMS) );
    } else if ( grams >= 150 ) {
        System.out.println("The cost of sending the letter is: " + money.format (FIRST_HUNDRED_GRAMS + everyFirstFiftyGrams) );
    }
    }
    
    if ( choice == 2 && grams > 0 ) { 
    
    if ( grams <= 30 ) {
        System.out.println("The cost of sending the letter is: " + money.format (SECOND_THIRTY_GRAMS) );
    } else if ( grams > 30 && grams <= 50 ) {
        System.out.println("The cost of sending the letter is: " + money.format (SECOND_FIFTY_GRAMS) );
    } else if ( grams > 50 && grams <= 149 ) {
        System.out.println("The cost of sending the letter is: " + money.format (SECOND_HUNDRED_GRAMS) );
    } else if ( grams >= 150 ) {
        System.out.println("The cost of sending the letter is: " + money.format (SECOND_HUNDRED_GRAMS + everySecondFiftyGrams) );
    }
    }
    
}
}