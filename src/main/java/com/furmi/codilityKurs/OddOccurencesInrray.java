package com.furmi.codilityKurs;

import java.util.HashSet;
import java.util.Set;

public class OddOccurencesInrray {

    public int solution(int[] A) {
        // Implement your solution here
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < A.length; i++){
            if (set.contains(A[i])){
                set.remove(A[i]);
            }else {
                set.add(A[i]);
            }
        }
        Object[] array = set.toArray();
        return (int)array[0];
    }
}
