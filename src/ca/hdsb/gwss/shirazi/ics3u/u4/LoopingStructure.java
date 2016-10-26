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
public class LoopingStructure {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        for ( short n = 10; n > 0 ; n-- ) {
        // IN the first, is done ONCE, at the start
        // Do whatever is inbetween these curly brackets
        // n++ and n.. means n + 1
        // n=+ 2; is the same as n = n + 2
        // In the middle is what happens at the start of every loop
        // It will be a boolean
        // int goes up to 32 billion
        System.out.println( n );
        }
        
        int x = 10;
        System.out.println( x++ );
        System.out.println( x );
        
        
    }
    
}
