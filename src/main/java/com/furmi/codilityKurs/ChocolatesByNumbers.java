package com.furmi.codilityKurs;

import java.util.HashSet;
import java.util.Set;

public class ChocolatesByNumbers {
    public static void main(String[] args) {
        System.out.println(solution1(10,4));
    }

    public static int solution1 (int N, int M){
        Set<Integer>set = new HashSet<>();

        int currentNumber = 0;
        set.add(currentNumber);
        int numChocolate = 1;

        while(true){
            currentNumber = (currentNumber + M) % N;
            if (set.contains(currentNumber) == true){
                break;
            }else{
                numChocolate++;
                set.add(currentNumber);
            }
        }
        return numChocolate;
    }
}
