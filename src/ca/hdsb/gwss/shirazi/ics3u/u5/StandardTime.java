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
        int choice;
        
        choice = StandardOrTraditional();
        if (choice > 2 || choice < 1) {
            System.out.println("INVALID, please try again.");
        } else if (choice == 1 ) {
        time = getStandardTime();
        convertHoursToTraditional( time );
        } else {
            time = getTraditionalTime();
            convertHoursToStandard( time );
        }  
    }
    public static int StandardOrTraditional() {
        
        // OBJECTS 
        Scanner input = new Scanner(System.in);
        
        // VARIABLES
        int choice;
                
        // INPUT
        System.out.println("Press 1 To Convert Standard Time to Traditional or Press 2 for Traditional time to Standard.");
        choice = input.nextInt();
        
        return choice;
    }
    
    public static String getStandardTime() {

        // OBJECTS 
        Scanner input = new Scanner(System.in);

        // VARIABLES
        String time;

        // INPUT
        System.out.println("Please enter a Standard Time (hh:mm) ");
        time = input.nextLine();

        return time;
    }

    public static void convertHoursToTraditional( String time ) {

        // VARIABLES
        boolean pm = false;
        
        // OUTPUT
        String standardHours = time.substring( 0, 2 );
        String standardMins = time.substring( 3 );
        
        int traditionalHours = Integer.parseInt( standardHours );
        int traditionalMins = Integer.parseInt( standardMins );
        
        if ( traditionalHours > 23 || traditionalHours < 0 || traditionalMins > 59 || traditionalMins < 0) {
            System.out.println("INVALID TIME");
        }
        else {
            if ( traditionalHours > 12 ) {
                pm = true;   
                traditionalHours = traditionalHours - 12;
            } 
            if ( traditionalHours == 12 ) {
                pm = true; 
            } 
            if ( traditionalHours == 00 ) {
                traditionalHours = 12;
            } 
            if ( traditionalMins == 0 ) {
                System.out.print("Traditional Hours: " + traditionalHours + ":" + standardMins );
            } 
            else if ( traditionalMins < 10 && traditionalMins > 0 ) {
                System.out.print("Traditional Hours: " + traditionalHours + ":" + standardMins);
            } 
            else if ((traditionalHours <= 23 && traditionalHours > 0) && (traditionalMins <= 59 && traditionalMins >= 0)) {
                System.out.print("Traditional Hours: " + traditionalHours + ":" + standardMins);
            }
            if ( pm ) {
                System.out.println( " PM" );
            } 
            else  {
                System.out.println( " AM" );
            }
        }
    }
    
    public static String getTraditionalTime() {
        
        // OBJECTS 
        Scanner input = new Scanner(System.in);

        // VARIABLES
        String time;

        // INPUT
        System.out.println("Please enter a Traditional Time (hh:mm xx) ");
        time = input.nextLine();

        return time;
    }
    
    public static void convertHoursToStandard( String time ) {
        
        // VARIABLES
        boolean pm = false;
        
        // OUTPUT
                
        String traditionalHours = time.substring( 0, 2 );
        String traditionalMins = time.substring( 3, 5 );
        String amPm = time.substring( 6 );
        
        int standardHours = Integer.parseInt( traditionalHours );
        int standardMins = Integer.parseInt( traditionalMins );
        
        System.out.println("Standard Hours: " + standardHours + ":" + standardMins);
    } 
    
    
    
}
