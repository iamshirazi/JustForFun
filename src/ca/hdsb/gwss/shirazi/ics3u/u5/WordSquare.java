/*
Name: Matthew Shirazi
Date:  Wednesday November 9, 2016
Version 1.0
Description:
           Lets user enter a word and displays the each letter infront of the
last.

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
public class WordSquare {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // OBJECTS
        Scanner input = new Scanner(System.in);
        String wordString;
        
        // INPUT
        System.out.println("Enter a word, please.");
        wordString = input.nextLine();
        System.out.println( );
        
        // CONVERTS
        wordString = wordString.toUpperCase();

        // OUTPUT
        for (int m = 0; m < wordString.length(); m++) {
            System.out.print( wordString.substring( m ) );
            System.out.println( wordString.substring( 0, m ) );
        }
 }
}