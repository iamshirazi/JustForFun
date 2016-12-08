package ca.hdsb.gwss.shirazi.ics3u.u6;

public class ArrayUtilTester {

    public static void main(String[] args) {
        
        int[] dataSet;


        System.out.println( "-------------------------------" );
        System.out.println( "TEST CASE #1A      : Selection Sort" );
        System.out.println( "PRE CONDITION      : unsorted array; + and - numbers" );
        System.out.println( "POST CONDITION     : array sorted, lowest to highest" );
                
        // DISPLAY ARRAY
        System.out.println( "DATA BEFORE: " );
        dataSet = ArrayUtil.generateRandomArrays( 100, -99, 99 );
        ArrayUtil.display( dataSet );
        
        // SORT DATA
        System.out.println( "DATA AFTER: " );
        ArrayUtil.selectionSort( dataSet );
        ArrayUtil.display( dataSet );
        
        
        // CONFIRM; the value at index i must be less (or equal) than the value at index i+1
        for (int i = 0; i < dataSet.length-1; i++) {
            assert( dataSet[i] <=  dataSet[i+1] );
        }
        
        System.out.println( "TEST CASE #1A RESULTS - PASSED" );
        
        
        System.out.println();
        System.out.println();
        
        
        System.out.println( "-------------------------------" );
        System.out.println( "TEST CASE #2A      : Max" );
        System.out.println( "PRE CONDITION      : unsorted array; + and - numbers" );
        System.out.println( "POST CONDITION     : array sorted, lowest to highest" );
                
        // DISPLAY ARRAY
        System.out.println( "DATA BEFORE: " );
        dataSet = ArrayUtil.generateRandomArrays( 100, -99, 99 );
        ArrayUtil.display( dataSet );
        
        // SORT DATA
        System.out.println( "DATA AFTER: " );
        ArrayUtil.max( dataSet );
        ArrayUtil.display( dataSet );
                
        // CONFIRM; the value at index i must be less (or equal) than the value at index i+1
        for (int i = 0; i < dataSet.length-1; i++) {
            assert( dataSet[i] <=  dataSet[i+1] );
        }
        
        System.out.println( "TEST CASE #2A RESULTS - PASSED" );
        
    }
    
}
