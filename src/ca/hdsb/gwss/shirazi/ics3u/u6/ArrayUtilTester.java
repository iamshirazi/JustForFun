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
        int maxValue = ArrayUtil.max( dataSet );
        ArrayUtil.display( dataSet );
        System.out.println("Max: " + maxValue);
                
        // CONFIRM; maxValue is largest number
        ArrayUtil.selectionSort( dataSet );
        ArrayUtil.display( dataSet );
        
        assert (maxValue == dataSet[99]);
            System.out.println( "TEST CASE #2A RESULTS - PASSED" );
           System.out.println();
           System.out.println();
        
           
           
           
           
        
         System.out.println( "-------------------------------" );
        System.out.println( "TEST CASE #3A      : Bubble Sort" );
        System.out.println( "PRE CONDITION      : unsorted array; + and - numbers" );
        System.out.println( "POST CONDITION     : array sorted, lowest to highest" );
                
        // DISPLAY ARRAY
        System.out.println( "DATA BEFORE: " );
        dataSet = ArrayUtil.generateRandomArrays( 100, -99, 99 );
        ArrayUtil.display( dataSet );
        
        // SORT DATA
        System.out.println( "DATA AFTER: " );
        ArrayUtil.bubbleSort( dataSet );
        ArrayUtil.display( dataSet );
        
        
        // CONFIRM; the value at index i must be less (or equal) than the value at index i+1
        for (int i = 0; i < dataSet.length-1; i++) {
            assert( dataSet[i] <=  dataSet[i+1] );
        }
        System.out.println( "TEST CASE #3A RESULTS - PASSED" );
        System.out.println();
        System.out.println();
        
        
        
        
        
        System.out.println( "-------------------------------" );
        System.out.println( "TEST CASE #4A      : Min" );
        System.out.println( "PRE CONDITION      : unsorted array; + and - numbers" );
        System.out.println( "POST CONDITION     : array sorted, lowest to highest" );
                
        // DISPLAY ARRAY
        System.out.println( "DATA BEFORE: " );
        dataSet = ArrayUtil.generateRandomArrays( 100, -99, 99 );
        ArrayUtil.display( dataSet );
        
        // SORT DATA
        System.out.println( "DATA AFTER: " );
        int minValue = ArrayUtil.min( dataSet );
        ArrayUtil.display( dataSet );
        System.out.println("Min: " + minValue);
                
        // CONFIRM; maxValue is largest number
        ArrayUtil.selectionSort( dataSet );
        ArrayUtil.display( dataSet );
        
        assert (minValue == dataSet[0]);
           System.out.println( "TEST CASE #4A RESULTS - PASSED" );
           System.out.println();
           System.out.println();
   
        // MAX, MIN, BUBBLE, SELECTION, DONE!   
           
           
    }
    
}
