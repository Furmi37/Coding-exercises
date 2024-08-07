package com.furmi.katas;

import java.util.Arrays;

public class SumTwoLowestPositiveIntegers {
    public static long sumTwoSmallestNumbers(final long [] numbers) {
        //Your solution here
        Arrays.sort(numbers);
        return numbers[0]+numbers[1];
    }
}
