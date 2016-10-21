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
        double height, weight, bmi = 0;
        int choice;

// OBJECT
        Scanner input = new Scanner(System.in);

// KILOGRAMS OR POUNDS?
        System.out.println("Press 1 for a BMI in Metric or press 2 for a BMI in Imperial.");
        choice = input.nextInt();

        if (choice == 1) {
            // GET HEIGHT AND WEIGHT FROM USER
            System.out.println("What is your Height in Metres?");
            height = input.nextDouble();

            System.out.println("What is your Weight in Kilograms?");
            weight = input.nextDouble();

// CALCULATE BMI
            bmi = Math.abs(weight / (height * height));
            System.out.println("Your BMI is:" + bmi);

        } else if (choice == 2) {
            // GET HEIGHT AND WEIGHT FROM USER
            System.out.println("What is your Height in Inches?");
            height = input.nextDouble();

            System.out.println("What is your Weight in Pounds?");
            weight = input.nextDouble();
            // CALCULATE BMI
             bmi = Math.abs((weight * 703) / (height * height));
            System.out.println("Your BMI is:" + bmi);

        }

        // DECIDES YOUR HEALTH
        if (bmi < 16) {
            System.out.println("Your category is Starvation.");
        }
        else if (bmi < 18 && bmi >= 16) {
            System.out.println("Your category is Underweight.");
        }
        else if (bmi <= 24 && bmi >= 18) {
            System.out.println("Your category is Ideal.");
        }
        else if (bmi <= 30 && bmi > 24) {
            System.out.println("Your category is Overweight.");
        }
        else if (bmi <= 40 && bmi > 30) {
            System.out.println("Your category is Obese.");
        }
        else if (bmi > 40) {
            System.out.println("Your category is Morbidly Obese.");
        }

    }

}
