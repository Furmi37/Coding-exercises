package com.furmi.codilityKurs;

public class CountFactors {
    public static void main(String[] args) {
        System.out.println(solution(25));
        System.out.println(sol2(25));
    }

    public static int solution(int N) {
        // Implement your solution here
        int factor = 0;
        if (N == 1) {
            return 1;
        }
        for (int i = 1; i <= N; i++) {
            if (N % i == 0) {
                factor++;
            }
        }
        return factor;
    }

    public static int sol2(int N) {
        int sqrtN = (int) Math.sqrt(N);
        int factor = 0;

        for (int i = 1; i <= sqrtN; i++) {
            if (N % i == 0) {
                factor++;
            }
        }
        factor *= 2;

        if (sqrtN * sqrtN == N) {
            factor = factor - 1;
        }

        return factor;
    }
}
