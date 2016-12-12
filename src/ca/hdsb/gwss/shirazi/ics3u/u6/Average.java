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
public class Average {

    /**
     * @param args the command line arguments
     */
    public static void main( String[] args ) {
    
        double[] data = new double [5];
        data[0] = 6;
        data[1] = 8;
        data[2] = 2;
        data[3] = 9;
        data[4] = 10;
        //10
        
        
        double averageValue = averageDouble(data);
        System.out.println("Average: " + averageValue);
    }
        
    public static double averageDouble( double[] data  ) {
        double sum = 0;       
        for (int counter = 0; counter < data.length; counter++) {
             sum  = (sum + data[counter]); 
        }
        double average = sum / (data.length);
        
        return average;
    }  
    }
