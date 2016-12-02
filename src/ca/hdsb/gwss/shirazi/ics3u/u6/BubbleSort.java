/*
Name: Matthew Shirazi
Date: Friday December 2, 2016
Version 1.0
Description:

 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.hdsb.gwss.shirazi.ics3u.u6;

/**
 *
 * @author 1shirazimat
 */
public class BubbleSort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int[] data = new int[]{10, 100, 999, 543, 25, 192, 459, 632, 1, 290};

        System.out.format("%12s %2s %11s\n", "Before Swap", "|", "After Swap");
        beforeBubbleSort(data);
        swap(data);
    }

    public static void beforeBubbleSort(int[] data) {

        for (int c = 0; c < data.length; c++) {
            System.out.println( "     " + data[c] );
        }
    }

    public static void swap(int data[]) {

        for (int pass = 0; pass < data.length - 2; pass++) {

            for (int c = 0; c < data.length; c++) {
                
            int swap;
                
            if (data[c] > data[c+1]) {
                swap = data[c];
                data[c] = data[c+1];
                data[c+1] = swap;
                
                swap++;
        }
      }
    }
  }
}
