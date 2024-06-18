package com.furmi.codility;

public class FrogJmp {
    public static void main(String[] args) {
        System.out.println(solution(10,85,30));
    }
    public static int solution(int X, int Y, int D) {
        // Implement your solution here

        int road = Y - X; // 75
        int jump = road / D;  //75 / 30 = 2
        if (road % D != 0) jump++; // 75 % 30 = 15
        return  jump;
    }
}
