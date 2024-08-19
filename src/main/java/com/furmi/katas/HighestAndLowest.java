package com.furmi.katas;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class HighestAndLowest {
    public static String highAndLow(String numbers) {
        // Code here or
        var stats = Arrays.stream(numbers.split(" ")).mapToInt(Integer::parseInt).summaryStatistics();
        return stats.getMax() + " " + stats.getMin();
    }
}
