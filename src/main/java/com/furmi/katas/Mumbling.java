package com.furmi.katas;


import java.util.Arrays;

public class Mumbling {

    public static String accum(String s) {

        String[] letters = s.toUpperCase().split("");
        for (int i = 0; i < letters.length; ++i) {
            letters[i] += letters[i].toLowerCase().repeat(i);
        }

        return String.join("-", letters);
    }
}

