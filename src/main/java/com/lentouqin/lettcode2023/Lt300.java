package com.lentouqin.lettcode2023;

import java.util.Arrays;

public class Lt300 {
    public static void main(String[] args) {
        int[] nums = {0,1,0,3,2,3};
        System.out.println(lengthOfLIS(nums));
    }

    public static int lengthOfLIS(int[] nums) {
        int[] dp = new int[nums.length];
        Arrays.fill(dp, 1);
        int res = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < i; j++) {
                if(nums[i] > nums[j]){
                    dp[i] = Math.max(dp[i],dp[j]+1);
                }
            }
            res = Math.max(dp[i],res);
        }

        return res;
    }
}
