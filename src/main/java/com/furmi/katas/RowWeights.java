package com.furmi.katas;

public class RowWeights {
    public static void main(String[] args) {
        int[] ints = {13, 27, 49};
        rowWeights(ints);
    }
    public static int[] rowWeights (final int[] weights)
    {
        int teamOne = 0;
        int teamTwo = 0;
        for (int i = 0; i < weights.length;i++){
            if (i % 2 != 0){
                teamTwo += weights[i];
            } else if (i % 2 == 0) {
                teamOne += weights[i];
            }
        }
        return new int[]{teamOne, teamTwo}; // Do your magic!
    }
}
