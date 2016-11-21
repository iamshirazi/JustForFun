/*
Name: Matthew Shirazi
Date: Monday November 21, 2016
Version 1.0
Description:
           This program converts a standard time into a traditional time.
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
public class StandardTime {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        String time;
        
        //time = getTime();
        time = "12:34";
        convertHours( time );

    }

    public static String getTime() {

        // OBJECTS 
        Scanner input = new Scanner(System.in);

        // VARIABLES
        String time;

        // INPUT
        System.out.println("Please enter a Standard Time (hh:mm) ");
        time = input.nextLine();

        return time;
    }

    public static int convertHours( String time ) {

        System.out.println( "IN HERE! " + time );
        String standardHours = time.substring( 0, 2 );
        String standardMins = time.substring( 3 );
        
        int traditionalHours = Integer.parseInt( standardHours );
        
        return traditionalHours;
    }

}
