/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.hdsb.gwss.shirazi.ics3u.u7;

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
        
        int size = 0;
        int[] data = new int[size];
        
        for (int c = 0; c < data.length - 1; c++) {
        data[c] = (int) (Math.random() * 1000) + 1;
        }
    //  WRITE NUMBER FILE
        File file = new File("numbers.txt");
        Scanner input = new Scanner(file);
        PrintWriter output = new PrintWriter( file );

        for (int i = 0; i <data.length; i++){
        output.write( data[i] );
        } output.close();
    // READ FILE
        while (input.hasNext()) {
        System.out.println(input.nextLine());
        }
        input.close(); 
    } 
}
