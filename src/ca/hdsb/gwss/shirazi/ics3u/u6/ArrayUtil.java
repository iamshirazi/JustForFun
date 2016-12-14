package ca.hdsb.gwss.shirazi.ics3u.u6;

public class ArrayUtil {

    public static int[] generateRandomArrays(int size, int min, int max) {

        int[] data = new int[size];
        for (int c = 0; c < data.length; c++) {
            data[c] = (int) (Math.random() * (max - min + 1)) + min;
        }
        return data;
    }

    public static double[] generateDoubleRandomArrays(int size, double min, double max) {

        double[] data = new double[size];
        for (int c = 0; c < data.length; c++) {
            data[c] = (double) (Math.random() * (max - min + 1)) + min;
        }
        return data;
    }

    public static String[] generateStringArray(int size, int wordLength) {

        String[] data = new String[size];
        String word;
        for (int c = 0; c < data.length; c++) {
            word = "";
            for (int i = 0; i < wordLength; i++) {
                word = word + (char) ((int) (Math.random() * 26) + 'A');
            }
            data[c] = word;
        }
        return data;
    }

    public static int[] generateArithmeticSequence(int size, int start, int increment) {

        int[] data = new int[size];
        for (int c = 0; c < data.length; c++) {
            data[c] = start;
            start = start + increment;
        }
        return data;
    }
    
    
    
    public static int[] generateArithmeticSequenceBackward(int size, int start, int increment) {

        int[] data = new int[size];
        for (int c = 0; c < data.length; c++) {
            data[c] = start;
            start = start - increment;
        }
        return data;
    }
    
    
    
    public static double[] generateArithmeticSequenceDoubleBackward(int size, double start, double increment) {

        double[] data = new double[size];
        for ( int c = 0; c < data.length; c++) {
            data[c] = start;
            start = start - increment;
        }
        return data;
    }
    
    
    public static String[] generateArithmeticSequenceStringBackward() {

        String[] dataString = new String[26];

        dataString[0] = "Z";
        dataString[1] = "Y";
        dataString[2] = "X";
        dataString[3] = "W";
        dataString[4] = "V";
        dataString[5] = "U";
        dataString[6] = "T";
        dataString[7] = "S";
        dataString[8] = "R";
        dataString[9] = "Q";
        dataString[10] = "P";
        dataString[11] = "O";
        dataString[12] = "N";
        dataString[13] = "M";
        dataString[14] = "L";
        dataString[15] = "K";
        dataString[16] = "J";
        dataString[17] = "I";
        dataString[18] = "H";
        dataString[19] = "G";
        dataString[20] = "F";
        dataString[21] = "E";
        dataString[22] = "D";
        dataString[23] = "C";
        dataString[24] = "B";
        dataString[25] = "A";

        return dataString;
    }
    
    

    public static double[] generateArithmeticSequenceForDouble(int size, double start, double increment) {

        double[] data = new double[size];
        for (int c = 0; c < data.length; c++) {
            data[c] = start;
            start = start + increment;
        }
        return data;
    }

    public static String[] generateArithmeticStringSequence() {

        String[] dataString = new String[26];

        dataString[0] = "A";
        dataString[1] = "B";
        dataString[2] = "C";
        dataString[3] = "D";
        dataString[4] = "E";
        dataString[5] = "F";
        dataString[6] = "G";
        dataString[7] = "H";
        dataString[8] = "I";
        dataString[9] = "J";
        dataString[10] = "K";
        dataString[11] = "L";
        dataString[12] = "M";
        dataString[13] = "N";
        dataString[14] = "O";
        dataString[15] = "P";
        dataString[16] = "Q";
        dataString[17] = "R";
        dataString[18] = "S";
        dataString[19] = "T";
        dataString[20] = "U";
        dataString[21] = "V";
        dataString[22] = "W";
        dataString[23] = "X";
        dataString[24] = "Y";
        dataString[25] = "Z";

        return dataString;
    }

    public static void selectionSort(int[] data) {

        // VARIABLES
        int swaps = 0;
        int comps = 0;
        int indexMaxValue;

        // DETERMINES MAX VALUE
        for (int pass = 0; pass < data.length - 1; pass++) {
            indexMaxValue = 0;
            for (int z = 1; z < data.length - pass; z++) {
                comps++;
                if (data[indexMaxValue] < data[z]) {
                    indexMaxValue = z;
                }
            }
            // SWAP
            swaps++;
            swap(data, indexMaxValue, data.length - 1 - pass);
        }
        System.out.println("SWAPS: " + swaps + " COMPARISONS: " + comps);
    }

