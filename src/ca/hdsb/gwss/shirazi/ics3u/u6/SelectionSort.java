/*
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
       // display(data);
        System.out.println("______________________________________");
       // selectionSort(data);
        System.out.print("Data After Swapping:");
       // display(data);
    }
    
    public static void selectionSort( int[] data ) {
        
        int swap = 0;
        int maxValue = 0;
        
        for (int pass = 0; pass < data.length; pass++) {
            for (int z = 0; z < data.length; z++) {
                
            
                
            }
        }   
    }
}
