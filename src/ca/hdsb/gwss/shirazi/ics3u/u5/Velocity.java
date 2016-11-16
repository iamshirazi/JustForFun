/*
Name: Matthew Shirazi
Date:  Tuesday November 15, 2016
Version 1.0
Description:
           Calculates velocity of an object.
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.hdsb.gwss.shirazi.ics3u.u5;
import java.util.Scanner;
import java.text.NumberFormat;
/**
 *
 * @author 1shirazimat
 */
public class Velocity {
    
    // OBJECTS
    static NumberFormat decimal = NumberFormat.getNumberInstance(); 
    static Scanner input = new Scanner(System.in);
    static decimal.setMinimumFractionDigits( 0 );
    static decimal.setMaximumFractionDigits( 2 );
    
    // GLOBAL VARIABLES  
    static double time;
    static double distance;
    static double velocity;

    public static void main(String[] args) {

        getData();
        calculateVelocity();

    }

    public static void getData() {
    System.out.println("Enter distance in meters.");
    distance = input.nextDouble();
    System.out.println("Enter time in seconds.");
    time = input.nextDouble();
    }

    public static void calculateVelocity() {
    velocity = distance / time;
    System.out.println("The velocity of the object is " + decimal.format(velocity) + " meters per second.");
    
    }

}
