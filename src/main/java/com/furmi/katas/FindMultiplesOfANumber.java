package com.furmi.katas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindMultiplesOfANumber {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(find(5,7)));
    }
    public static int[] find(int base, int limit) {
        // your code here
        List<Integer> list = new ArrayList<>();
        int [] res = new int[limit/base];
        int index = 0;
        list.add(base);
//        res[0] = base;

        while (list.get(index) < limit && list.get(index) + base <= limit) {
            list.add(list.get(index) + base);
            index++;
        }
        return list.stream().mapToInt(x -> x).toArray();
    }
}
