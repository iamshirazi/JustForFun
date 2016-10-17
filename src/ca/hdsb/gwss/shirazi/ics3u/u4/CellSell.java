/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.hdsb.gwss.shirazi.ics3u.u4;

import java.util.Scanner;
import java.text.NumberFormat;

/**
 *
 * @author Matthew
 */
public class CellSell {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String cell;

        NumberFormat money = NumberFormat.getCurrencyInstance();

        // VARIABLES
        double D;
        final double d = 0.25;
        final double dd = 0.45;
        double E;
        final double e = 0.15;
        final double ee = 0.35;
        double W;
        final double w = 0.20;
        final double ww = 0.25;

        // INPUT
        System.out.println("Enter the Number of Daytime Minutes.");
        D = input.nextInt();

        System.out.println("Enter the Number of Evening Minutes.");
        E = input.nextInt();

        System.out.println("Enter the Number of Weekend Minutes.");
        W = input.nextInt();

        // PROCESSING
        double A = Math.abs((D * d) + (E * e) + (W * w));
        double B = Math.abs((D * dd) + (E * ee) + (W * ww));

        if (D >= 100) {
            A = Math.abs(((D - 100) * d) + (E * e) + (W * w));
        }
        if (D >= 250) {
            B = Math.abs(((D - 250) * dd) + (E * ee) + (W * ww));
        }
        if (D < 100) {
            A = Math.abs(((D - D) * d) + (E * e) + (W * w));
        }
        if (D < 250) {
            B = Math.abs(((D - D) * dd) + (E * ee) + (W * ww));

        }

        // OUTPUT
        System.out.println("Plan A Costs " + money.format(A));

        System.out.println("Plan B Costs " + money.format(B));

        if (A < B) {
            System.out.println("Plan A is Cheapest.");
        }
        if (A > B) {
            System.out.println("Plan B is Cheapest.");
        }
        if (A == B) {
            System.out.println("Plan A and Plan B are the Same Price ");
        }
    }

}
