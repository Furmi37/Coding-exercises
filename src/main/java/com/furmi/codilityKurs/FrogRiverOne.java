package com.furmi.codilityKurs;

import java.util.HashSet;
import java.util.Set;

public class FrogRiverOne {
    public int solution(int X, int[] A) {
        // Implement your solution here
        Set<Integer> set = new HashSet<>();
        for (int i = 1; i <= X; i++){
            set.add(i);
        }

        for (int i = 0; i < A.length; i++){
            if (set.contains(A[i])){
                set.remove(A[i]);
            }
            if (set.isEmpty()){
                return i;
            }
        }
        return -1;
    }
}
