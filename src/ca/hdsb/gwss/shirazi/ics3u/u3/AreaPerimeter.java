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
public class AreaPerimeter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner input = new Scanner( System.in );
    String numbers;
    
    // VARIABLES
        int l;
        int w;
        
        
        // INPUT
        
        System.out.println("Enter the Lenth of a Rectangle in cm. ");
        l = input.nextInt();
        
        System.out.println("Enter the Width of a Rectangle in cm.");
        w = input.nextInt();
          
        // PROCESSING
        
        int A = l * w;
        int P = (2 * l) + (2 * w);
       
        
        // OUTPUT
        
        System.out.println("The Area of the Rectangle is: " + A + "cm^2");
        System.out.println("The Perimeter of the Rectangle is: " + P + "cm");
    }
    
}