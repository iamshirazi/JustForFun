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
    final double firstThirtyGrams = 0.40;
    final double firstFiftyGrams = 0.60;
    final double firstHundredGrams = 0.80;
    final double secondThirtyGrams = 0.30;
    final double secondFiftyGrams = 0.50;
    final double secondHundredGrams = 0.60;
    
    // VARIABLES
     int choice;
    
    // OBJECTS
    Scanner input = new Scanner(System.in);
    
    // FIRST CLASS OR SECOND CLASS?
    System.out.println("Press 1 for First Class or press 2 for Second Class.");
    choice = input.nextInt();
    
    // INVALID DATA
      if (choice > 2 || choice < 1) {
        System.out.println("Cannot compute. Please choose 1 for First Class or 2 for Second Class.");
    
    // GET MASS OF LETTER FROM USER    
    } if ( choice == 1 ) {
        System.out.println("Enter the mass of the letter in grams.");
    }
    
    
    }
    
}
