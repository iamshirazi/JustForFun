/*
Name: Matthew Shirazi
Date:  Monday November 14, 2016
Version 1.0
Description:
           This program lets a user enter a compass and then prints it in 
sentence form.

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
public class Compass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // OBJECTS
        Scanner input = new Scanner(System.in);
        boolean validDirection = true;
        String compass;
        String directionOne;
        String directionTwo;

        // INPUT
        System.out.println("Enter Compass: ");
        compass = input.nextLine();

        // OUTPUT 
        String One = compass.substring( 0, 1 );
        String Two = compass.substring( 3 );
        String number = compass.substring( 1 , 3 );
        
            switch (One) {
                case "S":
                    directionOne = "SOUTH";
                    break;
                case "N":
                    directionOne = "NORTH";
                    break;
                case "W":
                    directionOne = "WEST";
                    break;
                case "E":
                    directionOne = "EAST";
                    break;
                default:
                    validDirection = false;
                    directionOne = "";
                    break;
            }
            switch (Two) {
                case "S":
                    directionTwo = "SOUTH";
                    break;
                case "N":
                    directionTwo = "NORTH";
                    break;
                case "W":
                    directionTwo = "WEST";
                    break;
                case "E":
                    directionTwo = "EAST";
                    break;
                default:
                    validDirection = false;
                    directionTwo = "";
                    break;
            }

            if( validDirection == true ) {
                System.out.println("Start facing " + directionOne + ". Turn " + number
                + " degrees " + directionTwo);
                
            } if ( ( "S".equals(directionOne) && "S".equals(directionTwo) ) ||
                   ( "N".equals(directionOne) && "N".equals(directionTwo) ) ||
                   ( "W".equals(directionOne) && "W".equals(directionTwo) ) ||
                   ( "E".equals(directionOne) && "E".equals(directionTwo) ) ) {
                System.out.println("Invalid data. Please try again.");
            }  
            else {
                System.out.println("Invalid data. Please try again.");
            }
            
    }
}