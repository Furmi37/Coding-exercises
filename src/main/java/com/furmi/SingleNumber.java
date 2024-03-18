package com.furmi;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SingleNumber {
    // 4 1 2 1 2
    public int singleNumber(int[] nums) {
        Set<Integer> set = new HashSet<>();

        for (int num : nums) {
            if (set.contains(num)) {
                set.remove(num);
            } else {
                set.add(num);
            }
        }
        Iterator<Integer> it = set.iterator();
        return it.next();
    }
}

