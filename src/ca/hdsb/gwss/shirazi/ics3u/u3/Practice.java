/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.hdsb.gwss.shirazi.ics3u.u3;
import java.util.Scanner;
/**
 *
 * @author 1shirazimat
 */
public class Practice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
            
       boolean a, b;
    
     
       // CASE 1:
          System.out.format(" %6s / %6s / %6s\n", a, b, "A!B");
       a = false;
       b = false;
       
       //CASE 2
       System.out.format(" %6s / %6s / %6s\n", a, b, "A.B");
       a = false;
       b = true;
     
       // CASE 3:
        System.out.format(" %6s / %6s / %6s\n", a, b, "A||B");
       a = true;
       b = false;
        
      // CASE 4:
       System.out.format(" %6s / %6s / %6s\n", a, b, "A.B");
       a = true;
       b = true;
       
    }
    
}
