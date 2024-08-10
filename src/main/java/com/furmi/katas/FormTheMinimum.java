package com.furmi.katas;

import java.util.Arrays;

public class FormTheMinimum {

    public static int minValue(int[] values){
        return Arrays.stream(values)
                .distinct()
                .sorted()
                .mapToObj(String::valueOf)
                .reduce(String::concat)
                .map(Integer::valueOf)
                .orElseThrow(UnsupportedOperationException::new);

    }
}
