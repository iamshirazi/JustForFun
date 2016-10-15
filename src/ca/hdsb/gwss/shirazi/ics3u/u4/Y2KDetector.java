/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.hdsb.gwss.shirazi.ics3u.u4;
import java.util.Scanner;
import java.text.NumberFormat;
/**
 *
 * @author Matthew
 */
public class Y2KDetector {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Scanner input = new Scanner( System.in );
     String age;
  
    NumberFormat number = NumberFormat.getIntegerInstance();
    
    // VARIABLES
    
    int YOB; // YEAR OF BIRTH
    int CY; // CURRENT YEAR
    int C = 2000;
    int LC = 1900;
    
    // INPUT
    
    System.out.println("Enter the Last Two Digits of Your Birth Year.");
    YOB = input.nextInt(); 
    
    System.out.println("Enter the Last Two Digits of the Current Year.");
    CY = input.nextInt(); 
    
    // PROCESSING
    
     if ( YOB >= 100 ) { 
        System.out.println("Invalid Data.");   
        
    } if ( CY >= 100 ) { 
        System.out.println("Invalid Data."); 
        
    } if (YOB <= CY) {
        int Y = Math.abs( YOB - CY );
        System.out.println("Year of Birth: " + YOB);
        System.out.println("Current Year: " + CY);
        System.out.println("Your Age: " + Y);
        
    } else {
        int B = Math.abs( (CY + C) - (YOB + LC) ); 
        System.out.println("Year of Birth: " + YOB);
        System.out.println("Current Year: " + CY);
        System.out.println("Your Age: " + B);
        
    }
    }
}
