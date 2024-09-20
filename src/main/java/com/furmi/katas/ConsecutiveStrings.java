package com.furmi.katas;

public class ConsecutiveStrings {

    public static String longestConsec(String[] strarr, int k) {
        // your code
        if (strarr.length==0 || k <= 0 || k > strarr.length){
            return "";
        }
        String longest = "";
        for (int i = 0; i <= strarr.length-k; i++){
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < k; j++){
                sb.append(strarr[i+j]);
            }
            if (sb.length() > longest.length()){
                longest = sb.toString();
            }
        }
        return longest;
    }
}
