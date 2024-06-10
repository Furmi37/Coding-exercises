package com.furmi.katas;

import java.util.List;

public class SumMixedArray {
    public int sum(List<?> mixed) {
        return mixed.stream().mapToInt(o -> Integer.parseInt(o.toString())).sum();
    }
}
