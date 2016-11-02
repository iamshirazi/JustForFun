/*
Name: Matthew Shirazi
Date:  Tuesday November 1, 2016
Version 1.0
Description:
           This program prints the first 20 numbers in the Fibonacci series.
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.hdsb.gwss.shirazi.ics3u.u4;

/**
 *
 * @author Matthew
 */
public class FibonacciSeries {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
    // CONSTANTS
    final int end = 20;
    
    // VARIABLES
    int numberA = 1;
    int numberB = 0;
    int numberC = 1;
    
    // FIBONACCI SEQUENCE OUTPUT
    for ( int start = 0; start < end ; start++  ) {
        System.out.print( numberC +", " );
    
    numberA = numberB;
    numberB = numberC;
    numberC = numberA + numberB;       
    }
  } 
}
