/*
Name: Matthew Shirazi
Date:  Monday October 31, 2016
Version 1.0
Description:
           Table for ounces and grams
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.hdsb.gwss.shirazi.ics3u.u4;
import java.text.NumberFormat;
/**
 *
 * @author 1shirazimat
 */
public class OunceGrams {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
    // OBJECTS
    NumberFormat decimal = NumberFormat.getNumberInstance(); 
    decimal.setMinimumFractionDigits( 2 );
    decimal.setMaximumFractionDigits( 2 ); 
        
    // VARIABLES
    int start = 1;
    double end = 15;        
    
    // OUTPUT TABLE OF OUNCES AND GRAMS  
    System.out.format("%6s %6s\n", "Ounces" , "Grams");
    
    for ( double ounces = start ; ounces <= end  ; ounces++ ) {
        double grams = Math.abs( 28.35 * ounces); 
            System.out.println( ounces + "     " + decimal.format (grams) ); 
    }
    }
    
}
