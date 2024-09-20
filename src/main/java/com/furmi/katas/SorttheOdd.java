package com.furmi.katas;

import java.util.Arrays;

public class SorttheOdd {

    public static int[] sortArray(int[] array) {
        int[] sortedOdd = Arrays.stream(array).filter(n -> n % 2 == 1).sorted().toArray();

        for (int j = 0, s = 0; j < array.length; j++){
            if (array[j] % 2 ==1) {
                array[j] = sortedOdd[s++];
            }
        }
        return array;
    }
}
