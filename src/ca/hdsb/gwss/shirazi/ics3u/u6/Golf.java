/*
Name: Matthew Shirazi
Date: Monday November 29, 2016
Version 1.0
Description:
           This program records the scores for a round of 18 holes of golf.

 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.hdsb.gwss.shirazi.ics3u.u6;

import java.util.Scanner;

/**
 *
 * @author 1shirazimat
 */
public class Golf {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] data = new int [5];
        data[0] = 9;
        data[1] = -12;
        data[2] = 6;
        data[3] = 3;
        data[4] = -10;
        
        int sum = sum(data);
        System.out.println("Sum: " + sum);
        
//
//        // OBJECTS
//        Scanner input = new Scanner(System.in);
//
//        int[] scores = new int [5];
//        data[0] = 9;
//        data[1] = -12;
//        data[2] = 6;
//        data[3] = 3;
//        data[4] = -10;
//
//       // for (int counter = 0; counter < scores.length; counter++) {
//          //  System.out.println("Score on Hole " + (counter + 1) + " : ");
//           // scores[counter] = input.nextInt();
//        
//        int maxScore = scores[0];
//        for (int counter = 0; counter < scores.length; counter++) {
//            if (scores[counter] > maxScore) {
//                maxScore = scores[counter];
//            }
//        }
//        System.out.println("Max Score: " + maxScore);
    }
    
//    public static int min( int[] data  ) {
//        
//        int minValue = data[0];
//        for (int counter = 0; counter < data.length; counter++) {
//            if (data[counter] < minValue) {
//                minValue = data[counter];
//            }
//        }
//        return minValue;
//    }  
//    
    public static int sum( int[] data) {
        
    int sum = 0;
        for (int counter = 0; counter < data.length; counter++) {
            sum = ( sum + data[counter] );
        }         
    return sum;    
}
    
}