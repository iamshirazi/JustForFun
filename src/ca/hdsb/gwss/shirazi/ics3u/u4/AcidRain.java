/*
Name: Matthew Shirazi
Date:  Wednesday October 19, 2016
Version 1.0
Description:
            This program determines if pH level in water is safe for fish to survive in. 

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
public class AcidRain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // CONSTANTS
        final double PH_ACID_MAX = 6.45;
        final double PH_ACID_MIN = 0;
        final double PH_BASE_MAX = 14;
        final double PH_BASE_MIN = 7.45;

        // VARIABLES
        double acidity;

        // OBJECT
        Scanner input = new Scanner(System.in);

        // GET pH Value from User
        System.out.println("Enter the pH level of the water.");
        acidity = input.nextDouble();

        // CODE TO DETERMINE IF FISH CAN SURVIVE IN A CERTAIN PH LEVEL 
        if (acidity > PH_BASE_MAX || acidity < PH_ACID_MIN) {
            System.out.println("INVALID DATA.");
        } else if (acidity >= PH_ACID_MAX && acidity <= PH_BASE_MIN) {
            System.out.println("NEUTRAL - FISH IN STREAMS, RIVERS AND LAKES WILL SURVIVE.");
        } else if (acidity < PH_ACID_MAX && acidity >= PH_ACID_MIN) {
            System.out.println("TOO ACIDIC - FISH IN STREAMS, RIVERS AND LAKES WILL NOT SURVIVE.");
        } else if (acidity > PH_BASE_MIN && acidity <= PH_BASE_MAX) {
            System.out.println("TOO ALKALINE - FISH IN STREAMS, RIVERS AND LAKES WILL NOT SURVIVE.");
        }
    }

}
