package com.furmi.katas;

import java.util.Arrays;

public class SumArrays {
    public static double sum(double[] numbers) {
        if (numbers.length == 0){
            return 0;
        }
        return Arrays.stream(numbers).sum();
    }
}
