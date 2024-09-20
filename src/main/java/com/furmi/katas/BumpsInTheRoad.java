package com.furmi.katas;

public class BumpsInTheRoad {

    public static String bumps(final String road) {
        int bumps = 0;
        for (char c : road.toCharArray()){
            if (c == 'n'){
                bumps++;
            }
        }
//        road.chars().filter(ch -> ch == 'n').count() <= 15? "Woohoo!" : "Car Dead";
        return bumps <= 15? "Woohoo!" : "Car Dead";
    }
}
