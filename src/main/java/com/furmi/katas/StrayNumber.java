package com.furmi.katas;

import java.util.HashSet;
import java.util.Set;

public class StrayNumber {

    static int stray(int[] numbers) {
        Set<Integer> set = new HashSet<>();
        for (int i : numbers){
            if (!set.contains(i)){
                set.add(i);
            }else{
                set.remove(i);
            }
        }
        Object[] array = set.stream().toArray();
        return (int)array[0];
    }
}
