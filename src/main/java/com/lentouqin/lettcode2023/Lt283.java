package com.lentouqin.lettcode2023;

public class Lt283   {
    public static void main(String[] args) {
        int[] nums = {0,1,0,3,12};
        moveZeroes(nums);
    }

    public static void moveZeroes(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[count++] = nums[i];
            }
        }
        int left = count;
        while (left < nums.length) {
            nums[left++] = 0;
        }
        System.out.println(nums);

    }
}
