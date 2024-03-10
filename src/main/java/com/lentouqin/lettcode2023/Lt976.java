package com.lentouqin.lettcode2023;

import java.util.Arrays;

public class Lt976 {
    public static void main(String[] args) {
        int[] num ={3,2,3,4};
        System.out.println(largestPerimeter(num));

    }
    public static int largestPerimeter(int[] nums) {
        Arrays.sort(nums);

        for (int i = nums.length-1; i >=2 ; i--) {
            if(nums[i-1]+nums[i-2] > nums[i]){
                return nums[i-1]+nums[i-2]+nums[i];
            }
        }
        return 0;
    }

}
