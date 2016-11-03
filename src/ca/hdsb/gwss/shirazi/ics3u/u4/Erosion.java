/*
Name: Matthew Shirazi
Date:  Thursday November 3, 2016
Version 1.0
Description:
           
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.hdsb.gwss.shirazi.ics3u.u4;

import java.text.NumberFormat;

/**
 *
 * @author 1shirazimat
 */
public class Erosion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // OBJECTS
        NumberFormat decimal = NumberFormat.getNumberInstance();
        decimal.setMinimumFractionDigits(0);
        decimal.setMaximumFractionDigits(2);

        // VARIABLES
        double topsoil = 30;
        double erosion = 0.01;
        int years = 1;

        //OUTPUT AMOUNT OF YEARS AND CENTIMETRES IN TABLE FORM
        System.out.format("%1s %15s\n", "Years", "Topsoil (cm)");

        while (topsoil >= 9) {
            System.out.format("%3s %11s\n", years, decimal.format(topsoil));

            years++;
            topsoil = topsoil - (topsoil * erosion);
        }
        // OUTPUT THEREFORE SENTENCE
        System.out.println("Therefore, it will take " + years + " years for the"
                + " topsoil to reach a depth below 9cm.");

    }

}
