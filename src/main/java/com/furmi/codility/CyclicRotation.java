package com.furmi.codility;

import java.util.Arrays;

public class CyclicRotation {
    public static void main(String[] args) {
        int [] ints = new int[]{3,8, 9,7,6};
        System.out.println(Arrays.toString(solution(ints,3)));
    }

    public static int[] solution(int[] A, int K) {
        // Implement your solution here
        int []res = new int[A.length];
        int length = A.length;
        K = K % length;

        if (length == 0){
            return res;
        }
        int index = 0;

        for(int i = length - K; i < length; i++){
            res[index++]= A[i];
        }
        for (int i = 0; i < length-K; i++) {
            res[index++] = A[i];
        }
        return res;
    }
}
