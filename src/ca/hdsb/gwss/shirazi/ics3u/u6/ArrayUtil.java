package ca.hdsb.gwss.shirazi.ics3u.u6;

public class ArrayUtil {
    
    public static int max( int[] data  ) {
        
        int max = data[0];
        for (int counter = 0; counter < data.length; counter++) {
            if (data[counter] > max) {
                max= data[counter];
            }
        }
    
        return max;
    }  
    
    
    
    public static int[] generateRandomArrays( int size, int min, int max ) {
        
        int[] data = new int[size];
        for (int c = 0; c < data.length; c++) {
            data[c] = (int) (Math.random() * (max-min+1) ) + min;
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

    public static void swap(int[] data, int i, int j) {
        int swap = data[i];
        data[i] = data[j];
        data[j] = swap;
    }

    public static void display(int[] data) {

        for (int c = 0; c < data.length; c++) {
            System.out.print(" " + data[c]);
        }
        System.out.println();
    }
}