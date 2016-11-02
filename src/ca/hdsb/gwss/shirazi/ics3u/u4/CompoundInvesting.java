/*
Name: Matthew Shirazi
Date:  Monday October 31, 2016
Version 1.0
Description:
            Calculates amount of interest for a period of up to 15 years in 
table form.
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
public class CompoundInvesting {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // OBJECTS
        Scanner input = new Scanner(System.in);
        NumberFormat money = NumberFormat.getCurrencyInstance();

        // VARIABLES
        double interestRate;
        double yearlyInvestment;
        int years;
        double accountAmount;

        // INPUT
        System.out.println("Enter the Yearly Investment ($).");
        yearlyInvestment = input.nextDouble(); 
        
        System.out.println("Enter the Interest Rate (%).");
        interestRate = input.nextDouble(); 
        
        System.out.println("Enter the Number of Years.");
        years = input.nextInt();

        // OUTPUT TABLE WITH VALUES
        System.out.format("%5s %20s %10s %10s\n", "Year", "Amount in Account",
                "Interest", "Total");

           accountAmount = yearlyInvestment;
           
           if (years > 15) {
               years = 15;
               
           } // INVALID DATA
           if ( years <= 0 || accountAmount <= 0 || interestRate <= 0 || 
           yearlyInvestment <= 0) {
           System.out.println("Invalid data, please try again."); 
           
           // VALID DATA
           } else {
           for (int actualYears = 1; actualYears <= years; actualYears++) {
           double interest = Math.abs(((interestRate / 100) * accountAmount));
           
           double total = accountAmount + interest;
           
           System.out.format("%3s %15s %15s %12s\n", actualYears, money.format
           (accountAmount), money.format(interest), money.format(total));
           
           accountAmount = accountAmount + yearlyInvestment + interest;  
        }
        }
    }
}