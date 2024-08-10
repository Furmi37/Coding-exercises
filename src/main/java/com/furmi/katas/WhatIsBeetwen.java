package com.furmi.katas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class WhatIsBeetwen {
    public static int[] between(int a, int b) {
        return IntStream.rangeClosed(a,b).toArray();
    }
}
