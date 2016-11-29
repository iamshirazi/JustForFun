/*
Name: Matthew Shirazi
Date: Friday November 25, 2016
Version 1.0
Description:
           The user plays rock paper scissors with the computer and this program
determines who wins.
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.hdsb.gwss.shirazi.ics3u.u5;
import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author Matthew
 */
public class RockPaperScissors {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    // OBJECTS
    String outcome;    
        
    // VARIABLES
    int choice;
    int computer;
    int wins = 0;
    int losses = 0;
    int ties = 0;
        
    // INPUT
    for ( int round = 0; round <= 10; round++ ) {
    choice = getThrowFromUser(); 
    
    // COMPUTER'S CHOICE
    computer = generateRockPaperScissor();
    System.out.println("Computer's choice:" + computer);
    
    // OUTCOME
    outcome = determineOutcome( choice, computer, wins, losses, ties );
    System.out.println( outcome );    
    }
    }
    public static int getThrowFromUser() {
     
    // OBJECTS
    Scanner input = new Scanner(System.in);   
    
    // VARIABLES
    int choice;
    
    // INPUT 
    do {
        System.out.println("Press 1 for Rock, 2 for Paper, or 3 for Scissors.");
        choice = input.nextInt();
    } while( choice != 1 && choice != 2 && choice != 3 );

    return choice;
    }
    public static int generateRockPaperScissor() {
        
    // OBJECTS
    Random number = new Random();
    
    // VARIABLES
    int computer;
    
    // PROCESSING
    computer = number.nextInt(3) + 1;
    
    return computer;    
    }
    public static String determineOutcome( int choice, int computer, int wins, int losses, int ties ) {
    
    // OBJECT
    String outcome;    
        
    // OUTPUT   
    if ((computer == 2 && choice == 1) || (computer == 1 && choice == 3 ) ||
       (computer == 3 && choice == 2)) {
        outcome = ("You Lose!");
        losses = losses + 1;
    }
    else if ((choice == 2 && computer == 1) || (choice == 1 && computer == 3) ||
        (choice == 3 && computer == 2)) {
        outcome = ("You Win!");
        wins = wins + 1;
    } 
    else {
        outcome = ("It's a Tie!");
        ties = ties + 1;
    }
    System.out.println("Wins:" + wins);
    System.out.println("Losses:" + losses);
    System.out.println("Ties:" + ties);
    
    return outcome;
  }
}