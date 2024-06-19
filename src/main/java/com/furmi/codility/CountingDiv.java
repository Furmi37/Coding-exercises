package com.furmi.codility;

public class CountingDiv {
    public int solution(int A, int B, int K) {
        // Implement your solution here
        int div = 0;
        for (int i = A; i <= B; i++){
            if (i % K == 0){
                div++;
            }
        }
        return div;
    }
    public int sol2 ( int A, int B, int K){

        int count = 0;

        if (A % K != 0) A = ((A/K) +1) *K;
        if (B % K != 0) B = (B/K) *  K;

        count = (B - A)/K;
        return count+1;
    }
}
