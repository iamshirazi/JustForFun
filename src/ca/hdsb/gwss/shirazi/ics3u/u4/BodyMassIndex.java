/*
Name: Matthew Shirazi
Date:  Friday October 21, 2016
Version 1.0
Description:
           This program calculates your body mass index.

 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.hdsb.gwss.shirazi.ics3u.u4;

import java.util.Scanner;
import java.text.NumberFormat;

/**
 *
 * @author 1shirazimat
 */
public class BodyMassIndex {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

// VARIABLES
        double height = 0, weight = 0, bmi = 0;
        int choice;

        // OBJECT
        Scanner input = new Scanner(System.in);
        NumberFormat decimal = NumberFormat.getIntegerInstance();
        decimal.setMinimumFractionDigits(2);
        decimal.setMaximumFractionDigits(2);

        // KILOGRAMS OR POUNDS?
        System.out.println("Press 1 for a BMI in Metric or press 2 for a BMI in Imperial.");
        choice = input.nextInt();
        
        if (choice > 2 || choice < 1) {
        System.out.println("Cannot compute. Please choose 1 for Metric or 2 for Imperial.");
            
            } if (choice == 1) {
            // GET HEIGHT AND WEIGHT FROM USER
            System.out.println("What is your Height in Metres?");
            height = input.nextDouble();

            System.out.println("What is your Weight in Kilograms?");
            weight = input.nextDouble();

            // INVALID DATA (METRIC)
            if (height > 2.72 || weight > 442 || height <= 0 || weight <= 0) {
                System.out.println("INVALID DATA.");
            } else {

            // CALCULATE BMI (METRIC)
            bmi = Math.abs(weight / (height * height));
            System.out.println("Your BMI is: " + decimal.format(bmi));
        }
        } else if (choice == 2) {
            // GET HEIGHT AND WEIGHT FROM USER
            System.out.println("What is your Height in Inches?");
            height = input.nextDouble();

            System.out.println("What is your Weight in Pounds?");
            weight = input.nextDouble();

            // INVALID DATA (IMPERIAL)
            if (height > 108 || weight > 975 || height <= 0 || weight <= 0) {
                System.out.println("INVALID DATA.");
            } else {

            // CALCULATE BMI
            bmi = Math.abs((weight * 703) / (height * height));
            System.out.println("Your BMI is: " + decimal.format(bmi));
            }
            // DECIDES YOUR HEALTH
            } if ( (choice == 1 && height <= 2.72 && weight <= 442 && height > 0
                    && weight > 0) || (choice == 2 && height <= 108 && weight 
                    <= 975 && height > 0 && weight > 0 ) ) {
              if (bmi < 16) {
                System.out.println("Your category is: Starvation.");
            } else if (bmi < 18 && bmi >= 16) {
                System.out.println("Your category is: Underweight.");
            } else if (bmi <= 24 && bmi >= 18) {
                System.out.println("Your category is: Ideal.");
            } else if (bmi <= 30 && bmi > 24) {
                System.out.println("Your category is Overweight.");
            } else if (bmi <= 40 && bmi > 30) {
                System.out.println("Your category is: Obese.");
            } else if (bmi > 40) {
                System.out.println("Your category is: Morbidly Obese.");
            }
    }
    }
    }