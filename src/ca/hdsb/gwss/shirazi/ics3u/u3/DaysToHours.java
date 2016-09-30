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
public class DaysToHours {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner input = new Scanner( System.in );
    String numbers;
    
    // VARIABLES
    double h;
    
    // INPUT
    System.out.println("Enter The Number of Hours You Would Like Converted.");
        h = input.nextDouble();   
    
    // PROCESSING
    
    double T = h / 24;
    
    
    // OUTPUT
    System.out.println("Total Number of Days:" + T );   
    
    }
    
}
