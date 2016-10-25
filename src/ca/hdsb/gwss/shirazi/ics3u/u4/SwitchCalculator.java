/*
Name: Matthew Shirazi
Date:  Monday October 24, 2016
Version 1.0
Description:
           
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
public class SwitchCalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    // OBJECT

    Scanner input = new Scanner(System.in);
    
    // VARIABLES    
    
    int choice;
    int x;
    int y;        

    // ENTER TWO INTEGERS
    
    System.out.println("Enter the first number.");
    x = input.nextInt();
    System.out.println("Enter the second number.");
    y = input.nextInt();
    
    // CHOICE?
    System.out.println("Press 1 for Addition.");
    System.out.println("Press 2 for Subtraction.");
    System.out.println("Press 3 for Multiplication.");
    System.out.println("Press 4 for Division");
    System.out.println("Press 5 to Exit.");
    choice = input.nextInt();
    
    switch (choice){
        case 1:
            System.out.println(x + y);
            break;
        case 2:
            System.out.println(x - y);
        case 3:
            System.out.println(x * y);
        case 4: 
            System.out.println(x / y);
        case 5:
            System.out.println("Have a nice day, goodbye.");
        default:System.out.println("Invalid Input");
    }
    
    
    }
    
}
