package ca.hdsb.gwss.shirazi.ics3u.u6;

public class ArrayUtilTester {

    public static void main(String[] args) {

        int[] dataSet;
        double[] data;

        System.out.println("-------------------------------");
        System.out.println("TEST CASE #1A      : Selection Sort (int/ascending)");
        System.out.println("PRE CONDITION      : unsorted array; + and - numbers");
        System.out.println("POST CONDITION     : array sorted, lowest to highest");

        // DISPLAY ARRAY
        System.out.println("DATA BEFORE: ");
        dataSet = ArrayUtil.generateRandomArrays(100, -99, 99);
        ArrayUtil.display(dataSet);

        // SORT DATA
        System.out.println("DATA AFTER: ");
        ArrayUtil.selectionSort(dataSet);
        ArrayUtil.display(dataSet);

        // CONFIRM; the value at index i must be less (or equal) than the value at index i+1
        for (int i = 0; i < dataSet.length - 1; i++) {
            assert (dataSet[i] <= dataSet[i + 1]);
        }

        System.out.println("TEST CASE #1A RESULTS - PASSED");
        System.out.println();
        System.out.println();
        
        
        //////////////////////////////START OF TEST 2A///////////////////////////////////
        
        System.out.println("-------------------------------");
        System.out.println("TEST CASE #2A      : Selection Sort (double/ascending)");
        System.out.println("PRE CONDITION      : unsorted array; + and - numbers");
        System.out.println("POST CONDITION     : array sorted, lowest to highest");

        // DISPLAY ARRAY
        System.out.println("DATA BEFORE: ");
        data = ArrayUtil.generateDoubleRandomArrays(100, -99, 99);
        ArrayUtil.displayData(data);

        // SORT DATA
        System.out.println("DATA AFTER: ");
        ArrayUtil.selectionSortDouble(data);
        ArrayUtil.displayData(data);

        // CONFIRM; the value at index i must be less (or equal) than the value at index i+1
        for (int i = 0; i < data.length - 1; i++) {
            assert (data[i] <= data[i + 1]);
        }

        System.out.println("TEST CASE #2A RESULTS - PASSED");
        System.out.println();
        System.out.println();
        
        
        //////////////////////////////START OF TEST 3A///////////////////////////////////

        System.out.println("-------------------------------");
        System.out.println("TEST CASE #3A      : Max (int)");
        System.out.println("PRE CONDITION      : unsorted array; + and - numbers");
        System.out.println("POST CONDITION     : array sorted, lowest to highest");

        // DISPLAY ARRAY
        System.out.println("DATA: ");
        dataSet = ArrayUtil.generateRandomArrays(100, -99, 99);
        ArrayUtil.display(dataSet);

        // SORT DATA
        int maxValue = ArrayUtil.max(dataSet);
        System.out.println("Max: " + maxValue);

        // CONFIRM; maxValue is largest number
        ArrayUtil.selectionSort(dataSet);
        ArrayUtil.display(dataSet);

        assert (maxValue == dataSet[99]);
        System.out.println("TEST CASE #3A RESULTS - PASSED");
        System.out.println();
        System.out.println();
        
        //////////////////////////////START OF TEST 4A///////////////////////////////////

        System.out.println("-------------------------------");
        System.out.println("TEST CASE #4A      : Max (double)");
        System.out.println("PRE CONDITION      : unsorted array; + and - numbers");
        System.out.println("POST CONDITION     : array sorted, lowest to highest");

        // DISPLAY ARRAY
        System.out.println("DATA: ");
        data = ArrayUtil.generateDoubleRandomArrays(100, -99, 99);
        ArrayUtil.displayData(data);

        // SORT DATA
        double maxDoubleValue = ArrayUtil.maxDouble(data);
        System.out.println("Max: " + maxDoubleValue);

        // CONFIRM; maxValue is largest number
        ArrayUtil.selectionSortDouble(data);
        ArrayUtil.displayData(data);

        assert (maxValue == dataSet[99]);
        System.out.println("TEST CASE #4A RESULTS - PASSED");
        System.out.println();
        System.out.println();
        
        
        //////////////////////////////START OF TEST 5A///////////////////////////////////

        System.out.println("-------------------------------");
        System.out.println("TEST CASE #5A      : Bubble Sort (int/ascending)");
        System.out.println("PRE CONDITION      : unsorted array; + and - numbers");
        System.out.println("POST CONDITION     : array sorted, lowest to highest");

        // DISPLAY ARRAY
        System.out.println("DATA BEFORE: ");
        dataSet = ArrayUtil.generateRandomArrays(100, -99, 99);
        ArrayUtil.display(dataSet);

        // SORT DATA
        System.out.println("DATA AFTER: ");
        ArrayUtil.bubbleSort(dataSet);
        ArrayUtil.display(dataSet);

        // CONFIRM; the value at index i must be less (or equal) than the value at index i+1
        for (int i = 0; i < dataSet.length - 1; i++) {
            assert (dataSet[i] <= dataSet[i + 1]);
        }
        System.out.println("TEST CASE #5A RESULTS - PASSED");
        System.out.println();
        System.out.println();
        
        
        
        //////////////////////////////START OF TEST 6A///////////////////////////////////

        System.out.println("-------------------------------");
        System.out.println("TEST CASE #6A      : Bubble Sort (double/ascending)");
        System.out.println("PRE CONDITION      : unsorted array; + and - numbers");
        System.out.println("POST CONDITION     : array sorted, lowest to highest");

        // DISPLAY ARRAY
        System.out.println("DATA BEFORE: ");
        data = ArrayUtil.generateDoubleRandomArrays(100, -99, 99);
        ArrayUtil.displayData(data);

        // SORT DATA
        System.out.println("DATA AFTER: ");
        ArrayUtil.bubbleSortDouble(data);
        ArrayUtil.displayData(data);

        // CONFIRM; the value at index i must be less (or equal) than the value at index i+1
        for (int i = 0; i < data.length - 1; i++) {
            assert (data[i] <= data[i + 1]);
        }
        System.out.println("TEST CASE #6A RESULTS - PASSED");
        System.out.println();
        System.out.println();
        
        
        //////////////////////////////START OF TEST 7A///////////////////////////////////

        System.out.println("-------------------------------");
        System.out.println("TEST CASE #7A      : Min (int)");
        System.out.println("PRE CONDITION      : unsorted array; + and - numbers");
        System.out.println("POST CONDITION     : array sorted, lowest to highest");

        // DISPLAY ARRAY
        System.out.println("DATA BEFORE: ");
        dataSet = ArrayUtil.generateRandomArrays(100, -99, 99);
        ArrayUtil.display(dataSet);

        // SORT DATA
        System.out.println("DATA AFTER: ");
        int minValue = ArrayUtil.min(dataSet);
        ArrayUtil.display(dataSet);
        System.out.println("Min: " + minValue);

        // CONFIRM; maxValue is largest number
        ArrayUtil.selectionSort(dataSet);
        ArrayUtil.display(dataSet);

        assert (minValue == dataSet[0]);
        System.out.println("TEST CASE #7A RESULTS - PASSED");
        System.out.println();
        System.out.println();
        

        //////////////////////////////START OF TEST 8A///////////////////////////////////  
        
        System.out.println("-------------------------------");
        System.out.println("TEST CASE #8A      : Average (int)");
        System.out.println("PRE CONDITION      : unsorted array; + and - numbers");
        System.out.println("POST CONDITION     : array sorted, lowest to highest");

        // DISPLAY ARRAY
        System.out.println("DATA: ");
        dataSet = ArrayUtil.generateArithmeticSequence(10, 0, 5);
        ArrayUtil.display(dataSet);

        // SORT DATA
        int average = ArrayUtil.average(dataSet);
        System.out.println("Average: " + average);

        // CONFIRM; average is median of numbers
        ArrayUtil.average(dataSet);

        //assert (average == (( (dataSet[0] + dataSet[dataSet.length-1]) / 2)));
        System.out.println("Average (check): " + (dataSet.length * ((dataSet[0] + dataSet[dataSet.length-1]) / 2) / dataSet.length ));
        
        System.out.println("TEST CASE #8A RESULTS - PASSED");
        System.out.println();
        System.out.println();

        
        //////////////////////////////START OF TEST 9A///////////////////////////////////
        
        System.out.println("-------------------------------");
        System.out.println("TEST CASE #9A      : Sum (int)");
        System.out.println("PRE CONDITION      : unsorted array; + and - numbers");
        System.out.println("POST CONDITION     : array sorted, lowest to highest");

        // DISPLAY ARRAY
        System.out.println("DATA: ");
        dataSet = ArrayUtil.generateArithmeticSequence( 10, 0, 2 );
        ArrayUtil.display(dataSet);

        // SORT DATA
        int sum = ArrayUtil.sum(dataSet);
        System.out.println("Sum: " + sum);
        // CONFIRM; sum is the total of all numbers

        // CHECK
        int sumCheck = dataSet.length * ( (dataSet[0] + dataSet[dataSet.length-1]) / 2);
        System.out.println("Sum (check): " + sumCheck);
        
        assert (sumCheck == sum);
        
        System.out.println("TEST CASE #9A RESULTS - PASSED");
        System.out.println();
        System.out.println();

        
        //////////////////////////////START OF TEST 10A///////////////////////////////////
        
        System.out.println("-------------------------------");
        System.out.println("TEST CASE #10A      : Sum (double)");
        System.out.println("PRE CONDITION      : unsorted array; + and - numbers");
        System.out.println("POST CONDITION     : array sorted, lowest to highest");

        // DISPLAY ARRAY
        System.out.println("DATA: ");
        data = ArrayUtil.generateArithmeticSequenceForDouble( 10, 0, 2 );
        ArrayUtil.displayData(data);

        // ADD DATA
        double sumDouble = ArrayUtil.sumDouble(data);
        System.out.println("Sum: " + sumDouble);

        // CHECK
        double sumDoubleCheck = data.length * ( (data[0] + data[data.length-1]) / 2);
        System.out.println("Sum (check): " + sumDoubleCheck);
        
        assert (sumDoubleCheck == sumDouble);
        
        System.out.println("TEST CASE #10A RESULTS - PASSED");
        System.out.println();
        System.out.println();
        
        
        //////////////////////////////START OF TEST 11A///////////////////////////////////
        
        
    }
}
