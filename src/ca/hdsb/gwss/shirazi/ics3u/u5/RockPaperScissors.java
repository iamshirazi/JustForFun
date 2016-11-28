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
        
    // INPUT
    for ( int counter = 1; counter <= 25; counter++) {
    choice = getWeaponFromUser();  
    
    // COMPUTER'S CHOICE
    computer = generateRockPaperScissor();
    System.out.println("Computer's choice:" + computer);
    // OUTCOME
    outcome = determineOutcome( choice, computer);
    
    System.out.println(outcome);    
    }
    }
    public static int getWeaponFromUser() {
     
    // OBJECTS
    Scanner input = new Scanner(System.in);   
    
    // VARIABLES
    int choice;
    
    // INPUT 
    System.out.println();
    System.out.print("Press 1 for Rock, 2 for Paper, or 3 for Scissors.");
    choice = input.nextInt();
    
    return choice;
    }
    public static int generateRockPaperScissor() {
        
    // OBJECTS
    Random number = new Random();
    
    // VARIABLES
    int computer;
    
    // PROCESSING
    computer = 1 + number.nextInt(3);
    
    return computer;    
    }
    public static String determineOutcome( int choice, int computer ) {
        
    // OBJECTS
    String outcome = "";        

    // VARIABLES
    int wins = 0;
    int losses = 0;
    int ties = 0;
        
    // OUTPUT   
    
    if ((computer == 2 && choice == 1) || (computer == 1 && choice == 3 ) ||
       (computer == 3 && choice == 2)) {
         outcome = ("You Lose.");
         losses = losses + 1;
    }
    else if ((choice == 2 && computer == 1) || (choice == 1 && computer == 3) ||
        (choice == 3 && computer == 2)) {
         outcome = ("You Win!");
         wins = wins + 1;
    } 
    else if ((choice == 1 && computer == 1) || (choice == 2 && computer == 2) ||
         (choice == 3 && computer == 3)) {
         outcome = ("It's a Tie!");
         ties = ties + 1;
    }
    System.out.println("Wins:" + wins);
    System.out.println("Losses:" + losses);
    System.out.println("Ties:" + ties);
    
    return outcome;
  }
}