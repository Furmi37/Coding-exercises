package com.furmi.katas;

import java.util.List;

public class OnesAndZeros {

    public static int ConvertBinaryArrayToInt(List<Integer> binary) {
        // Your Code
        String res = "";

        for (int i : binary)
            res += i;

        return Integer.parseInt(res, 2);    }
}
