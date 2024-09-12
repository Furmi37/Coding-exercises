package com.furmi.katas;

import java.util.Arrays;

public class SumOfDifferencesInArray {
    public static int sumOfDifferences(int[] arr) {
        //your code;

        Arrays.sort(arr);
        return arr.length <= 1? 0 : arr[arr.length - 1] - arr[0];
    }
}
