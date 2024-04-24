package com.furmi.katas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;

public class TheHighestProfitWins {

    class MinMax {
        public static int[] minMax(int[] arr) {
            // Your awesome code here
            Arrays.sort(arr);
            int [] result = new int[2];
            result[0] = arr[0];
            result[1] = arr[arr.length-1];
            return result;
            // return new int[]{arr[0], arr[arr.length-1]};
        }
    }
}
