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
public class Restaurant {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int H = 9 ; // H IS FOR ONE HAMBURGER
        int M = 2; // M IS FOR ONE MOUNTAIN DEW (DRINK)
        double T = 1.13; // T IS FOR HST TAX
        
        System.out.println( (H + M) * T ); // MY BILL IS 12.43 DOLLARS AFTER TAXES
        
    }
    
}
