/*
Name: Matthew Shirazi
Date: Tuesday December 6, 2016
Version 1.0
Description:
           This program sorts the random array of numbers in order from least to
greatest using the Selection Sort method.
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.hdsb.gwss.shirazi.ics3u.u6;

/**
 *
 * @author 1shirazimat
 */
public class SelectionSort {

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
        selectionSort(data);
        System.out.print("Data After Swapping:");
        display(data);
    }

    public static void selectionSort(int[] data) {
        
       // VARIABLES
        int swaps = 0;
        int comps = 0;
        int indexMaxValue;

        // DETERMINES MAX VALUE
        for (int pass = 0; pass < data.length-1; pass++) {
            indexMaxValue = 0;
            for (int z = 1; z < data.length - pass; z++) {
                comps++;
                if (data[indexMaxValue] < data[z]) {
                    indexMaxValue = z;
                }
            }
            // SWAP
            swaps++;
            swap( data, indexMaxValue, data.length - 1 - pass );            
        }
        System.out.println( "SWAPS: " + swaps + " COMPARISONS: " + comps );
    }

    public static void swap(int[] data, int i, int j) {
        int swap = data[i];
        data[i] = data[j];
        data[j] = swap;
    }

    public static void display(int[] data) {

        for (int c = 0; c < data.length; c++) {
            System.out.print(" " + data[c]);
        }
        System.out.println();
    }
}