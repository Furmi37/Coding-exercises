package com.furmi;

public class ReverseInteger {
    public static void main(String[] args) {
        System.out.println(reverseInt(-123));

    }

    public static int reverseInt(int x) {
        int result = 0;

        while (x != 0) {
            int tail = x % 10; // bieremy ostatnio cyfre
            int newResult = result * 10 + tail; // dajemy jako 1 w nowym wyniku
            if ((newResult - tail) / 10 != result)  // check if overflows!!! sprawdzamy czy
            { return 0; }
            result = newResult;
            x = x / 10;
        }
        return result;
    }
    public int reverse(int x) {
        boolean isNegative = false;
        if (x < 0) {
            isNegative = true;
            x = -x;
        }
        long reverse = 0;
        while (x > 0) {
            reverse = reverse * 10 + x % 10;
            x /= 10;
        }
        if (reverse > Integer.MAX_VALUE) {
            return 0;
        }
        return (int) (isNegative ? -reverse : reverse);
    }
}
