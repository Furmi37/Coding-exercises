package com.furmi.katas;

import java.util.Arrays;

public class YouOnlyNeedOneBeginner {
    public static boolean check(Object[] a, Object x) {
//        for (int i =0; i< a.length; i++){
//            if (a[i].equals(x)){
//                return true;
//            }
//        }
//        return false;
        return Arrays.asList(a).contains(x);
    }
}
