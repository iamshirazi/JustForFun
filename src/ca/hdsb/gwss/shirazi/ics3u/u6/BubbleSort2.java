/*
Name: Matthew Shirazi
Date: Wednesday December 7, 2016
Version 1.0
Description:

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
public class BubbleSort2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int[] data = new int[100];
        for (int c = 0; c < data.length - 1; c++) {
            data[c] = (int) (Math.random() * 1000) + 1;
        }
        
        System.out.print("Data Before Swapping:");
        display(data);
        bubbleSort(data);
        System.out.print("Data After Swapping:");
        for( int i = 0; i < data.length; i++ ) {
            System.out.println(data[i] + " - The value is at: " + linearSearch( data, data[i] ) );
        }
        System.out.println("The value is at: " + linearSearch( data, 0 ) );
    }

    public static int linearSearch(int[] data, int searchValue) {

        int location = -1;

        // PROCESSING
        for (int a = 0; a < data.length; a++) {
            if (data[a] == searchValue) {
                location = a;
                a = data.length;
            }
        }
        return location;
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
                    swap(data, c, c + 1);
                }
            }
        }
        System.out.println("SWAPS: " + swaps + " COMP: " + comps);
    }

    public static void swap(int[] data, int i, int j) {
        int swap = data[i];
        data[i] = data[j];
        data[j] = swap;
    }
}
