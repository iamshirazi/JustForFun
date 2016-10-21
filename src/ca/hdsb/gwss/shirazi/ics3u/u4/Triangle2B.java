/*
Name: Matthew Shirazi
Date:  Friday October 21, 2016
Version 1.0
Description:
            This program is used to determine whether your triangle is a 
right angle triangle or not.

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
public class Triangle2B {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

// VARIABLES
        int sideLengthA;
        int sideLengthB;
        int sideLengthC;

// OBJECT
        Scanner input = new Scanner(System.in);

// GET SIDE LENGTHS FROM USER
        System.out.println("Enter side length A.");
        sideLengthA = input.nextInt();
        System.out.println("Enter side length B.");
        sideLengthB = input.nextInt();
        System.out.println("Enter side length C.");
        sideLengthC = input.nextInt();

// CODE TO DETERMINE IF YOUR TRIANGLE IS A RIGHT TRIANGLE

        if ( sideLengthA <= 0 || sideLengthB <= 0 || sideLengthC <= 0 ) {
            System.out.println("INVALID DATA!");
                }       
        else if ((sideLengthA * sideLengthA) + (sideLengthB * sideLengthB)
                == (sideLengthC * sideLengthC)) {
            System.out.println("These sides will make a right angle triangle.");
        }
        else {
            System.out.println("These sides will NOT make a right angle triangle.");
        }
    }

}
