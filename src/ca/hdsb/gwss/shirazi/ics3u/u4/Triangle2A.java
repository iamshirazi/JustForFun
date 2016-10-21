/*
Name: Matthew Shirazi
Date:  Friday October 21, 2016
Version 1.0
Description:
            This program will determine whether you can make a triangle or not
with 3 side lengths.

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
public class Triangle2A {

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

// CODE TO DETERMINE IF A TRIANGLE CAN BE MADE
        if (sideLengthA <= 0 || sideLengthB <= 0 || sideLengthC <= 0) {
            System.out.println("INVALID DATA.");
        } else if ((sideLengthA + sideLengthB) > sideLengthC
                && (sideLengthB + sideLengthC) > sideLengthA
                && (sideLengthA + sideLengthC) > sideLengthB) {
            System.out.println("These side lengths can make a triangle.");
         
        } else {
            System.out.println("These side lengths cannot make a triangle.");
        }
    }

}
