package com.furmi.katas;

public class PowersOf2 {
    public static long[] powersOfTwo(int n){
        if (n == 0){
            return new long[]{1};
        }
        long[] longs = new long[n+1];
        for (int i = 0; i < longs.length; i++){
            longs[i] = (long)Math.pow(2, i);
        }
        return longs;
    }
}
