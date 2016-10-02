/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.hdsb.gwss.shirazi.ics3u.u3;
import java.util.Scanner;
/**
 *
 * @author Matthew
 */
public class StudentAverage {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner input = new Scanner( System.in );
    String name;
    
    // VARIABLES
    
    double S1;
    double S2;
    double S3;
    double S4;
    
    // INPUT
    
    System.out.println("What is Your Full Name?");
    name = input.nextLine(); 
    
    System.out.println("Enter your mark in Subject 1");
    S1 = input.nextDouble(); 
    
    System.out.println("Enter your mark in Subject 2");
    S2 = input.nextDouble(); 
    
    System.out.println("Enter your mark in Subject 3");
    S3 = input.nextDouble(); 
    
    System.out.println("Enter your mark in Subject 4");
    S4 = input.nextDouble(); 
    
    // PROCESSING
    
    double A = Math.abs(( (S1 + S2 + S3 + S4) / 4 ) );
    
    // OUTPUT
    
    System.out.println( name + " , Your Average Mark is: " + A); 
    
    }
    
}
