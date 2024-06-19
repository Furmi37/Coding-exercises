package com.furmi.codility;

import java.util.Arrays;

public class MaxSliceSum {
    public int solution(int[] A) {
        // Implement your solution here

        int maxSum = Integer.MIN_VALUE;
        int localSum = 0;
        for (int i = 0; i < A.length; i++){
            localSum = Math.max(localSum+ A[i], A[i]);
            maxSum = Math.max(maxSum, localSum);
        }
        return maxSum;
    }
}
