/*
Name: Matthew Shirazi
Date:  Wednesday October 26, 2016
Version 1.0
Description:
           Claculates number of moose
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.hdsb.gwss.shirazi.ics3u.u4;

/**
 *
 * @author 1shirazimat
 */
public class MooseHerd {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

// VARIABLES
        int population = 20;
        
// COUNT UP        
        for (int t = 0; t <= 25; t++) {
            System.out.println( "Year: " + t + " Population: " + population );
            population = (int) ( 220.0 / ( 1+10*Math.pow(0.83, t+1 ) ) );
        }
// YEARS SUPERVISED


    }

}
