/*
Name: Matthew Shirazi
Date: Spetember 28, 2016
Version 1.0
Description:
            Created for random testing. 

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
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // MATH CODES
        System.out.println( 10 % 3);
        System.out.println( 11 % 3);
        System.out.println( Math.sqrt( 25 ) );
        System.out.println( Math.abs( 25 ) );
        System.out.println( Math.floor( 25.9 ) );
        System.out.println( Math.ceil( -1.999 ) );
        System.out.println( Math.ceil( 1.05 ) );
        System.out.println( Math.sin( 30 ) );   //WRONG, IT USES RADIUNS
        System.out.println( Math.round( 1.5 ) );
        System.out.println( Math.random( ) );
        System.out.println( Math.pow( 2 * 10, 4 ) );
        
        //CONSTANTS
        
        
        
        //VARIABLES
        
        int age = 16;
        String name;
        double subSubtotal;
        subSubtotal = 0.65;
                
        //OBJECTS
        
        Scanner input = new Scanner( System.in );
        
        
        //EXAMPLE
        
        System.out.println("What is your last name?");
       name = input.nextLine();
        
       System.out.println("Hello " + name);
       
       System.out.println("What is your age?");
       age = input.nextInt();
       System.out.println( age + "! Wow, you're young!" );
   
       
    }
       
  }