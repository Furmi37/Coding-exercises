package com.furmi.leet;

public class CountPairsThatFormACompleteDat {

    public int countCompleteDayPairs(int[] hours) {
        int fullDay = 0;
        if (hours.length == 0){
            return 0;
        }
        for(int i = 0; i < hours.length-1;i++){
            for (int j = i+1; j < hours.length; j++){
                if ((hours[i] + hours[j]) % 24 == 0){
                    fullDay++;
                }
            }
        }
        return fullDay;
    }
}
