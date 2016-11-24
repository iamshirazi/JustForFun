/*
Name: Matthew Shirazi
Date:  Tuesday November 15, 2016
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

    public static void main(String[] args) {

        getNumber();
        
        hundreds = number / 100;
        teens = number % 100;
        tens = (number / 10) % 10;
        ones = number % 10;

        if (number >= 10 && number <= 19) {
            teens();
        } else if (number >= 20 && number <= 99) {
            tens();
            ones();
        } else if (number >= 100 && number <=999) {
            hundreds();
            teens();
            tens();
            ones();
        } else if (number >= 1 && number <=9) {
            ones();
        } else if (number <= 0 || number >= 1000) {
            System.out.println("Invalid number.");
        }
    }

    public static void getNumber() {
        System.out.println("Enter any number from 1 to 999.");
        number = input.nextInt();
    }

    public static void hundreds() {
        switch (hundreds) {
            case 1:
                System.out.print("One Hundred ");
                break;
            case 2:
                System.out.print("Two Hundred ");
                break;
            case 3:
                System.out.print("Three Hundred ");
                break;
            case 4:
                System.out.print("Four Hundred ");
                break;
            case 5:
                System.out.print("Five Hundred");
                break;
            case 6:
                System.out.print("Six Hundred ");
                break;
            case 7:
                System.out.print("Seven Hundred ");
                break;
            case 8:
                System.out.print("Eight Hundred ");
                break;
            case 9:
                System.out.print("Nine Hundred ");
                break;
            default:
                System.out.print("");
        }
    }
    
    public static void tens() {

        switch (tens) {

            case 2:
                System.out.print("Twenty ");
                break;
            case 3:
                System.out.print("Thirty ");
                break;
            case 4:
                System.out.print("Forty ");
                break;
            case 5:
                System.out.print("Fifty ");
                break;
            case 6:
                System.out.print("Sixty ");
                break;
            case 7:
                System.out.print("Seventy ");
                break;
            case 8:
                System.out.print("Eighty ");
                break;
            case 9:
                System.out.print("Ninety ");
                break;
            default:
                System.out.print("");
        }
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
                System.out.print("");
        }
    }
   
    public static void ones() {

        switch (ones) {
            case 1:
                System.out.print("One");
                break;
            case 2:
                System.out.print("Two");
                break;
            case 3:
                System.out.print("Three");
                break;
            case 4:
                System.out.print("Four");
                break;
            case 5:
                System.out.print("Five");
                break;
            case 6:
                System.out.print("Six");
                break;
            case 7:
                System.out.print("Seven");
                break;
            case 8:
                System.out.print("Eight");
                break;
            case 9:
                System.out.print("Nine");
                break;
            default:
                System.out.print("");
        }
    }
}