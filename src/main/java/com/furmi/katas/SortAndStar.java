package com.furmi.katas;

import java.util.Arrays;
import java.util.stream.Collectors;

public class SortAndStar {

    public static String twoSort(String[] s) {
        String s1 = Arrays.stream(s).sorted()
                .findFirst()
                .get();
        String res = "";
        char[] charArray = s1.toCharArray();
        for (int i = 0; i < charArray.length; i++){
            if (i == 0){
                res += charArray[i] + "***";
            }else if (i == charArray.length - 1){
                res += charArray[i];
            }else {
                res +=  charArray[i] + "***";
            }
        }
        return res;
    }
}
