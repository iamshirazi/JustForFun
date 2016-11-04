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
    int coins = 50;
    double randomRealNumber;
    int die;

    // ASKS USER IF THEY WANT TO PLAY
    System.out.println("Welcome to Shirazi's Casino!");
    
    
    do {
        System.out.println("Would you like to play? Press 'Y' for yes or 'N' for no.");
        choice = input.nextLine();
        choice = choice.toLowerCase();
    } while( !choice.equals( "y" ) && !choice.equals( "n" ) );
    
    if ( choice.equals( "n" ) ) {
            // THEY PRESSED N
            System.out.println( "Thank you for playing, have a nice day." );
            
    } if ( choice.equals( "y" ) ) {
            // THEY PRESSED Y
       
            System.out.println( "ROLLING..." );
        randomRealNumber = Math.random();   
        die = (int) ( Math.random() * 6 ) + 1;
        System.out.println( die );
            
    }
  }
}