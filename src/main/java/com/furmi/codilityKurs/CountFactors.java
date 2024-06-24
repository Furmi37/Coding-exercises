package com.furmi.codilityKurs;

public class CountFactors {
    public int solution(int N) {
        // Implement your solution here
        int factor = 0;
        if (N ==0){
            return 0;
        }

        for (int i = 1; i <= N; i++){
            if (N % i == 0){
                factor++;
            }
        }
        return factor;
    }
}
