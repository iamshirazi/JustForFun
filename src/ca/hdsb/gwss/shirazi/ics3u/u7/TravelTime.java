/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.hdsb.gwss.shirazi.ics3u.u7;

import java.io.File;
import java.io.PrintWriter;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * @author 1shirazimat
 */
public class TravelTime {

    /**
     * @param args the command line arguments
     * @throws java.io.FileNotFoundException
     */
    public static void main(String[] args) throws FileNotFoundException {
    
        File file = new File ("DATA1.txt");
        
        // INPUT
        Scanner input = new Scanner( file );
        
        String lineOne = "03:01:01 10 0";
        StringTokenizer line = new StringTokenizer( lineOne);

        while (line.hasMoreTokens()) {
            System.out.println(line.nextToken());
        }
        
        
        
        
        // OUTPUT
        PrintWriter output = new PrintWriter(file);
        
    }
    
}
