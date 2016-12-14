package ca.hdsb.gwss.shirazi.ics3u.u6;

public class ArrayUtilTester {

    public static void main(String[] args) {
        
        int searchValue = 0;
        double search = 0;
        

        System.out.println("-------------------------------");
        System.out.println("TEST CASE #1A      : Selection Sort (int/ascending)");
        System.out.println("PRE CONDITION      : unsorted array; + and - numbers");
        System.out.println("POST CONDITION     : array sorted, lowest to highest");

        // DISPLAY ARRAY
        System.out.println("DATA BEFORE: ");
        int[] dataSet = ArrayUtil.generateRandomArrays(100, -99, 99);
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
        System.out.println("TEST CASE #2A      : Selection Sort (int/descending)");
        System.out.println("PRE CONDITION      : unsorted array; + and - numbers");
        System.out.println("POST CONDITION     : array sorted, highest to lowest");

        // DISPLAY ARRAY
        System.out.println("DATA BEFORE: ");
        dataSet = ArrayUtil.generateRandomArrays(100, -99, 99);
        ArrayUtil.display(dataSet);

        // SORT DATA
        System.out.println("DATA AFTER: ");
        ArrayUtil.selectionSortBackward(dataSet);
        ArrayUtil.display(dataSet);

        // CONFIRM; the value at index i must be less (or equal) than the value at index i+1
        for (int i = 0; i < dataSet.length - 1; i++) {
            assert (dataSet[i] >= dataSet[i + 1]);
        }

        System.out.println("TEST CASE #2A RESULTS - PASSED");
        System.out.println();
        System.out.println();
        
        
        //////////////////////////////START OF TEST 3A///////////////////////////////////
        
        System.out.println("-------------------------------");
        System.out.println("TEST CASE #3A      : Selection Sort (double/ascending)");
        System.out.println("PRE CONDITION      : unsorted array; + and - numbers");
        System.out.println("POST CONDITION     : array sorted, lowest to highest");

        // DISPLAY ARRAY
        System.out.println("DATA BEFORE: ");
        double[] data = ArrayUtil.generateDoubleRandomArrays(100, -99, 99);
        ArrayUtil.displayData(data);

        // SORT DATA
        System.out.println("DATA AFTER: ");
        ArrayUtil.selectionSortDouble(data);
        ArrayUtil.displayData(data);

        // CONFIRM; the value at index i must be less (or equal) than the value at index i+1
        for (int i = 0; i < data.length - 1; i++) {
            assert (data[i] <= data[i + 1]);
        }

        System.out.println("TEST CASE #3A RESULTS - PASSED");
        System.out.println();
        System.out.println();
        
        
        
        //////////////////////////////START OF TEST 4A///////////////////////////////////
        
        System.out.println("-------------------------------");
        System.out.println("TEST CASE #4A      : Selection Sort (double/descending)");
        System.out.println("PRE CONDITION      : unsorted array; + and - numbers");
        System.out.println("POST CONDITION     : array sorted, highest to lowest");

        // DISPLAY ARRAY
        System.out.println("DATA BEFORE: ");
        data = ArrayUtil.generateDoubleRandomArrays(100, -99, 99);
        ArrayUtil.displayData(data);

        // SORT DATA
        System.out.println("DATA AFTER: ");
        ArrayUtil.selectionSortDoubleBackward(data);
        ArrayUtil.displayData(data);

        // CONFIRM; the value at index i must be less (or equal) than the value at index i+1
        for (int i = 0; i < data.length - 1; i++) {
            assert (data[i] >= data[i + 1]);
        }

        System.out.println("TEST CASE #4A RESULTS - PASSED");
        System.out.println();
        System.out.println();
        
        
        //////////////////////////////START OF TEST 5A///////////////////////////////////
        
        System.out.println("-------------------------------");
        System.out.println("TEST CASE #5A      : Selection Sort (String/ascending)");
        System.out.println("PRE CONDITION      : unsorted array; + and - numbers");
        System.out.println("POST CONDITION     : array sorted, lowest to highest");

        // DISPLAY ARRAY
        System.out.println("DATA BEFORE: ");
        String[] dataString = ArrayUtil.generateStringArray( 20, 5 );
        ArrayUtil.displayString(dataString);

        // SORT DATA
        System.out.println("DATA AFTER: ");
        ArrayUtil.selectionSortString(dataString);
        ArrayUtil.displayString(dataString);

        // CONFIRM; the value at index i must be less (or equal) than the value at index i+1
        for (int i = 0; i < dataString.length - 1; i++) {
            assert (dataString[i + 1].compareTo(dataString[i]) > 0);
        }

        System.out.println("TEST CASE #5A RESULTS - PASSED");
        System.out.println();
        System.out.println();
        
        
        //////////////////////////////START OF TEST 6A///////////////////////////////////
        
        System.out.println("-------------------------------");
        System.out.println("TEST CASE #6A      : Selection Sort (String/descending)");
        System.out.println("PRE CONDITION      : unsorted array; + numbers");
        System.out.println("POST CONDITION     : array sorted, highest to lowest");

        // DISPLAY ARRAY
        System.out.println("DATA BEFORE: ");
        dataString = ArrayUtil.generateStringArray( 20, 4 );
        ArrayUtil.displayString(dataString);

        // SORT DATA
        System.out.println("DATA AFTER: ");
        ArrayUtil.selectionSortStringBackward(dataString);
        ArrayUtil.displayString(dataString);

        // CONFIRM; the value at index i must be less (or equal) than the value at index i+1
        for (int i = 0; i < dataString.length - 1; i++) {
            assert (dataString[i + 1].compareTo(dataString[i]) < 0);
        }

        System.out.println("TEST CASE #6A RESULTS - PASSED");
        System.out.println();
        System.out.println();
        
        
        
        //////////////////////////////START OF TEST 7A///////////////////////////////////

        System.out.println("-------------------------------");
        System.out.println("TEST CASE #7A      : Max (int)");
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
        System.out.println("TEST CASE #7A RESULTS - PASSED");
        System.out.println();
        System.out.println();
        
        //////////////////////////////START OF TEST 8A///////////////////////////////////

        System.out.println("-------------------------------");
        System.out.println("TEST CASE #8A      : Max (double)");
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
        System.out.println("TEST CASE #8A RESULTS - PASSED");
        System.out.println();
        System.out.println();
        
        
        //////////////////////////////START OF TEST 9A///////////////////////////////////

        System.out.println("-------------------------------");
        System.out.println("TEST CASE #9A      : Bubble Sort (int/ascending)");
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
        System.out.println("TEST CASE #9A RESULTS - PASSED");
        System.out.println();
        System.out.println();
        
        
        //////////////////////////////START OF TEST 10A///////////////////////////////////

        System.out.println("-------------------------------");
        System.out.println("TEST CASE #10A     : Bubble Sort (int/descending)");
        System.out.println("PRE CONDITION      : unsorted array; + and - numbers");
        System.out.println("POST CONDITION     : array sorted, highest to lowest");

        // DISPLAY ARRAY
        System.out.println("DATA BEFORE: ");
        dataSet = ArrayUtil.generateRandomArrays(100, -99, 99);
        ArrayUtil.display(dataSet);

        // SORT DATA
        System.out.println("DATA AFTER: ");
        ArrayUtil.bubbleSortBackward(dataSet);
        ArrayUtil.display(dataSet);

        // CONFIRM; the value at index i must be less (or equal) than the value at index i+1
        for (int i = 0; i < dataSet.length - 1; i++) {
            assert (dataSet[i] >= dataSet[i + 1]);
        }
        System.out.println("TEST CASE #10A RESULTS - PASSED");
        System.out.println();
        System.out.println();
        
        
        //////////////////////////////START OF TEST 11A///////////////////////////////////

        System.out.println("-------------------------------");
        System.out.println("TEST CASE #11A     : Bubble Sort (double/ascending)");
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
        System.out.println("TEST CASE #11A RESULTS - PASSED");
        System.out.println();
        System.out.println();
        
        
        //////////////////////////////START OF TEST 12A///////////////////////////////////

        System.out.println("-------------------------------");
        System.out.println("TEST CASE #12A     : Bubble Sort (double/descending)");
        System.out.println("PRE CONDITION      : unsorted array; + and - numbers");
        System.out.println("POST CONDITION     : array sorted, highest to lowest");

        // DISPLAY ARRAY
        System.out.println("DATA BEFORE: ");
        data = ArrayUtil.generateDoubleRandomArrays(100, -99, 99);
        ArrayUtil.displayData(data);

        // SORT DATA
        System.out.println("DATA AFTER: ");
        ArrayUtil.bubbleSortDoubleBackward(data);
        ArrayUtil.displayData(data);

        // CONFIRM; the value at index i must be less (or equal) than the value at index i+1
        for (int i = 0; i < data.length - 1; i++) {
            assert (data[i] >= data[i + 1]);
        }
        System.out.println("TEST CASE #12A RESULTS - PASSED");
        System.out.println();
        System.out.println();
        
        
        //////////////////////////////START OF TEST 13A///////////////////////////////////

        System.out.println("-------------------------------");
        System.out.println("TEST CASE #13A     : Bubble Sort (String/ascending)");
        System.out.println("PRE CONDITION      : unsorted array; + and - numbers");
        System.out.println("POST CONDITION     : array sorted, lowest to highest");

        // DISPLAY ARRAY
        System.out.println("DATA BEFORE: ");
        dataString = ArrayUtil.generateStringArray( 20, 4 );
        ArrayUtil.displayString(dataString);

        // SORT DATA
        System.out.println("DATA AFTER: ");
        ArrayUtil.bubbleSortString(dataString);
        ArrayUtil.displayString(dataString);

        // CONFIRM; the value at index i must be less (or equal) than the value at index i+1
        for (int i = 0; i < dataString.length - 1; i++) {
            assert (dataString[i].compareTo(dataString[i + 1]) < 0);
        }
        System.out.println("TEST CASE #13A RESULTS - PASSED");
        System.out.println();
        System.out.println();
        
        
        //////////////////////////////START OF TEST 14A///////////////////////////////////

        System.out.println("-------------------------------");
        System.out.println("TEST CASE #14A     : Bubble Sort (String/descending)");
        System.out.println("PRE CONDITION      : unsorted array; + and - numbers");
        System.out.println("POST CONDITION     : array sorted, lowest to highest");

        // DISPLAY ARRAY
        System.out.println("DATA BEFORE: ");
        dataString = ArrayUtil.generateStringArray(  20, 4 );
        ArrayUtil.displayString(dataString);

        // SORT DATA
        System.out.println("DATA AFTER: ");
        ArrayUtil.bubbleSortStringBackward(dataString);
        ArrayUtil.displayString(dataString);

        // CONFIRM; the value at index i must be less (or equal) than the value at index i+1
        for (int i = 0; i < dataString.length - 1; i++) {
            assert (dataString[i].compareTo(dataString[i + 1]) > 0);
        }
        System.out.println("TEST CASE #14A RESULTS - PASSED");
        System.out.println();
        System.out.println();
        
        
        //////////////////////////////START OF TEST 15A///////////////////////////////////

        System.out.println("-------------------------------");
        System.out.println("TEST CASE #15A      : Min (int)");
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
        System.out.println("TEST CASE #15A RESULTS - PASSED");
        System.out.println();
        System.out.println();
        
        
        //////////////////////////////START OF TEST 16A///////////////////////////////////

        System.out.println("-------------------------------");
        System.out.println("TEST CASE #16A      : Min (double)");
        System.out.println("PRE CONDITION      : sorted array; + and - numbers");
        System.out.println("POST CONDITION     : array sorted, lowest to highest");

        // DISPLAY ARRAY
        System.out.println("DATA: ");
        data = ArrayUtil.generateArithmeticSequenceForDouble(10, 0, 5);
        ArrayUtil.displayData(data);

        // SORT DATA
        double minDoubleValue = ArrayUtil.minDouble(data);
        System.out.println("Min: " + minDoubleValue);

        // CONFIRM; average is median of numbers
        ArrayUtil.minDouble(data);

        // CHECK
        assert (minDoubleValue == data[0]);
        
        System.out.println("TEST CASE #16A RESULTS - PASSED");
        System.out.println();
        System.out.println();
        
        
        //////////////////////////////START OF TEST 17A///////////////////////////////////  
        
        System.out.println("-------------------------------");
        System.out.println("TEST CASE #17A     : Average (int)");
        System.out.println("PRE CONDITION      : sorted array; + and - numbers");
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

        assert (average == (( (dataSet[0] + dataSet[dataSet.length-1]) / 2)));
        System.out.println("Average (check): " + (dataSet.length * ((dataSet[0] + dataSet[dataSet.length-1]) / 2) / dataSet.length ));
        
        System.out.println("TEST CASE #17A RESULTS - PASSED \n\n");
        
        
        //////////////////////////////START OF TEST 18A///////////////////////////////////  
        
        System.out.println("-------------------------------");
        System.out.println("TEST CASE #18A     : Average (double)");
        System.out.println("PRE CONDITION      : sorted array; + and - numbers");
        System.out.println("POST CONDITION     : array sorted, lowest to highest");

        // DISPLAY ARRAY
        System.out.println("DATA: ");
        data = ArrayUtil.generateArithmeticSequenceForDouble(10, 0, 5);
        ArrayUtil.displayData(data);

        // SORT DATA
        double averageValue = ArrayUtil.averageDouble(data);
        System.out.println("Average: " + averageValue);

        // CONFIRM; average is median of numbers
        ArrayUtil.averageDouble(data);

        assert (averageValue == (( (data[0] + data[data.length-1]) / 2)));
        System.out.println("Average (check): " + (data.length * ((data[0] + data[data.length-1]) / 2) / data.length ));
        
        System.out.println("TEST CASE #18A RESULTS - PASSED");
        System.out.println();
        System.out.println();

        
        //////////////////////////////START OF TEST 19A///////////////////////////////////
        
        System.out.println("-------------------------------");
        System.out.println("TEST CASE #19A      : Sum (int)");
        System.out.println("PRE CONDITION      : sorted array; + and - numbers");
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
        
        System.out.println("TEST CASE #19A RESULTS - PASSED");
        System.out.println();
        System.out.println();

        
        //////////////////////////////START OF TEST 20A///////////////////////////////////
        
        System.out.println("-------------------------------");
        System.out.println("TEST CASE #20A      : Sum (double)");
        System.out.println("PRE CONDITION      : sorted array; + and - numbers");
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
        
        System.out.println("TEST CASE #20A RESULTS - PASSED");
        System.out.println();
        System.out.println();
        
        
        //////////////////////////////START OF TEST 21A///////////////////////////////////

        System.out.println("-------------------------------");
        System.out.println("TEST CASE #21A     : Linear Search (int)");
        System.out.println("PRE CONDITION      : unsorted array; + and - numbers");
        System.out.println("POST CONDITION     : array sorted, lowest to highest");

        // DISPLAY ARRAY
        System.out.println("DATA: ");
        dataSet = ArrayUtil.generateRandomArrays(100, -99, 99);
        ArrayUtil.display(dataSet);
        ArrayUtil.linearSearch( dataSet, searchValue );

        // FIND DATA
        for( int i = 0; i < dataString.length; i++ ) {
            assert( ArrayUtil.linearSearch( dataSet, dataSet[i] ) == i );
        }
        assert( ArrayUtil.linearSearch( dataSet, 100 ) == -1 );
        System.out.println("TEST CASE #21A RESULTS - PASSED");
        System.out.println();
        System.out.println();  
        
      
        //////////////////////////////START OF TEST 22A///////////////////////////////////

        System.out.println("-------------------------------");
        System.out.println("TEST CASE #22A     : Linear Search (double)");
        System.out.println("PRE CONDITION      : unsorted array; + and - numbers");
        System.out.println("POST CONDITION     : array sorted, lowest to highest");

        // DISPLAY ARRAY
        System.out.println("DATA: ");
        data = ArrayUtil.generateDoubleRandomArrays(100, -99, 99);
        ArrayUtil.displayData(data);
        ArrayUtil.linearSearchDouble( data, search );

        // FIND DATA
        for( int i = 0; i < dataString.length; i++ ) {
            assert( ArrayUtil.linearSearchDouble( data, data[i] ) == i );
        }
        assert( ArrayUtil.linearSearchDouble( data, 100 ) == -1 );
        System.out.println("TEST CASE #22A RESULTS - PASSED");
        System.out.println();
        System.out.println();
        
        
        //////////////////////////////START OF TEST 23A///////////////////////////////////

        System.out.println("-------------------------------");
        System.out.println("TEST CASE #23A     : Linear Search (String)");
        System.out.println("PRE CONDITION      : unsorted array; random strings ");
        System.out.println("POST CONDITION     : the value you search for is the index of the location");
        
        // DISPLAY ARRAY
        System.out.println("DATA: ");
        dataString = ArrayUtil.generateStringArray( 20, 4 );
        ArrayUtil.displayString(dataString);

        // FIND DATA
        for( int i = 0; i < dataString.length; i++ ) {
            assert( ArrayUtil.linearSearch( dataString, dataString[i] ) == i );
        }
        assert( ArrayUtil.linearSearch( dataString, "aaaaa" ) == -1 );
        System.out.println("TEST CASE #23A RESULTS - PASSED");
        System.out.println();
        System.out.println();
        
        
        //////////////////////////////START OF TEST 24A///////////////////////////////////

        System.out.println("-------------------------------");
        System.out.println("TEST CASE #24A     : Binary Search (int/ascending)");
        System.out.println("PRE CONDITION      : sorted array; + and - numbers");
        System.out.println("POST CONDITION     : array sorted, lowest to highest");

        // DISPLAY ARRAY
        System.out.println("DATA: ");
        dataSet = ArrayUtil.generateArithmeticSequence(100, -99, 99);
        ArrayUtil.display(dataSet);

        // FIND DATA
        for( int i = 0; i < dataString.length; i++ ) {
            assert( ArrayUtil.binarySearch( dataSet, dataSet[i] ) == i );
        }
        assert( ArrayUtil.binarySearch( dataSet, 100 ) == -1 );
        System.out.println("TEST CASE #24A RESULTS - PASSED");
        System.out.println();
        System.out.println();
        
        
        //////////////////////////////START OF TEST 25A///////////////////////////////////

        System.out.println("-------------------------------");
        System.out.println("TEST CASE #25A     : Binary Search (int/descending)");
        System.out.println("PRE CONDITION      : sorted array; + and - numbers");
        System.out.println("POST CONDITION     : array sorted, lowest to highest");

        // DISPLAY ARRAY
        System.out.println("DATA: ");
        dataSet = ArrayUtil.generateArithmeticSequenceBackward(100, 99, 1);
        ArrayUtil.display(dataSet);

        // FIND DATA
        for( int i = 0; i < dataString.length; i++ ) {
            assert( ArrayUtil.binarySearchBackward( dataSet, dataSet[i] ) == i );
        }
        assert( ArrayUtil.binarySearch( dataSet, 100 ) == -1 );
        System.out.println("TEST CASE #25A RESULTS - PASSED");
        System.out.println();
        System.out.println();
        
        
        //////////////////////////////START OF TEST 26A///////////////////////////////////

        System.out.println("-------------------------------");
        System.out.println("TEST CASE #26A     : Binary Search (double/ascending)");
        System.out.println("PRE CONDITION      : sorted array; + and - numbers");
        System.out.println("POST CONDITION     : array sorted, lowest to highest");

        // DISPLAY ARRAY
        System.out.println("DATA: ");
        data = ArrayUtil.generateArithmeticSequenceForDouble(100, 0, 1);
        ArrayUtil.displayData(data);

        // FIND DATA
        for( int i = 0; i < dataString.length; i++ ) {
            assert( ArrayUtil.binarySearchDouble( data, data[i] ) == i );
        }
        assert( ArrayUtil.binarySearchDouble( data, 100 ) == -1 );
        System.out.println("TEST CASE #26A RESULTS - PASSED");
        System.out.println();
        System.out.println();
        
        
        //////////////////////////////START OF TEST 27A///////////////////////////////////

        System.out.println("-------------------------------");
        System.out.println("TEST CASE #27A     : Binary Search (double/descending)");
        System.out.println("PRE CONDITION      : sorted array; + and - numbers");
        System.out.println("POST CONDITION     : array sorted, lowest to highest");

        // DISPLAY ARRAY
        System.out.println("DATA: ");
        data = ArrayUtil.generateArithmeticSequenceDoubleBackward(100, 99, 1);
        ArrayUtil.displayData(data);
        ArrayUtil.binarySearchDoubleBackward(data, search);

        
        // FIND DATA
        for( int i = 0; i < dataString.length; i++ ) {
            assert( ArrayUtil.binarySearchDoubleBackward( data, data[i] ) == i );
        }
        assert( ArrayUtil.binarySearchDouble( data, 100 ) == -1 );
        System.out.println("TEST CASE #27A RESULTS - PASSED");
        System.out.println();
        System.out.println();
        
        
        //////////////////////////////START OF TEST 28A///////////////////////////////////

        System.out.println("-------------------------------");
        System.out.println("TEST CASE #28A     : Binary Search (String/ascending)");
        System.out.println("PRE CONDITION      : sorted array; + and - numbers");
        System.out.println("POST CONDITION     : array sorted, lowest to highest");

        // DISPLAY ARRAY
        System.out.println("DATA: ");
        dataString = ArrayUtil.generateArithmeticStringSequence();
        ArrayUtil.displayString(dataString);

        // FIND DATA
        for( int i = 0; i < dataString.length; i++ ) {
            assert( ArrayUtil.binarySearchString( dataString, dataString[i] ) == i);
        }
        assert( ArrayUtil.binarySearchString( dataString, "aaaaa" ) == -1 );
        System.out.println("TEST CASE #28A RESULTS - PASSED");
        System.out.println();
        System.out.println();
        
        
        //////////////////////////////START OF TEST 29A///////////////////////////////////

        System.out.println("-------------------------------");
        System.out.println("TEST CASE #29A     : Binary Search (String/descending)");
        System.out.println("PRE CONDITION      : sorted array; + and - numbers");
        System.out.println("POST CONDITION     : array sorted, lowest to highest");

        // DISPLAY ARRAY
        System.out.println("DATA: ");
        dataString = ArrayUtil.generateArithmeticSequenceStringBackward();
        ArrayUtil.displayString(dataString);

        // FIND DATA
        for( int i = 0; i < dataString.length; i++ ) {
            assert( ArrayUtil.binarySearchStringBackward( dataString, dataString[i] ) == i);
        }
        assert( ArrayUtil.binarySearchString( dataString, "aaaaa" ) == -1 );
        System.out.println("TEST CASE #29A RESULTS - PASSED");
        System.out.println();
        System.out.println();
        
    }
}
