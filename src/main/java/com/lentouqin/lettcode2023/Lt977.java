package com.lentouqin.lettcode2023;

public class Lt977 {
    public static void main(String[] args) {
        int[] nums ={-4,-1,0,3,10};
        System.out.println(sortedSquares(nums));
    }

    public static int[] sortedSquares(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        int[] result = new int[nums.length];
        int index =nums.length;
        while (index > 0) {
            index--;
            if (nums[left] * nums[left] > nums[right] * nums[right]) {
                result[index] = nums[left] * nums[left];
                left++;
            }else {
                result[index] =nums[right] * nums[right];
                right--;
            }
        }
        return result;

    }
}
