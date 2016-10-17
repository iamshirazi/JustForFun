/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.hdsb.gwss.shirazi.ics3u.u4;

import java.util.Scanner;

/**
 *
 * @author Matthew
 */
public class AlienDetector {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String antenna;

// VARIABLES
        int A;
        int E;

// INPUT
        System.out.println("How Many Antennas?");
        A = input.nextInt();
        System.out.println("How Many Eyes?");
        E = input.nextInt();

// PROCESSING
        if (A >= 3 && E <= 4) {
            System.out.println("TroyMartian");
        }
        if (A <= 6 && E >= 2) {
            System.out.println("VladSaturnian");
        }
        if (A <= 2 && E <= 3) {
            System.out.println("GraemeMercurian");
        }

    }

}
