package com.furmi.codilityKurs;

import java.util.HashSet;
import java.util.Set;

public class AbsDistinct {
    public static void main(String[] args) {
        int []arr = new int[]{-5,-3,-1,0,3,6};
        System.out.println( solution(arr));
    }
    public static int solution(int[] A) {
        // Implement your solution here
        Set<Integer> set = new HashSet<>();
        if (A.length == 0){
            return 0;
        }
        for (int i : A){
            int abs = Math.abs(i);
            if (!set.contains(abs)){
                set.add(abs);
            }else{

            }
        }
        return set.size();
    }
}