    public static void selectionSortBackward(int[] data) {

        // VARIABLES
        int swaps = 0;
        int comps = 0;
        int indexMaxValue;

        // DETERMINES MAX VALUE
        for (int pass = 0; pass < data.length - 1; pass++) {
            indexMaxValue = 0;
            for (int z = 1; z < data.length - pass; z++) {
                comps++;
                if (data[indexMaxValue] > data[z]) {
                    indexMaxValue = z;
                }
            }
            // SWAP
            swaps++;
            swap(data, indexMaxValue, data.length - 1 - pass);
        }
        System.out.println("SWAPS: " + swaps + " COMPARISONS: " + comps);
    }

    public static void selectionSortDouble(double[] data) {

        // VARIABLES
        double swaps = 0;
        double comps = 0;
        int indexMaxValue;

        // DETERMINES MAX VALUE
        for (int pass = 0; pass < data.length - 1; pass++) {
            indexMaxValue = 0;
            for (int z = 1; z < data.length - pass; z++) {
                comps++;
                if (data[indexMaxValue] < data[z]) {
                    indexMaxValue = z;
                }
            }
            // SWAP
            swaps++;
            swapDouble(data, indexMaxValue, data.length - 1 - pass);
        }
        System.out.println("SWAPS: " + swaps + " COMPARISONS: " + comps);
    }

    public static void selectionSortDoubleBackward(double[] data) {

        // VARIABLES
        double swaps = 0;
        double comps = 0;
        int indexMaxValue;

        // DETERMINES MAX VALUE
        for (int pass = 0; pass < data.length - 1; pass++) {
            indexMaxValue = 0;
            for (int z = 1; z < data.length - pass; z++) {
                comps++;
                if (data[indexMaxValue] > data[z]) {
                    indexMaxValue = z;
                }
            }
            // SWAP
            swaps++;
            swapDouble(data, indexMaxValue, data.length - 1 - pass);
        }
        System.out.println("SWAPS: " + swaps + " COMPARISONS: " + comps);
    }

    public static void selectionSortString(String[] data) {

        // VARIABLES
        int swaps = 0;
        int comps = 0;
        int indexMaxValue;

        // DETERMINES MAX VALUE
        for (int pass = 0; pass < data.length - 1; pass++) {
            indexMaxValue = 0;
            for (int z = 1; z < data.length - pass; z++) {
                comps++;
                if (data[indexMaxValue].compareTo(data[z]) < 0) {
                    indexMaxValue = z;
                }
            }
            // SWAP
            swaps++;
            swapString(data, indexMaxValue, data.length - 1 - pass);
        }
        System.out.println("SWAPS: " + swaps + " COMPARISONS: " + comps);
    }

    public static void selectionSortStringBackward(String[] data) {

        // VARIABLES
        int swaps = 0;
        int comps = 0;
        int indexMaxValue;

        // DETERMINES MAX VALUE
        for (int pass = 0; pass < data.length - 1; pass++) {
            indexMaxValue = 0;
            for (int z = 1; z < data.length - pass; z++) {
                comps++;
                if (data[indexMaxValue].compareTo(data[z]) > 0) {
                    indexMaxValue = z;
                }
            }
            // SWAP
            swaps++;
            swapString(data, indexMaxValue, data.length - 1 - pass);
        }
        System.out.println("SWAPS: " + swaps + " COMPARISONS: " + comps);
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

    public static int max(int[] data) {

        int maxValue = data[0];
        for (int counter = 0; counter < data.length; counter++) {
            if (data[counter] > maxValue) {
                maxValue = data[counter];
            }
        }
        return maxValue;
    }

    public static double maxDouble(double[] data) {

        double maxValue = data[0];
        for (int counter = 0; counter < data.length; counter++) {
            if (data[counter] > maxValue) {
                maxValue = data[counter];
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
                    swap(data, c, c + 1);
                }
            }
        }
        System.out.println("SWAPS: " + swaps + " COMP: " + comps);
    }

    public static void bubbleSortBackward(int[] data) {
        int swaps = 0;
        int comps = 0;
        for (int pass = 0; pass < data.length - 1; pass++) {
            for (int c = 0; c < (data.length - 1) - pass; c++) {
                comps++;
                if (data[c] < data[c + 1]) {
                    swaps++;
                    swap(data, c, c + 1);
                }
            }
        }
        System.out.println("SWAPS: " + swaps + " COMP: " + comps);
    }

    public static void bubbleSortDouble(double[] data) {
        double swaps = 0;
        double comps = 0;
        for (int pass = 0; pass < data.length - 1; pass++) {
            for (int c = 0; c < (data.length - 1) - pass; c++) {
                comps++;
                if (data[c] > data[c + 1]) {
                    swaps++;
                    swapDouble(data, c, c + 1);
                }
            }
        }
        System.out.println("SWAPS: " + swaps + " COMP: " + comps);
    }

    public static void bubbleSortDoubleBackward(double[] data) {
        double swaps = 0;
        double comps = 0;
        for (int pass = 0; pass < data.length - 1; pass++) {
            for (int c = 0; c < (data.length - 1) - pass; c++) {
                comps++;
                if (data[c] < data[c + 1]) {
                    swaps++;
                    swapDouble(data, c, c + 1);
                }
            }
        }
        System.out.println("SWAPS: " + swaps + " COMP: " + comps);
    }

