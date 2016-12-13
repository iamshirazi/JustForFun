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
    
    
    public static String[] generateStringArray() {
        
        String[] dataString = new String[26];
        
        dataString[0] = "A";
        dataString[1] = "Z";
        dataString[2] = "G";
        dataString[3] = "F";
        dataString[4] = "B";
        dataString[5] = "X";
        dataString[6] = "Q";
        dataString[7] = "S";
        dataString[8] = "R";
        dataString[9] = "T";
        dataString[10] = "Y";
        dataString[11] = "U";
        dataString[12] = "I";
        dataString[13] = "C";
        dataString[14] = "H";
        dataString[15] = "D";
        dataString[16] = "E";
        dataString[17] = "J";
        dataString[18] = "K";
        dataString[19] = "M";
        dataString[20] = "L";
        dataString[21] = "N";
        dataString[22] = "P";
        dataString[23] = "O";
        dataString[24] = "V";
        dataString[25] = "W";

        return dataString;
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
    
    
    public static void selectionSortBackward(int[] data) {
        
       // VARIABLES
        int swaps = 0;
        int comps = 0;
        int indexMaxValue;

        // DETERMINES MAX VALUE
        for (int pass = 0; pass < data.length-1; pass++) {
            indexMaxValue = 0;
            for (int z = 1; z < data.length - pass; z++) {
                comps++;
                if (data[indexMaxValue] > data[z]) {
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
    
    
    public static void selectionSortDoubleBackward(double[] data) {
        
       // VARIABLES
        double swaps = 0;
        double comps = 0;
        int indexMaxValue;

        // DETERMINES MAX VALUE
        for (int pass = 0; pass < data.length-1; pass++) {
            indexMaxValue = 0;
            for (int z = 1; z < data.length - pass; z++) {
                comps++;
                if (data[indexMaxValue] > data[z]) {
                    indexMaxValue = z;
                }
            }
            // SWAP
            swaps++;
            swapDouble( data, indexMaxValue, data.length - 1 - pass );            
        }
        System.out.println( "SWAPS: " + swaps + " COMPARISONS: " + comps );
    }
    
    
    public static void selectionSortString(String[] data) {
        
       // VARIABLES
        int swaps = 0;
        int comps = 0;
        int indexMaxValue;

        // DETERMINES MAX VALUE
        for (int pass = 0; pass < data.length-1; pass++) {
            indexMaxValue = 0;
            for (int z = 1; z < data.length - pass; z++) {
                comps++;
                if (data[indexMaxValue].compareTo(data[z]) < 0) {
                    indexMaxValue = z;
                }
            }
            // SWAP
            swaps++;
            swapString( data, indexMaxValue, data.length - 1 - pass );            
        }
        System.out.println( "SWAPS: " + swaps + " COMPARISONS: " + comps );
    }
    
    
    
    public static void selectionSortStringBackward(String[] data) {
        
       // VARIABLES
        int swaps = 0;
        int comps = 0;
        int indexMaxValue;

        // DETERMINES MAX VALUE
        for (int pass = 0; pass < data.length-1; pass++) {
            indexMaxValue = 0;
            for (int z = 1; z < data.length - pass; z++) {
                comps++;
                if (data[indexMaxValue].compareTo(data[z]) > 0) {
                    indexMaxValue = z;
                }
            }
            // SWAP
            swaps++;
            swapString( data, indexMaxValue, data.length - 1 - pass );            
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
    
     
      public static void swapString(String[] data, int i, int j) {
        String swap = data[i];
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
    
    
    public static void displayString(String[] data) {

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
     
     
     public static void bubbleSortBackward(int[] data) {
        int swaps = 0;
        int comps = 0;
        for (int pass = 0; pass < data.length - 1; pass++) {
            for (int c = 0; c < (data.length - 1) - pass; c++) {    
                comps++;
                if (data[c] < data[c + 1]) {
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
     
     
     public static void bubbleSortDoubleBackward(double[] data) {
        double swaps = 0;
        double comps = 0;
        for (int pass = 0; pass < data.length - 1; pass++) {
            for (int c = 0; c < (data.length - 1) - pass; c++) {    
                comps++;
                if (data[c] < data[c + 1]) {
                    swaps++;
                    swapDouble( data, c, c+1 );
                }
            }
        }
        System.out.println( "SWAPS: " + swaps + " COMP: " + comps );
    }
     

     public static void bubbleSortString(String[] data) {
        int swaps = 0;
        int comps = 0;
        for (int pass = 0; pass < data.length - 1; pass++) {
            for (int c = 0; c < (data.length - 1) - pass; c++) {    
                comps++;
                if (data[c].compareTo(data[c + 1]) > 0) {
                    swaps++;
                    swapString( data, c, c+1 );
                }
            }
        }
        System.out.println( "SWAPS: " + swaps + " COMP: " + comps );
    }
     
     
     public static void bubbleSortStringBackward(String[] data) {
        int swaps = 0;
        int comps = 0;
        for (int pass = 0; pass < data.length - 1; pass++) {
            for (int c = 0; c < (data.length - 1) - pass; c++) {    
                comps++;
                if (data[c].compareTo(data[c + 1]) < 0) {
                    swaps++;
                    swapString( data, c, c+1 );
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
      
      
      
      public static double minDouble( double[] data  ) {
        
        double minValue = data[0];
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
      
      
      
      public static double averageDouble( double[] data  ) {
        double sum = 0;       
        for (int counter = 0; counter < data.length; counter++) {
             sum  = (sum + data[counter]); 
        }
        double averageValue = sum / (data.length);
        
        return averageValue;
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
      
          public static int linearSearch(int[] data, int searchValue) {
        int location = -1;

        // PROCESSING
        for (int a = 0; a < data.length; a++) {
            if (data[a] == searchValue) {
                location = a;
                a = data.length;
            }
        }
        return location;
    } 
      
    
    public static double linearSearchDouble(double[] data, double searchValue) {
        double location = -1;

        // PROCESSING
        for (int a = 0; a < data.length; a++) {
            if (data[a] == searchValue) {
                location = a;
                a = data.length;
            }
        }
        return location;
    }        
            
          
    public static int binarySearch( int[] data, int value) {
    
    int left = 0;
    int right = data.length - 1;
    while (left <= right) {
        int mid = (int) (Math.floor( ( right - left ) / 2 ) + left);
        if (data[mid] == value) {
            return mid;
        } if (value < data[mid]) {
            right = mid-1;
        } else {
            left  = mid+1;
}
}
    return -1;
}    
        
        
       public static double binarySearchDouble( double[] data, double value) {
    
    double left = 0;
    double right = data.length - 1;
    while (left <= right) {
        int mid = (int) (Math.floor( ( right - left ) / 2 ) + left);
        if (data[mid] == value) {
            return mid;
        } if (value < data[mid]) {
            right = mid-1;
        } else {
            left  = mid+1;
}         
}
    return -1;
}
}
