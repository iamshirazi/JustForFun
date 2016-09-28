/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.hdsb.gwss.shirazi.ics3u.u3;

/**
 *
 * @author 1shirazimat
 */
public class Change {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
 
        double Q = 25; // QUARTER
        double D = 10; // DIME
        double N = 5; // NICKEL
        double P = 1; // PENNY
        int T = 212; // TOTAL IN CENTS
        
        // CHANGE IN CENTS = 100,000 CENTS
        System.out.println( "Change In Cents:" + T);
   
        
        
        System.out.println( Math.abs( T / Q ) ); 
        
        
    }
    
}
