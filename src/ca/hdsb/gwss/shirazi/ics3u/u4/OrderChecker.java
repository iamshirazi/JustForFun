/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.hdsb.gwss.shirazi.ics3u.u4;

import java.util.Scanner;
import java.text.NumberFormat;

/**
 *
 * @author Matthew
 */
public class OrderChecker {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String age;

        NumberFormat money = NumberFormat.getCurrencyInstance();

        // VARIABLES
        int B;
        int N;
        int W;
        final double b = 0.05;
        final double n = 0.03;
        final double w = 0.01;

        // INPUT
        System.out.println("Enter the Number of Bolts.");
        B = input.nextInt();

        System.out.println("Enter the Number of Nuts.");
        N = input.nextInt();

        System.out.println("Enter the Number of Washers.");
        W = input.nextInt();

        // PROCESSING
        double P = Math.abs(B * b);
        double C = Math.abs(N * n);
        double Q = Math.abs(W * w);
        double T = Math.abs(P + C + Q);

        // OUTPUT
        System.out.println("Number of Bolts: " + B);
        System.out.println("Number of Nuts: " + N);
        System.out.println("Number of Washers: " + W);

        
        // INVALID DATA
           if( B < 0 || W <0 || N < 0 ) {
          System.out.println("Invalid Data.");
        }
            else {
            // VALID DATA
            if (B < (W / 2)) {
                System.out.println("Check the Order: Too Few Bolts.");
            }
            if (N < B) {
                System.out.println("Check the Order: Too Few Nuts.");
            }
            if (W < (2 * B)) {
                System.out.println("Check the Order: Too Few Washers.");
            }
            if (B == (W * 0.5) && B == N) {
                System.out.println("Order is OK.");
            }

            System.out.println("Total Cost: " + money.format(T));
        }

    }

}
