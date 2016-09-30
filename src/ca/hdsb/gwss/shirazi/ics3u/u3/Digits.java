/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.hdsb.gwss.shirazi.ics3u.u3;

import java.util.Scanner;
/**
 *
 * @author 1shirazimat
 */
public class Digits {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
    Scanner input = new Scanner( System.in );

 String numbers;
        System.out.println("Enter a three digit number.");
        numbers = input.nextLine(); // NUMBER IS 123
         double N;
         double H;
         double T;
         double O;
         
        System.out.println("The Hundreth Place Digit is:");
        System.out.println( Math.abs( H )); 
        
        System.out.println("The Tens Place Digit is:");
        System.out.println( Math.abs( T ));
        
        System.out.println("The Ones Place Digit is:");
        System.out.println( Math.abs( O )); 
         
         
    }
    
}
