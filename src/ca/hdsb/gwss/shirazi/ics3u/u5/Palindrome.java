/*
Name: Matthew Shirazi
Date:  Tuesday November 15, 2016
Version 1.0
Description:
           This program determines if a word is a palindrome.
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
public class Palindrome {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // OBJECTS    
        Scanner input = new Scanner(System.in);
        String word;
        String flip = "";

        // GETS WORD FROM USER
        System.out.println("Enter a word please.");
        word = input.nextLine();

        // PROCESSING
        for (int i = word.length() - 1; i >= 0; i--) {
            flip += word.charAt(i);
        } 
            if (word.equals(flip)) {
                System.out.println(word + " backwards is " + flip);
                System.out.println("The word " + word + " is a palindrome.");

            } else {
                System.out.println("The word " + word + " is not a palindrome.");
            }
 }
}
