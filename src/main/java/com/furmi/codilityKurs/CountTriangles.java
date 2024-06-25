package com.furmi.codilityKurs;

import java.util.Arrays;

public class CountTriangles {
    public static void main(String[] args) {
        int [] arr = new int[]{10,2,5,1,8,12};
        System.out.println(solution(arr));
    }
    public static int solution(int[] A) {
        // Implement your solution here
       int numTriangle =0;
        Arrays.sort(A);

        for (int i = 0; i < A.length-2; i++){
            int leftEnd = i+1;
            int rightEnd = i +2;
            while(leftEnd < A.length-1){
                if (rightEnd < A.length && A[i] + A[leftEnd] > A[rightEnd]){
                    rightEnd++;
                }else {
                    numTriangle = numTriangle + (rightEnd-leftEnd-1);
                    leftEnd++;
                }
            }
        }
        return numTriangle;
    }
}
