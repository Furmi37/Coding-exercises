package com.furmi.katas;

public class HowManyStairsWillSuzukiClimbInTwentyYears {

    public static long stairsIn20(int[][] stairs)
    {
        long result =0;
        for (int i = 0; i < stairs.length; i++){
            for (int j = 0; j < stairs[i].length; j++){
                result += stairs[i][j];
            }
        }
        return result;
    }
}
