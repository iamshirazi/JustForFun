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
 
  double N;
  
        System.out.println("Enter a three digit number.");
        N = input.nextDouble(); // NUMBER IS 123
        
         double H;
         double T;
         double O;
         
        System.out.println("The Hundreth Place Digit is:");
        System.out.println( Math.abs( (N / 100 ) +10 )); 
        
        System.out.println("The Tens Place Digit is:");
        System.out.println( Math.abs(( N / 10 ) % 10 ));
        
        System.out.println("The Ones Place Digit is:");
        System.out.println( Math.abs(( N / 10) )); 
         
         
    }
    
}
