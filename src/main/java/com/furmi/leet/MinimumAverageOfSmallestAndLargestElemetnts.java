package com.furmi.leet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class MinimumAverageOfSmallestAndLargestElemetnts {
    public static void main(String[] args) {
        int[] nums = new int[]{7, 8, 3, 4, 15, 13, 4, 1};
        System.out.println(minimumAverage(nums));
    }

    public static double minimumAverage(int[] nums) {
        Arrays.sort(nums);

        int s = 0;
        int e = nums.length - 1;

        double average = (nums[s] + nums[e]) / 2.0;
        while (s <= e) {
            average = Math.min(average, (nums[s] + nums[e]) / 2.0);
            s++;
            e--;
        }
        return average;
    }
    public static double sol (int []nums){
            Arrays.sort(nums);
            int s=0,e=nums.length-1;
            double ans=(nums[s]+nums[e])/2.0;

            while(s<=e){
                System.out.println(ans);
                ans=Math.min(ans,((nums[s]+nums[e])/2.0));
                s++;
                e--;
            }
            return ans;
        }
    }

