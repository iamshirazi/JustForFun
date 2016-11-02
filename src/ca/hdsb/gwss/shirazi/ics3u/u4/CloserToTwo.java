/*
Name: Matthew Shirazi
Date:  Tuesday November 1, 2016
Version 1.0
Description:
           This program adds numbers that will get closer to two but never reach two.
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.hdsb.gwss.shirazi.ics3u.u4;

/**
 *
 * @author Matthew
 */
public class CloserToTwo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
    // VARIABLES
    double number = 0;
    double secondNumber = 1;

    // OUTPUT OF NUMBERS CLOSER TO TWO
    for ( double total = 1; total < 2 ; ) {
        System.out.println(number + " + " + "1/" + secondNumber + " = " + total );
    
    number = total;    
    secondNumber = secondNumber * 2;
    total = number + (1 / secondNumber);
    }    
        
    }
    
}
