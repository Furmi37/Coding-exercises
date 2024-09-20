package com.furmi.katas;

import java.util.Arrays;

public class SumWithoutHighestAndLowestNumber {

    public static int sum(int[] numbers)
    {
        if (numbers == null || numbers.length == 0 || numbers.length == 1){
            return 0;
        }
        Arrays.sort(numbers);
        int sum =0;
        for (int i = 1; i < numbers.length -1; i++){
            sum += numbers[i];
        }
        return sum;
    }
}
