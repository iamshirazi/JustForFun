/*
Name: Matthew Shirazi
Date:  Wednesday November 9, 2016
Version 1.0
Description:
            This program allows the user to input a sentence. 
It will count the vowels and output them. 

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
public class CountingVowels {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
    // OBJECTS
    Scanner input = new Scanner(System.in); 
    String sentence;
    String j;
    
    // VARIABLES
    int vowels = 0, length;
    
    // INPUT
    System.out.println("Please enter a sentence.");
    sentence = input.nextLine();
    
    // INITIALIZE LENGTH
    length = sentence.length();
    
    // OUTPUT
    for ( int k = 0; k < length; k++ ) {
    j = sentence.substring(k, k + 1);
    
    if (j.equalsIgnoreCase("a") == true)
    vowels++;
    else if (j.equalsIgnoreCase("e") == true)
    vowels++;
    else if (j.equalsIgnoreCase("i") == true)
    vowels++;
    else if (j.equalsIgnoreCase("o") == true)
    vowels++;
    else if (j.equalsIgnoreCase("u") == true)
    vowels++;    
        
    }
    System.out.println("The sentence has " + vowels + ".");    
    }
    
}
