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
        
        time = getTime();
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

    public static void convertHours( String time ) {

        // VARIABLES
        boolean pm = false;
        
        // OUTPUT
        String standardHours = time.substring( 0, 2 );
        String standardMins = time.substring( 3 );
        
        int traditionalHours = Integer.parseInt( standardHours );
        int traditionalMins = Integer.parseInt( standardMins );
        
        if ( traditionalHours > 23 || traditionalHours < 0 || traditionalMins > 59 || traditionalMins < 0) {
            System.out.println("INVALID TIME");
        } if ( traditionalHours > 12 ) {
            pm = true;   
            traditionalHours = traditionalHours - 12;
        } if ( traditionalHours == 12 ) {
            pm = true; 
        } if ( traditionalHours == 00 ) {
            traditionalHours = 12;
        } if ( traditionalMins == 0 ) {
            System.out.print(traditionalHours + ":" + traditionalMins + "0");
        } if ( traditionalMins < 10 && traditionalMins > 0 ) {
            System.out.print(traditionalHours + ":0" + traditionalMins);
        } else if ((traditionalHours <= 23 && traditionalHours > 0) && (traditionalMins <= 59 && traditionalMins >= 0)) {
            System.out.print(traditionalHours + ":" + traditionalMins);
        } if ( pm == true ) {
            System.out.println( "PM" );
        } if ( pm == false ) {
            System.out.println( "AM" );
        }
    }  
}
