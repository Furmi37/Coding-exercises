package com.furmi.codilityKurs;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class PermCheck {
    public int solution(int[] A) {
        // Implement your solution here
        Arrays.sort(A);
        for (int i = 1; i < A.length; i++){
            if (A[i] - A[i-1] != 1){
                return 0;
            }
        }
        return 1;
    }
    public int solution1(int[] A) {
        // Implement your solution here
        Set<Integer> set = new HashSet<Integer>();

        for(int i=0; i < A.length; i++){
            set.add(A[i]);
        }
        for(int i=1; i<= A.length; i++){
            if( set.contains(i) == false )
                return 0;
        }


        return 1;
    }
}
