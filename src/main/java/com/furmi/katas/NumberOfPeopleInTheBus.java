package com.furmi.katas;

import java.util.ArrayList;

public class NumberOfPeopleInTheBus {
    public static void main(String[] args) {
        ArrayList<int[]> list = new ArrayList<int[]>();
        list.add(new int[] {10,0});
        list.add(new int[] {3,5});
        list.add(new int[] {2,5});
        System.out.println(countPassengers(list));
    }

    public static int countPassengers(ArrayList<int[]> stops) {
        //1 ws x, wys y
        int passenger = 0;
        for (int i = 0; i < stops.size(); i++){
            int [] stop = stops.get(i);
                passenger += stop[0];
                passenger -= stop[1];

        }
        return passenger;
    }
}
