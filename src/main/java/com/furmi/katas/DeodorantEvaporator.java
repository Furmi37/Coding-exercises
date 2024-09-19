package com.furmi.katas;

public class DeodorantEvaporator {
    public static void main(String[] args) {
        System.out.println(evaporator(10,10,5));
    }
    public static int evaporator(double content, double evap_per_day, double threshold) {
        double v = content * (threshold / 100);
        int days = 0;
        while(content > v){
            content -= (content*evap_per_day/100);
            days++;
        }
        return days;
    }
}
