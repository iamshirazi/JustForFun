/*
// Matthew Shirazi
   October 14, 2016
   Activity: Discount.java 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.hdsb.gwss.shirazi.ics3u.u4;

import java.text.NumberFormat;
import java.util.Scanner;

/**
 *
 * @author 1shirazimat
 */
public class Discount {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        NumberFormat money = NumberFormat.getCurrencyInstance();

        String numbers;

        // VARIABLES
        double A; // AMOUNT OF PURCHASES
        double P = 10.00; // DISCOUNT MINIMUM
        double D = 0.1; // DISCOUNT PERCENT

        // INPUT
        System.out.println("Enter Amount of Purchases in Dollars.");
        A = input.nextDouble();

        // PROCESSING
        double T = Math.abs(A - (A * D));

        // OUTPUT
        // INVALID DATA
        if (A <= 0) {
            System.out.println("Invalid Amount.");
        } else {
            // VALID DATA
            if (A >= P) {
                System.out.println("Discounted Price is: " + money.format(T));
            }
            if (A < 10 && A > 0) {
                System.out.println("Total Price is: " + money.format(A));
            }
        }
    }
}
