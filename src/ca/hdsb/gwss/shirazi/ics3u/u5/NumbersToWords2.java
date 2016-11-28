/*
Name: Matthew Shirazi
Date: Tuesday November 15, 2016
Version 1.0
Description:
           Converts numbers to words.
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.hdsb.gwss.shirazi.ics3u.u5;

import java.util.Scanner;

/**
 *
 * @author 1shirazimat
 */
public class NumbersToWords2 {

    /**
     * @param args the command line arguments
     */
    // OBJECTS
    static String word;
    static Scanner input = new Scanner(System.in);

    // VARIABLES
    static int number;
    static int hundreds;
    static int tens;
    static int ones;
    static int teens;
    static int digitToUse;

    public static void main(String[] args) {

            getNumber();
            hundreds = number / 100;
            teens = number % 100;
            tens = (number / 10) % 10;
            ones = number % 10;
            digitToUse = ones;

            if (number <= 0 || number >= 1000) {
                System.out.println("Invalid number.");
            }
            else if (number < 10) {
                ones();
            } else if (number <= 19) {
                teens();
            } else if (number <= 99) {
                tens();
                ones();
            } else if (number <= 999) {
                hundreds();
                if (tens == 0) {
                    ones();
                } else if (tens == 1) {
                    teens();
                } else {
                    tens();
                    ones();
                }
            }
            System.out.println();
    }
    public static void getNumber() {
        System.out.println("Enter any number from 1 to 999.");
        number = input.nextInt();
    }
    public static void hundreds() {
        digitToUse = hundreds;
        ones();
        System.out.print(" Hundred ");
        digitToUse = ones;
    }
    public static void tens() {
        digitToUse = tens;
        switch (tens) {
            case 2:
                System.out.print(" Twenty");
                break;
            case 3:
                System.out.print(" Thirty");
                break;
            case 4:
                ones();
                System.out.print("ty");
                break;
            case 5:
                System.out.print(" Fifty");
                break;
            case 6:
                ones();
                System.out.print("ty");
                break;
            case 7:
                ones();
                System.out.print("ty");
                break;
            case 8:
                ones();
                System.out.print("y");
                break;
            case 9:
                ones();
                System.out.print("ty");
                break;
            default:
                break;
        }
        digitToUse = ones;
    }
    public static void teens() {

        switch (teens) {
            case 10:
                System.out.print("Ten");
                break;
            case 11:
                System.out.print("Eleven");
                break;
            case 12:
                System.out.print("Twelve");
                break;
            case 13:
                System.out.print("Thirteen");
                break;
            case 14:
                System.out.print("Fourteen");
                break;
            case 15:
                System.out.print("Fifteen");
                break;
            case 16:
                System.out.print("Sixteen");
                break;
            case 17:
                System.out.print("Seventeen");
                break;
            case 18:
                System.out.print("Eighteen");
                break;
            case 19:
                System.out.print("Nineteen");
                break;
            default:
                break;
        }
    }
    public static void ones() {

        switch (digitToUse) {
            case 1:
                System.out.print(" One");
                break;
            case 2:
                System.out.print(" Two");
                break;
            case 3:
                System.out.print(" Three");
                break;
            case 4:
                System.out.print(" Four");
                break;
            case 5:
                System.out.print(" Five");
                break;
            case 6:
                System.out.print(" Six");
                break;
            case 7:
                System.out.print(" Seven");
                break;
            case 8:
                System.out.print(" Eight");
                break;
            case 9:
                System.out.print(" Nine");
                break;
            default:
                break;
        }
    } 
}