    public static void bubbleSortString(String[] data) {
        int swaps = 0;
        int comps = 0;
        for (int pass = 0; pass < data.length - 1; pass++) {
            for (int c = 0; c < (data.length - 1) - pass; c++) {
                comps++;
                if (data[c].compareTo(data[c + 1]) > 0) {
                    swaps++;
                    swapString(data, c, c + 1);
                }
            }
        }
        System.out.println("SWAPS: " + swaps + " COMP: " + comps);
    }

    public static void bubbleSortStringBackward(String[] data) {
        int swaps = 0;
        int comps = 0;
        for (int pass = 0; pass < data.length - 1; pass++) {
            for (int c = 0; c < (data.length - 1) - pass; c++) {
                comps++;
                if (data[c].compareTo(data[c + 1]) < 0) {
                    swaps++;
                    swapString(data, c, c + 1);
                }
            }
        }
        System.out.println("SWAPS: " + swaps + " COMP: " + comps);
    }

    public static int min(int[] data) {

        int minValue = data[0];
        for (int counter = 0; counter < data.length; counter++) {
            if (data[counter] < minValue) {
                minValue = data[counter];
            }
        }
        return minValue;
    }

    public static double minDouble(double[] data) {

        double minValue = data[0];
        for (int counter = 0; counter < data.length; counter++) {
            if (data[counter] < minValue) {
                minValue = data[counter];
            }
        }
        return minValue;
    }

    public static int average(int[] data) {
        int sum = 0;
        for (int counter = 0; counter < data.length; counter++) {
            sum = (sum + data[counter]);

        }
        int average = sum / (data.length);

        return average;
    }

    public static double averageDouble(double[] data) {
        double sum = 0;
        for (int counter = 0; counter < data.length; counter++) {
            sum = (sum + data[counter]);
        }
        double averageValue = sum / (data.length);

        return averageValue;
    }

    public static int sum(int[] data) {

        int sum = 0;
        for (int counter = 0; counter < data.length; counter++) {
            sum = (sum + data[counter]);
        }
        return sum;
    }

    public static double sumDouble(double[] data) {

        double sum = 0;
        for (int counter = 0; counter < data.length; counter++) {
            sum = (sum + data[counter]);
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
    
    public static double linearSearch(String[] data, String searchValue) {
        double location = -1;

        // PROCESSING
        for (int a = 0; a < data.length; a++) {
            if (data[a].equals( searchValue) ) {
                location = a;
                a = data.length;
            }
        }
        return location;
    }

    public static int binarySearch(int[] data, int value) {

        int left = 0;
        int right = data.length - 1;
        while (left <= right) {
            int mid = (int) (Math.floor((right - left) / 2) + left);
            if (data[mid] == value) {
                return mid;
            }
            if (value < data[mid]) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return -1;
    }
    
    
    public static int binarySearchBackward(int[] data, int value) {

        int right = 0;
        int left = data.length - 1;
        while (left >= right) {
            int mid = (int) (Math.floor((left - right) / 2) + right);
            if (data[mid] == value) {
                return mid;
            }
            if (value > data[mid]) {
                left = mid - 1;
            } else {
                right = mid + 1;
            }
        }
        return -1;
    }

    public static double binarySearchDouble(double[] data, double value) {

        double left = 0;
        double right = data.length - 1;
        while (left <= right) {
            int mid = (int) (Math.floor((right - left) / 2) + left);
            if (data[mid] == value) {
                return mid;
            }
            if (value < data[mid]) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return -1;
    }
    
    
    public static double binarySearchDoubleBackward(double[] data, double value) {

        double right = 0;
        double left = data.length - 1;
        while (left >= right) {
            int mid = (int) (Math.floor((left - right) / 2) + right);
            if (data[mid] == value) {
                return mid;
            }
            if (value > data[mid]) {
                left = mid - 1;
            } else {
                right = mid + 1;
            }
        }
        return -1;
    }
    

    public static double binarySearchString(String[] data, String value) {

        double left = 0;
        double right = data.length - 1;
        while (left <= right) {
            int mid = (int) (Math.floor((right - left) / 2) + left);
            if (data[mid].compareTo(value) == 0) {
                return mid;
            }
            if (value.compareTo(data[mid]) > 0) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return -1;
    }

    
    public static double binarySearchStringBackward(String[] data, String value) {

        int right = 0;
        int left = data.length - 1;
        while (left >= right) {
            int mid = (int) (Math.floor((left - right) / 2) + right);
            if (data[mid].equals(value)) {
                return mid;
            }
            if (value.compareTo(data[mid]) < 0) {
                left = mid - 1;
            } else {
                right = mid + 1;
            }
        }
        return -1;
    }
    
    
}
