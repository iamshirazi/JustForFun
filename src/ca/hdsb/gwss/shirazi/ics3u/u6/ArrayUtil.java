package ca.hdsb.gwss.shirazi.ics3u.u6;

public class ArrayUtil {
   
    public static int[] generateRandomArrays( int size, int min, int max ) {
        
        int[] data = new int[size];
        for (int c = 0; c < data.length; c++) {
            data[c] = (int) (Math.random() * (max-min+1) ) + min;
        }
        return data;
    }
    
    public static double[] generateDoubleRandomArrays( int size, double min, double max ) {
        
        double[] data = new double[size];
        for (int c = 0; c < data.length; c++) {
            data[c] = (double) (Math.random() * (max-min+1) ) + min;
        }
        return data;
    }
    
    public static int[] generateArithmeticSequence( int size, int start, int increment ) {
        
        int[] data = new int[size];
        for (int c = 0; c < data.length; c++) {
            data[c] = start;
            start = start + increment;
        }
        return data;
    }
    
    public static double[] generateArithmeticSequenceForDouble( int size, double start, double increment ) {
        
        double[] data = new double[size];
        for (int c = 0; c < data.length; c++) {
            data[c] = start;
            start = start + increment;
        }
        return data;
    }

    public static void selectionSort(int[] data) {
        
       // VARIABLES
        int swaps = 0;
        int comps = 0;
        int indexMaxValue;

        // DETERMINES MAX VALUE
        for (int pass = 0; pass < data.length-1; pass++) {
            indexMaxValue = 0;
            for (int z = 1; z < data.length - pass; z++) {
                comps++;
                if (data[indexMaxValue] < data[z]) {
                    indexMaxValue = z;
                }
            }
            // SWAP
            swaps++;
            swap( data, indexMaxValue, data.length - 1 - pass );            
        }
        System.out.println( "SWAPS: " + swaps + " COMPARISONS: " + comps );
    }
    
    
    public static void selectionSortDouble(double[] data) {
        
       // VARIABLES
        double swaps = 0;
        double comps = 0;
        int indexMaxValue;

        // DETERMINES MAX VALUE
        for (int pass = 0; pass < data.length-1; pass++) {
            indexMaxValue = 0;
            for (int z = 1; z < data.length - pass; z++) {
                comps++;
                if (data[indexMaxValue] < data[z]) {
                    indexMaxValue = z;
                }
            }
            // SWAP
            swaps++;
            swapDouble( data, indexMaxValue, data.length - 1 - pass );            
        }
        System.out.println( "SWAPS: " + swaps + " COMPARISONS: " + comps );
    }
    

    public static void swap(int[] data, int i, int j) {
        int swap = data[i];
        data[i] = data[j];
        data[j] = swap;
    }

     public static void swapDouble(double[] data, int i, int j) {
        double swap = data[i];
        data[i] = data[j];
        data[j] = swap;
    }
    
    
    public static void display(int[] data) {

        for (int c = 0; c < data.length; c++) {
            System.out.print(" " + data[c]);
        }
        System.out.println();
    }
    
    public static void displayData(double[] data) {

        for (int c = 0; c < data.length; c++) {
            System.out.print(" " + data[c]);
        }
        System.out.println();
    }
    
    
     public static int max( int[] data  ) {
        
        int maxValue = data[0];
        for (int counter = 0; counter < data.length; counter++) {
            if (data[counter] > maxValue) {
                maxValue= data[counter];
            }
        }
        return maxValue;
    }  
     
     public static double maxDouble( double[] data  ) {
        
        double maxValue = data[0];
        for (int counter = 0; counter < data.length; counter++) {
            if (data[counter] > maxValue) {
                maxValue= data[counter];
            }
        }
        return maxValue;
    }  
    
     public static void bubbleSort(int[] data) {
        int swaps = 0;
        int comps = 0;
        for (int pass = 0; pass < data.length - 1; pass++) {
            for (int c = 0; c < (data.length - 1) - pass; c++) {    
                comps++;
                if (data[c] > data[c + 1]) {
                    swaps++;
                    swap( data, c, c+1 );
                }
            }
        }
        System.out.println( "SWAPS: " + swaps + " COMP: " + comps );
    }
     
     
     public static void bubbleSortDouble(double[] data) {
        double swaps = 0;
        double comps = 0;
        for (int pass = 0; pass < data.length - 1; pass++) {
            for (int c = 0; c < (data.length - 1) - pass; c++) {    
                comps++;
                if (data[c] > data[c + 1]) {
                    swaps++;
                    swapDouble( data, c, c+1 );
                }
            }
        }
        System.out.println( "SWAPS: " + swaps + " COMP: " + comps );
    }

      public static int min( int[] data  ) {
        
        int minValue = data[0];
        for (int counter = 0; counter < data.length; counter++) {
            if (data[counter] < minValue) {
                minValue = data[counter];
            }
        }
        return minValue;
    }
      
      
      
      public static int average( int[] data  ) {
        int sum = 0;       
        for (int counter = 0; counter < data.length; counter++) {
             sum  = (sum + data[counter]);
             
        }
        int average = sum / (data.length);
        
        return average;
    }
      
      public static int sum( int[] data) {
        
    int sum = 0;
        for (int counter = 0; counter < data.length; counter++) {
            sum = ( sum + data[counter] );
        }         
    return sum;    
}
      public static double sumDouble( double[] data) {
        
    double sum = 0;
        for (int counter = 0; counter < data.length; counter++) {
            sum = ( sum + data[counter] );
        }         
    return sum;    
}
      
}