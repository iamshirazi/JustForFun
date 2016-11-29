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

    final static int USER_WIN = 1;
    final static int DRAW = 0;
    final static int USER_LOSS = -1;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // OBJECTS
        int outcome;

        // VARIABLES
        int choice;
        int computer;
        int wins = 0;
        int losses = 0;
        int ties = 0;

        // INPUT
        while( wins < 5 && losses < 5 ) {
            System.out.println();
            choice = getThrowFromUser();
            System.out.println();

            // COMPUTER'S CHOICE
            computer = generateRockPaperScissor();
            System.out.println("Computer's choice:" + computer);
            System.out.println();

            // OUTCOME
            outcome = determineOutcome(choice, computer);
            
            switch( outcome ) {
                case USER_WIN:
                    wins++;
                    System.out.println( "You won!" );
                    break;
                case USER_LOSS:
                    losses++;
                    System.out.println( "You lost!" );
                    break;
                case DRAW:
                    ties++;
                    System.out.println( "You Tied" );
                    break;
            }

            System.out.println("Wins:" + wins);
            System.out.println("Losses:" + losses);
            System.out.println("Ties:" + ties);

        }
        System.out.println();
        System.out.println( "The big winner is..." );
        if( wins == 5 ) System.out.println( "You!");
        else System.out.println( "Computer!");
        
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
        } while (choice != 1 && choice != 2 && choice != 3);

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

    public static int determineOutcome(int choice, int computer) {

        // OBJECT
        int outcome;

        // OUTPUT   
        if ((computer == 2 && choice == 1) || (computer == 1 && choice == 3)
                || (computer == 3 && choice == 2)) {
            outcome = USER_LOSS;
        } else if ((choice == 2 && computer == 1) || (choice == 1 && computer == 3)
                || (choice == 3 && computer == 2)) {
            outcome = USER_WIN;
        } else {
            outcome = DRAW;
        }

        return outcome;
    }
}
