package com.furmi.codilityKurs;

import java.util.Arrays;

public class MaxProductOfThree {
    public int solution(int[] A) {
        // Implement your solution here
        int max = 0;
        Arrays.sort(A);

        return Math.max(A[0]*A[1]*A[A.length-1],A[A.length-3]*A[A.length-2]* A[A.length-1]);
    }
}
