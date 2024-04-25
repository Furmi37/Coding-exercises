package com.furmi.katas;

import java.util.*;

public class RemoveTheMinimum {

    public static int[] removeSmallest(int[] numbers) {
        //show me the code!
        List<Integer> list = new ArrayList<>();

        if (numbers.length <= 1){
            return new int[0];
        }

        for (int i : numbers){
            list.add(i);
        }
        Integer min = Collections.min(list);
        list.remove(min);
        int [] result = new int[list.size()];
        for (int i =0; i < list.size(); i++){
            result[i] = list.get(i);
        }
        return result;
        }
}
