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

/**
 *
 * @author 1shirazimat
 */
public class Golf {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int searchValue = 0;
        double[] data = new double [20];
        
        for (int c = 0; c < data.length - 1; c++) {
            data[c] = (double) (Math.random() * 20) + 1;
        }
        System.out.print("Data Before Swapping:");
        display(data);
        selectionSortDoubleBackward(data);
        System.out.print("Data After Swapping:");
        display(data);
        
        
        }  
        
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
//    }
//    
//    public static double minDouble( double[] data  ) {
//        
//        double minValue = data[0];
//        for (int counter = 0; counter < data.length; counter++) {
//            if (data[counter] < minValue) {
//                minValue = data[counter];
//            }
//        }
//        return minValue;
//    }  
////    
////   public static double sumDouble( double[] data) {
////        
////    double sum = 0;
////        for (int counter = 0; counter < data.length; counter++) {
////            sum = ( sum + data[counter] );
////        }         
////    return sum;   
//}
    
//    public static int linearSearch(int[] data, int searchValue) {
//        int location = -1;
//
//        // PROCESSING
//        for (int a = 0; a < data.length; a++) {
//            if (data[a] == searchValue) {
//                location = a;
//                a = data.length;
//            }
//        }
//        return location;
//    }
    
     public static void display(double[] data) {

        for (int c = 0; c < data.length; c++) {
            System.out.print(" " + data[c]);
        }
        System.out.println();
    }
    
    
    public static void selectionSortDoubleBackward(double[] data) {
        
       // VARIABLES
        double swaps = 0;
        double comps = 0;
        int indexMaxValue;

        // DETERMINES MAX VALUE
        for (int pass = 0; pass < data.length-1; pass++) {
            indexMaxValue = 0;
            for (int z = 1; z < data.length - pass; z++) {
                comps++;
                if (data[indexMaxValue] > data[z]) {
                    indexMaxValue = z;
                }
            }
            // SWAP
            swaps++;
            swapDouble( data, indexMaxValue, data.length - 1 - pass );            
        }
        System.out.println( "SWAPS: " + swaps + " COMPARISONS: " + comps );
    }
    
    public static void swapDouble(double[] data, int i, int j) {
        double swap = data[i];
        data[i] = data[j];
        data[j] = swap;
    }
    
}
 

 /* FINISHED SELECTION SORT (INT/ASCENDING)
  * FINISHED SELECTION SORT (DOUBLE/ASCENDING)
  * FINISHED SELECTION SORT (STRING/ASCENDING)
  * FINISHED SELECTION SORT (INT/DESCENDING)
  * FINISHED SELECTION SORT (DOUBLE/DESCENDING)
  * FINISHED SELECTION SORT (STRING/DESCENDING)

  * FINISHED MAX (INT)
  * FINISHED MAX (DOUBLE)

  * FINISHED MIN (INT)
  * FINISHED MIN (DOUBLE)

  * FINISHED AVERAGE (INT)
  * FINISHED AVERAGE (DOUBLE)

  * FINISHED BUBBLE SORT (INT/ASCENDING)
  * FINISHED BUBBLE SORT (DOUBLE/ASCENDING)
  * FINISHED BUBBLE SORT (STRING/ASCENDING)
  * FINISHED BUBBLE SORT (INT/DESCENDING)
  * FINISHED BUBBLE SORT (DOUBLE/DESCENDING)
  * FINISHED BUBBLE SORT (STRING/DESCENDING)

  * FINISHED SUM (INT)
  * FINISHED SUM (DOUBLE)

  * HELP LINEAR SEARCH (INT)
  * HELP LINEAR SEARCH (DOUBLE)
  *

  * HELP BINARY SEARCH (INT/ ASCENDING)
  * HELP BINARY SEARCH (DOUBLE/ ASCENDING)
  * 
  *
  *
  *

  */ 