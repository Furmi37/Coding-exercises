package com.furmi.codility;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TapeEquilibrium {
    public static void main(String[] args) {
        int[] ints = {3, 1, 2, 4, 3};
        solution(ints);
    }
    public static int solution(int[] A) {
        // Implement your solution here
        int len = A.length;
        int [] sumSoFar = new int [len];

        sumSoFar[0] = A[0];
        for (int i =1 ; i < len; i++){
            sumSoFar[i] = A[i] + sumSoFar[i-1];
        }

        int min = Integer.MAX_VALUE;
        int total = sumSoFar[len-1];

        for (int i =0; i < len; i++){
            int larger = Math.max(sumSoFar[i], total - sumSoFar[i]);
            int smaller = Math.min(sumSoFar[i], total - sumSoFar[i]);
            min = Math.min(min,larger-smaller);
        }
        return min;
    }
}
