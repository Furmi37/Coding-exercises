package com.furmi.katas;

import java.util.Arrays;

public class HowGoodAreYouRelly {

    public static boolean betterThanAverage(int[] classPoints, int yourPoints) {
    int allPoints = Arrays.stream(classPoints).sum();
    int average = allPoints/classPoints.length;
    return yourPoints > average;
    }
}
