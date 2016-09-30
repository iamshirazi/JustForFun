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
public class HeronFormula {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner input = new Scanner( System.in );
        
    String points ;
        
    // VARIABLES
    double a;
    double b;
    double c;
    
    // INPUT
    System.out.println("Enter The Length of side a.");
        a = input.nextDouble();   
    System.out.println("Enter The Length of side b.");
        b = input.nextDouble();       
    System.out.println("Enter The Length of side c.");
        c = input.nextDouble();       
        
    // PROCESSING
    
     double s = (a + b +c) /2.0;
        
    // INPUT
    System.out.println("The Area of the Triangle is:");
    System.out.println(Math.sqrt(s*(s-a)*(s-b)*(s-c)));
   
    }
    
}
