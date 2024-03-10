package com.lentouqin.lettcode2023;

import java.util.LinkedList;
import java.util.List;

public class Lt209 {

    public static void main(String[] args) {
        int target = 11;
        int[] nums = {2, 3, 1, 2, 4, 3};
        int[] nums1 = {1, 2, 3, 4, 5};
        System.out.println(minSubArrayLen(target, nums1));
    }

    public static int minSubArrayLen(int target, int[] nums) {
        List<Integer> numList = new LinkedList<>();
        int minLength = Integer.MAX_VALUE;
        int fast = 0;
        int max = 0;
        while (fast <= nums.length - 1) {

            if (max < target) {
                numList.add(nums[fast]);
                max += nums[fast];
                fast++;
            }
            while (max >= target) {
                minLength = Math.min(numList.size(), minLength);
                max -= ((LinkedList<Integer>) numList).getFirst();
                ((LinkedList<Integer>) numList).removeFirst();
            }
        }

        return minLength == Integer.MAX_VALUE ? 0 : minLength;

    }
}
