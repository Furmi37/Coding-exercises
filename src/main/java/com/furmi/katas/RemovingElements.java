package com.furmi.katas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemovingElements {
    public static Object[] removeEveryOther(Object[] arr) {
        // happy coding
        List<Object> list = new ArrayList<>();
        for(int i=0; i<arr.length; i++){
            if(i%2==0){
                list.add(arr[i]);
            }
        }
        return list.toArray();
    }
}
