package com.furmi.codilityKurs;

import java.util.Arrays;

public class MissingPermElem {
    public int solution(int[] A) {
        // Implement your solution here
        Arrays.sort(A);
        int missingEl = 0;

        for (int i = 1; i < A.length; i++){
            if (A[i] - A[i-1] != 1){
                missingEl = A[i] -1;
            }
        }
        return missingEl;
    }
}
