/*
Name: Matthew Shirazi
Date:  Wednesday November 2, 2016
Version 1.0
Description:
           This program will determine when the animal population will outgrow
the food supply.
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.hdsb.gwss.shirazi.ics3u.u4;

import java.util.Scanner;

/**
 *
 * @author 1shirazimat
 */
public class LabAnimals {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // OBJECTS
        Scanner input = new Scanner(System.in);

        // VARIABLES
        int startingAnimals;
        int startingFood;
        int foodAdded;
        int endingFood;
        int endingAnimals;
        int hours = 1;
        
        // GET POPULATION AND FOOD FROM USER
        System.out.println("Enter The Initial Population.");
        startingAnimals = input.nextInt();
        System.out.println("Enter The Initial Food Supply.");
        startingFood = input.nextInt();
        System.out.println("Enter The Amount of Food to Add Each Hour.");
        foodAdded = input.nextInt();
        
        // PROCESSING
        endingFood = (startingFood - startingAnimals) + foodAdded;
        endingAnimals = startingAnimals * 2;
        
        // INVALID DATA
        if ( startingAnimals <= 0 || startingFood <= 0 || foodAdded <= 0 ) {
        System.out.println("Invalid Data, please try again.");
        } else {
        // OUTPUT IN TABLE FORM
        System.out.format("%6s %18s %15s %12s %16s\n", "Hours", "| Animals At Start",
                "| Food At Start", "| Food At End", "| Animals At End");
     
        // VALID DATA
        while ( startingFood > startingAnimals ) {
            System.out.format("%4s %14s %16s %14s %14s\n", hours, startingAnimals,
            startingFood, endingFood, endingAnimals);
            
            hours++;
            startingFood = endingFood;
            startingAnimals = 2 * startingAnimals;
            endingFood = (startingFood - startingAnimals) + foodAdded;
            endingAnimals = startingAnimals * 2;

        }
      }
    }

}
