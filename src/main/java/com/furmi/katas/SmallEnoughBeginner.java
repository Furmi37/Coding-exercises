package com.furmi.katas;

public class SmallEnoughBeginner {

    public static boolean smallEnough(int[] a, int limit)
    {
        int check = 0;
        for (int i : a){
            if (i < limit || i == limit){
                check++;
            }
        }
        return check == a.length;
    }
}
