/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.hdsb.gwss.shirazi.ics3u.u7;

import ca.hdsb.gwss.shirazi.ics3u.u6.ArrayUtil;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author 1shirazimat
 */
public class RandomNumbers {

    /**
     * @param args the command line arguments
     * @throws java.io.FileNotFoundException
     */
    public static void main(String[] args) throws FileNotFoundException {

        File file = new File("numbers.txt");
        PrintWriter output = new PrintWriter( file );
        
        for (int c = 0; c < 100; c++) {            
            output.println( (int) (Math.random() * 1000) );            
        }                
        output.close();
        
        
        Scanner input = new Scanner( file );
        
        int n = 0;
        while( input.hasNext() ) {
            n++;
            input.nextLine();        
        }
        
        System.out.println( "Numer of Numbers: " + n );
        
        int[] data = new int[n];
        input = new Scanner( file );
        
        n = 0;
        while( input.hasNext() ) {
            data[n] = Integer.parseInt( input.nextLine() );
            n++;      
        }
        ArrayUtil.display(data);
    }
}