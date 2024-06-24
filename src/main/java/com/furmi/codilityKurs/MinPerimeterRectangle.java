package com.furmi.codilityKurs;

import java.util.ArrayList;
import java.util.List;

public class MinPerimeterRectangle {
    public static void main(String[] args) {
        System.out.println(solution(30));
    }
    public static int solution(int N) {
        // Implement your solution here
        if (N == 0){
            return 0;
        }
        int a,b =0;
        int perimeter = Integer.MAX_VALUE;
        int sqrtN = (int)Math.sqrt(N);
        for (int i = 1; i <= sqrtN; i++) {
            if (N % i == 0) {
                a = N/i;
                b = N/a;
                int currPeri = 2 *(a+b);
                perimeter = Math.min(perimeter, currPeri);
            }
        }
        return perimeter;
    }
}
