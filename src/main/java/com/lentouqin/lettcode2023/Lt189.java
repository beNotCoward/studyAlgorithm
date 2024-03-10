package com.lentouqin.lettcode2023;

import java.util.Arrays;

public class Lt189 {
    public static void main(String[] args) {
        int[] nums ={1,2,3,4,5,6,7};
        int[] nums1 ={-1};
        int k = 3;
        int k1 = 2;
        Arrays.asList(rotate(nums1, k1)).stream().forEach(s -> System.out.println(s));
    }

    public static int[] rotate(int[] nums, int k) {
        k = k % nums.length;

        int l = 0;
        int r = nums.length;
        while (l < r) {
            swap(nums, r, l);
            l++;
            r--;
        }


        int left = 0;
        int right = k;
        while (left < right) {
            swap(nums, right, left);
            left++;
            right--;
        }
        int low = k;
        int height = nums.length;
        while (low < height) {
            swap(nums, height, low);
            low++;
            height--;
        }
        return nums;
    }

    private static void swap(int[] nums, int k, int left) {
        int temp = nums[left];
        nums[left] = nums[k - 1];
        nums[k - 1] = temp;
    }
}
