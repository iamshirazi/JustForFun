/*
Name: Matthew Shirazi
Date: Monday November 29, 2016
Version 1.0
Description:
           This program gets the high tempurature for each day of the week from
the user and prints them out by with their day.

 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.hdsb.gwss.shirazi.ics3u.u6;
import java.util.Scanner;
/**
 *
 * @author 1shirazimat
 */
public class Tempuratures {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
    // OBJECTS
    Scanner input = new Scanner(System.in);
       
    int[] temps = new int[7];
    
    for (int counter = 0; counter < temps.length; counter++) {
        System.out.println("Temperatures on day " + (counter + 1) + " : ");
        temps[counter] = input.nextInt();
    }
    int total = 0;
    for (int counter = 0; counter < temps.length; counter++) {
        total = temps[counter];
        
    }
    System.out.println(temps);
    }
    
}
