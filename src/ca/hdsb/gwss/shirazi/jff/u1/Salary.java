/*
Name: Matthew Shirazi
Date: Monday February 20, 2017
Version 1.0
Description:
           This program will determine how much of your salary you are left with
after taxes in Canada.
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.hdsb.gwss.shirazi.jff.u1;

import java.util.Scanner;
import java.text.NumberFormat;
/**
 *
 * @author Matt
 */
public class Salary {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
    // OBJECTS
    Scanner input = new Scanner(System.in);
    NumberFormat money = NumberFormat.getCurrencyInstance();
        
    // CONSTANTS
    final double provincialTax1 = 0.0505; 
    final double provincialTax2 = 0.0915; 
    final double provincialTax3 = 0.1116;
    final double provincialTax4 = 0.1216;
    final double provincialTax5 = 0.1316;
        
    final double federalTax1 = 0.15;
    final double federalTax2 = 0.205;
    final double federalTax3 = 0.26;
    final double federalTax4 = 0.29;
    final double federalTax5 = 0.33;
        
    // VARIABLES
    double totalTax;
    double salary = 0;
    double endSalary;
    double tax1 = 0;
    double tax2 = 0;
        
    // INPUT
    System.out.println("What is your annual salary in CAD?");
    salary = input.nextDouble();
        
    // PROCESSING
      if ( salary <= 45916  ) {
        tax1 = federalTax1;
    } if ( salary > 45916 && salary <= 91831 ) {
        tax1 = federalTax2;
    } if ( salary > 91831 && salary <= 142353 ) {
        tax1 = federalTax3;
    } if ( salary > 142353 && salary <= 202800 ) {
        tax1 = federalTax4;
    } if ( salary > 202800 ) {
        tax1 = federalTax5;
    }
    
    
    if ( salary <= 42201  ) {
        tax2 = provincialTax1;
    } if ( salary > 42201 && salary <= 84404 ) {
        tax2 = provincialTax2;
    } if ( salary > 84404 && salary <= 150000 ) {
        tax2 = provincialTax3;
    } if ( salary > 150000 && salary <= 220000 ) {
        tax2 = provincialTax4;
    } if ( salary > 220000 ) {
        tax2 = provincialTax5;
    }
    
    
    // OUTPUT
    totalTax = tax1 + tax2;
    endSalary = salary - ( salary * totalTax );
    
    System.out.println("Your end salary (taxes deducted) is: " + money.format(endSalary));
    System.out.println("Provincial Tax: " + (tax2 * 100) + "%");
    System.out.println("Federal Tax: " + (tax1 * 100) + "%");
 }
}