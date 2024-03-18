package com.furmi;

import java.util.Arrays;

public class RmoveDuplicatesFromSorteedArray {
    //usun duplikaty z tablicy i zwroc liczbe elemetnow talbicy bez duplikatow
    public static void main(String[] args) {
        int [] nums = new int[]{1,1,1,2,3};
        System.out.println(removeDuplicates(nums));
    }
    public static int removeDuplicates(int[] nums) {
        int count = 0;

        for (int i = 0; i < nums.length-1; i++) {
            if (nums[i] == nums[i + 1]) {
                nums[i] = Integer.MAX_VALUE;
                count += 1;
            }
        }
//        System.out.println(count);
        Arrays.sort(nums);
        return nums.length - count;
    }
}
