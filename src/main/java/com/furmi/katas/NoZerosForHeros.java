package com.furmi.katas;

import javax.sound.midi.Soundbank;

public class NoZerosForHeros {
    public static void main(String[] args) {
        System.out.println(noBoringZeros(1450));
    }

    public static int noBoringZeros(int n) {
        return n == 0 || n % 10 != 0 ? n : noBoringZeros(n / 10);
    }
}