package com.furmi.codility;

public class PassingCars {

    public int solution(int[] A) {
        // Implement your solution here
        int pairCount =0;
        for(int i = 0; i < A.length; i++){
            if (A[i] == 0){
                for (int j = i+1; j < A.length; j++){
                    if (A[j] == 1){
                        pairCount++;
                    }
                }
            }
        }
        if (pairCount > 1_000_000_000 || pairCount < 0){
            return -1;
        }
        return pairCount;
    }
    public int passingCars (int [] A){
        int passEast =0;
        int passCount =0;

        for (int i = 0; i <A.length; i++){
            if (A[i] == 0){
                passEast++;
            }
            if (A[i] == 1){
                passCount += passEast;
            }
        }
        if (passCount > 1000000 || passCount < 0){
            return -1;
        }else {
            return passCount;
        }
    }
}
