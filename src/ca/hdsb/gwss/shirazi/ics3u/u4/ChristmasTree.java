/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.hdsb.gwss.shirazi.ics3u.u4;

/**
 *
 * @author 1shirazimat
 */
public class ChristmasTree {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

// GREEN PART OF TREE  
        for (int row = 0; row < 6; row++) {

for ( int width = 5 - row; width > 0; width-- ) { 
            System.out.print( " " );
        }
        for (int width = 0; width <= row; width++) {
            System.out.print("*^");
        }
        System.out.println( );
       } // TRUNK
        for (int i = 5; i > 0; i--) {
            System.out.print("  ");
        }     
       
    
         System.out.print("**");
    }        
}
