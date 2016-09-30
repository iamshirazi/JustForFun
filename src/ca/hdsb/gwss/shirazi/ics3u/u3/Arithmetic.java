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
public class Arithmetic {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner input = new Scanner( System.in );
        String numbers;
        System.out.println("Are There Any Numbers You Want Me To Add?");
        numbers = input.nextLine();
        
        int a = 10;
        int b = 20;
        
        System.out.println("The Total Is:");
        System.out.println( Math.abs( a + b)); // SUM IS 30
        
        System.out.println("Would you like to see the difference of 10 and 20?");
        numbers = input.nextLine();
        System.out.println("The Difference Is:");
        System.out.println( a % b ); // DIFFERENCE IS 10

        System.out.println("Would you like to see the product of 10 and 20?");
        numbers = input.nextLine();
        System.out.println("The Product Is:");
        System.out.println( a * b ); // PRODUCT IS 200
        
        System.out.println("Would you like to see the absolute value of 20?");
        numbers = input.nextLine();
        System.out.println(" The Absolute Value Is:");
        System.out.println( Math.abs( b )); // THE ABSOLUTE VALUE IS 20
        
        System.out.println("Would you like to see the absolute value of 10?");
        numbers = input.nextLine();
        System.out.println(" The Absolute Value Is:");
        System.out.println( Math.abs( a )); // THE ABSOLUTE VALUE IS 10
     //l   
    }
    
}
