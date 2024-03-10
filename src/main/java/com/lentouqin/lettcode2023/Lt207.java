package com.lentouqin.lettcode2023;

public class Lt207 {
    public static void main(String[] args) {
        int[] nums = {-1, 0, 3, 5, 9, 12};
        int target = -1;

        int[] nums1 = {-1,0,5};
        System.out.println(search(nums1, target));
    }

    public static int search(int[] nums, int target) {
        if (nums.length == 0 || nums == null) {
            return -1;
        }
        int left = 0;
        int right = nums.length - 1;

        if (nums.length == 1 && target == nums[0]) {
            return 0;
        }


        while ( right >= left) {
            int mid = (right - left) / 2 + left;
            if (nums[mid] == target) {
                return mid;
            }
            if (target > nums[mid]) {
                left = mid;
                left++;
            } else if (target < nums[mid]) {
                right = mid;
                right--;
            }

        }

        return -1;

    }
}
