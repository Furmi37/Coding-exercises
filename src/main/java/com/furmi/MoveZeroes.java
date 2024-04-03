package com.furmi;

public class MoveZeroes {
    // 0 1 0 3 12
    public static void main(String[] args) {
        int [] nums = { 0,1,0,3,12};
        moveZeroes(nums);
    }
    public static void moveZeroes(int[] nums) {
        if(nums == null || nums.length <= 1){
            return;
        }
        int lastNonZeroIndex = 0;
        for (int i = 0; i < nums.length; i++){
            if (nums[i] != 0){
                swap(nums, lastNonZeroIndex++, i);
            }
        }

    }
    private static void swap (int [] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
