/*
Name: Matthew Shirazi
Date: Thursday December 1, 2016
Version 1.0
Description:
           Swaps numbers and puts them in order from lowest to highest using the
Bubble Sort method.
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

        int[] data = new int[10];
        for (int c = 0; c < data.length - 1; c++) {
            data[c] = (int) (Math.random() * 1000) + 1;
        }
        System.out.print("Data Before Swapping:");
        display(data);
        System.out.println("______________________________________");
        bubbleSort(data);
        System.out.print("Data After Swapping:");
        display(data);
    }

    public static void display(int[] data) {
    
        for (int c = 0; c < data.length; c++) {
            System.out.print(" " + data[c]);

        }
        System.out.println();
    }

    public static void bubbleSort(int[] data) {
        int swaps = 0;
        int comps = 0;
        for (int pass = 0; pass < data.length - 1; pass++) {
            for (int c = 0; c < (data.length - 1) - pass; c++) {
                comps++;
                if (data[c] > data[c + 1]) {
                    swaps++;
                    swap( data, c, c+1 );
                }
            }
        }
        System.out.println( "SWAPS: " + swaps + " COMP: " + comps );
    }
    
    public static void swap(int[] data, int i, int j) {
        int swap = data[i];
        data[i] = data[j];
        data[j] = swap;
    }
}