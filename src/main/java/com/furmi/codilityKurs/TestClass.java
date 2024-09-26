package com.furmi.codilityKurs;

import java.util.Arrays;

public class TestClass {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{1,2,3,4,5}, 4)));
    }
    public static int[] solution(int[] A, int K) {
        // Implement your solution here
//        int [] res = new int[A.length];
//        K = K % A.length;
//        int index = 0;
//        if (A.length ==0){
//            return res;
//        }
//        // 3, 8, 9, 7, 6
//        for (int i = A.length - K; i < A.length; i++){
//            res[index++] = A[i];
//        }
//
//        for (int i = 0; i < A.length - K; i++){
//            res[index++] = A[i];
//        }
//        return res;
        int []res = new int[A.length];
                int length = A.length;
                 K = K % A.length;


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
