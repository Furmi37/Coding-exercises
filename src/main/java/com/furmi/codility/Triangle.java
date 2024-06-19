package com.furmi.codility;

import java.util.Arrays;

public class Triangle {
    public int solution(int[] A) {
        // Implement your solution here
        int len = A.length;
        if (len < 3) return 0;
        Arrays.sort(A);

        for (int i = 2; i < len; i++){
            if (A[len-1] < A[i] + A[i-1]){
                return 1;
            }
        }
        return 0;
    }
}
