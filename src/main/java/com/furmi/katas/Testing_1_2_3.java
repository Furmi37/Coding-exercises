package com.furmi.katas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Testing_1_2_3 {
    public static List<String> number(List<String> lines) {
        String[] result = new String[lines.size()];
        for (int i = 0; i < lines.size(); i++) {
            result[i] = (i+1) + ": " + lines.get(i);
        }
        return Arrays.stream(result).toList();
    }
}
