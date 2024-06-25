package com.furmi.codilityKurs;

public class MaxNonoverlappingSegment {
    public int solution(int[] A, int[] B) {
        // Implement your solution here
        if (A.length == 0){
            return 0;
        }

        int N = A.length;
        int currentLeftEnd = A[N-1];
        int numOnonOverlapp = 1;

        for (int i = N-2; i >= 0; i--){
            if (B[i] < currentLeftEnd){
                numOnonOverlapp++;
                currentLeftEnd = A[i];
            }
            if (A[i] > currentLeftEnd){
                currentLeftEnd = A[i];
            }
        }
        return numOnonOverlapp;
    }
}
