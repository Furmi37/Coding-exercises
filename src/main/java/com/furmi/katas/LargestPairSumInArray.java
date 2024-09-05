package com.furmi.katas;

import java.util.Arrays;

public class LargestPairSumInArray {

    public static int largestPairSum(int[] numbers){
        // your code here
        int[] array = Arrays.stream(numbers)
                .sorted()
                .toArray();
        return array[array.length-1] + array[array.length-2];
    }
}
