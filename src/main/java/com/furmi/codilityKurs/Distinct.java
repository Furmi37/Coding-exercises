package com.furmi.codilityKurs;

import java.util.HashSet;
import java.util.Set;

public class Distinct {
    public int solution(int[] A) {
        // Implement your solution here
        Set<Integer> set = new HashSet<>();

        for (int i : A){
            if (!set.contains(i)){
                set.add(i);
            }
        }
        return set.size();
    }
}
