package com.furmi.codilityKurs;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class CountDistinctSlices {
    public int solution(int M, int[] A) {
        // Implement your solution here
       boolean [] seen = new boolean[M+1];
       int leftEnd = 0;
       int rightEnd = 0;
       int numOfSlices = 0;

       while (leftEnd < A.length && rightEnd < A.length){
           if (seen[A[rightEnd]] == false){
               numOfSlices = numOfSlices + (rightEnd -leftEnd + 1);

               if (numOfSlices > 1_000_000_000){
                   return 1_000_000_000;
               }
               seen[A[rightEnd]] = true;
               rightEnd++;
           }else {
               seen[A[leftEnd]] = false;
               leftEnd++;
           }
       }
       return numOfSlices;
    }
}
