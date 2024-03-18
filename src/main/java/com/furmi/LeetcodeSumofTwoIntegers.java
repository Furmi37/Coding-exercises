package com.furmi;

import java.util.Arrays;
import java.util.stream.IntStream;

public class LeetcodeSumofTwoIntegers {
    public static void main(String[] args) {
        System.out.println(isPalindrome(121));
    }




    public int removeElement(int[] nums, int val) {
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[index] = nums[i];
                index++;
            }
        }
        return index;
    }

    public int[] twoSum(int[] nums, int target) {
        int[] res = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    res[0] = i;
                    res[1] = j;
                }
            }
        }
        return res;
    }

    public static boolean isPalindrome(int x) {
        String str = String.valueOf(x);
        int len = str.length();
        int mid = len / 2;
        int i = 0;

        while (i < mid) {
            if (str.charAt(i) != str.charAt(len - 1 - i)) {
                return false;
            }
            i++;
        }
        return true;
    }



}

