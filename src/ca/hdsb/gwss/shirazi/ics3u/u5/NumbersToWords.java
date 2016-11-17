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
public class NumbersToWords {


    /**
     * @param args the command line arguments
     */
    
    // OBJECTS
    static String word;
    static Scanner input = new Scanner(System.in);
    
    // VARIABLES
    static int number;
    static int tens;
    static int ones;
    static int teens;
    
    public static void main(String[] args) {
    
        getNumber();
        word += tens();
        teens();
        ones();

    }
    
    public static void getNumber() {
    System.out.println("Enter any number from 10 to 99");
    number = input.nextInt();        
    }
    
    public static String tens() {
        
    switch(tens) {
        case 10:
            return ("Ten");
        case 20:
            return ("Twenty");
        case 30:
            return ("Thirty");
        case 40:
            return ("Fourty");  
        case 50:
            return ("Fifty");  
        case 60:
            return ("Sixty"); 
        case 70:
            return ("Seventy");    
        case 80:
            return ("Eighty"); 
        case 90:
            return ("Ninety");  
        default:
           return ("Invalid");
    }
    }
    
    public static String ones() {
        
        switch (ones) {
        case 1:
            return ("One");
        case 2:
            return ("Two");
        case 3:
            return ("Three");
        case 4:
            return ("Four");  
        case 5:
            System.out.println("Five");  
        case 6:
            System.out.println("Six"); 
        case 7:
            System.out.println("Seven");    
        case 8:
            System.out.println("Eight");  
        case 9:
            System.out.println("Nine"); 
        default:
            System.out.println("Invalid");    
    }
    }
    
    public static void teens() {

        switch (teens) {
        case 11:
            System.out.println("One");
        case 12:
            System.out.println("Two");
        case 13:
            System.out.println("Three");
        case 14:
            System.out.println("Four");  
        case 15:
            System.out.println("Five");  
        case 16:
            System.out.println("Six"); 
        case 17:
            System.out.println("Seven");    
        case 18:
            System.out.println("Eight");  
        case 19:
            System.out.println("Nine"); 
        default:
            System.out.println("Invalid");   
    }
    }
}
