/*
Name: Matthew Shirazi
Date:  Friday November 4, 2016
Version 1.0
Description:
           This program makes a playable slot machine that dtermines how many
coins you have, and asks the user if they want to play or not.
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.hdsb.gwss.shirazi.ics3u.u4;
import java.util.Scanner;

import java.util.Scanner;

/**
 *
 * @author 1shirazimat
 */
public class SlotMachine {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
    // OBJECTS
    Scanner input = new Scanner(System.in);    
        
    // VARIABLES
    String choice;
    double randomRealNumber;
    int dieOne;
    int dieTwo;
    int dieThree;
    int dieFour;

    // ASKS USER IF THEY WANT TO PLAY
    System.out.println("Welcome to Shirazi's Casino!");
    
    
    do {
        System.out.println("Would you like to play? Press 'Y' for yes or 'N' for no.");
        choice = input.nextLine();
        choice = choice.toLowerCase();
    } while( !choice.equals( "y" ) && !choice.equals( "n" ) );
    
    for ( int coins = 50; coins >= 0; coins-- ) {
    if ( choice.equals( "n" ) ) {
            // THEY PRESSED N
            System.out.println( "Thank you for playing, have a nice day." );
            
    } if ( choice.equals( "y" ) ) {
            // THEY PRESSED Y
           
            System.out.println( "ROLLING..." );
        randomRealNumber = Math.random();   
        dieOne = (int) ( Math.random() * 4 ) + 1;
        System.out.println( dieOne );
        
        randomRealNumber = Math.random();   
        dieTwo = (int) ( Math.random() * 4 ) + 1;
        System.out.println( dieTwo );
        
        randomRealNumber = Math.random();   
        dieThree = (int) ( Math.random() * 4 ) + 1;
        System.out.println( dieThree );
        
        if ( (dieOne == 1 && dieTwo == 1 && dieThree == 1 ) ||
             (dieOne == 2 && dieTwo == 2 && dieThree == 2 ) ||
             (dieOne == 3 && dieTwo == 3 && dieThree == 3 ) ||
             (dieOne == 4 && dieTwo == 4 && dieThree == 4 ) ) {
             System.out.println("You WON!");  
             if (  ) {
                 
             }
        }
        
        System.out.println("Would you like to roll again? Press 'Y' for yes and 'N' for no.");
        choice = input.nextLine();
        choice = choice.toLowerCase();
        
       }  
    }
  }
}