/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.hdsb.gwss.shirazi.ics3u.u7;

import java.io.File;
import java.util.Scanner;

/**
 *
 * @author 1shirazimat
 */
public class RandomNumbers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        File file = new File("numbers.txt");
        Scanner input = new Scanner(file);
        
        int n = 0;
        int[] data = new int[n];
        int i = 0;
        input = new Scanner(file);
        while (input.hasNext()) {
            data[i] = Integer.parseInt(input.nextLine());
            n++;
            input.nextLine();
        }
        
    }
    
}
