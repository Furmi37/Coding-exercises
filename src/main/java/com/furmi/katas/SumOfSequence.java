package com.furmi.katas;

public class SumOfSequence {
    public static int sequenceSum(int start, int end, int step) {
        // write your code here
        int sum = 0;
        for(int i = start; i <= end; i+= step){
            sum += i;
        }

        return sum;
    }
    //int sum = 0;
    //    for (int i = start; i <= end; i += step) sum += i;
    //    return sum;
}
