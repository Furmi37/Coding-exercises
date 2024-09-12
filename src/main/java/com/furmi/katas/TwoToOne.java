package com.furmi.katas;

import java.util.stream.Collectors;

public class TwoToOne {

    public static String longest (String s1, String s2) {
        // your code
        String res = s1 + s2;
        return res.chars()
                .distinct()
                .sorted()
                .mapToObj(i -> (char) i)
                .map(String::valueOf)
                .collect(Collectors.joining());
    }
}
