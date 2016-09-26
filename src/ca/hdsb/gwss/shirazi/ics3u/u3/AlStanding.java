/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.hdsb.gwss.shirazi.ics3u.u3;

import static java.time.Clock.system;

/**
 *
 * @author 1shirazimat
 */
public class AlStanding {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        System.out.format("%3s / %-12s / %3s / %3s / %4s \n", "#", "Teams", "W", "L", "PCT");
            System.out.format("%3s / %-12s / %3s / %3s / %4s \n",
                              "1", "Red Sox", "92", "64", ".590");
             System.out.format("%3s / %-12s / %3s / %3s / %4s \n",
                              "2", "Blue J's", "86", "69", ".555");
              System.out.format("%3s / %-12s / %3s / %3s / %4s \n",
                              "3", "Orioles", "85", "71", ".545");
        // TODO code application logic here

    }
}
