package com.furmi.katas;

import java.util.ArrayList;
import java.util.List;

public class LarioAndMuigiPipeProblem {
    public static int[] pipeFix(int[] numbers) {
        // Fix the pipes!
        int first_element=numbers[0];
        int last_element=numbers[numbers.length - 1];
        int iterations=last_element+1-first_element;
        int[]arr=new int[iterations];
        for(int i=0;i<iterations;i++){
            arr[i]=i+first_element;
        }
        return arr;
    }
}
