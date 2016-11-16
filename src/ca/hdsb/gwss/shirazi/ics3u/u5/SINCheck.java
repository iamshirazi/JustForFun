/*
Name: Matthew Shirazi
Date:  Wednesday November 16, 2016
Version 1.0
Description:
           Checks if a SIN is legit.
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.hdsb.gwss.shirazi.ics3u.u5;

import java.util.Scanner;

/**
 *
 * @author 1shirazimat
 */
public class SINCheck {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // OBJECTS
        Scanner input = new Scanner(System.in);
        String sin = "130692544";
        String sinlength = "";
        int n, sumEven = 0;
        
        // VARIABLES
        int p = 1;
        
        // STEP 1 AND 2
        for (int i = 1; i < 8; i+=2 ) {
            n = Integer.parseInt( sin.charAt(i) + "" );
            n = n * 2;
            if (n > 9) {
                n = n % 10;
                p = n /10;
            }
            sumEven = sumEven + n + p;
            //System.out.println( n );
            
        }
        System.out.println( "Even Sum: " + sumEven);
        
        // STEP 3
    }

}
