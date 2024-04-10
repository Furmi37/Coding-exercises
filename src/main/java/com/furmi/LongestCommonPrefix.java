package com.furmi;

public class LongestCommonPrefix {
//
public static void main(String[] args) {
    String [] strings = {"dog","racecar","car"};
    System.out.println(longestCommonPrefix(strings));
}
    public static String longestCommonPrefix(String[] strs) {
        String prefix = strs[0];

        for (int index = 1; index < strs.length; index++){
            while(strs[index].indexOf(prefix) != 0){
                prefix = prefix.substring(0,prefix.length()-1);
            }
        }
        return prefix;
    }
}
