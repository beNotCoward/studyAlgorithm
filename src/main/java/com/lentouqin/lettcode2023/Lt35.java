package com.lentouqin.lettcode2023;

public class Lt35 {
    public static void main(String[] args) {
        int[] input = {1,3,5,6};
        int target = 7;
        searchInsert(input,target);
    }

    public static int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = ((right - left) >> 1) + left;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return left;
    }
}
