/*
Name: Matthew Shirazi
Date:  Wednesday October 26, 2016
Version 1.0
Description:
           User enters  2 numbers and the computer counts up or down to the 
larger number

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
public class StartEndFor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

// VARIABLES
        int startValue;
        int endValue;

// OBJECT
        Scanner input = new Scanner(System.in);

// GET NUMBERS FROM USER        
        System.out.println("Enter start value.");
        startValue = input.nextInt();
        System.out.println("Enter end value.");
        endValue = input.nextInt();

// LOOP 1
        System.out.print("Output : ");
        if (endValue >= startValue) {
            for (int a = startValue; a <= endValue; a++) {
                
                System.out.print( a + " " );
            }
        } else {
// LOOP 2
        for (int b = startValue; b >= endValue; b--) {
        System.out.print( b + " " );
            }
        }
    }

}
