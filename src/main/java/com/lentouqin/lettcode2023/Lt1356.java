package com.lentouqin.lettcode2023;

import java.util.*;

public class Lt1356 {
    public static void main(String[] args) {
        int[] arr = {0,1,2,3,4,5,6,7,8};
        sortByBits(arr);
    }

    public static int[] sortByBits(int[] arr){
        Integer[] nums = new Integer[arr.length];
        for (int i = 0; i < arr.length; i++) {
            nums[i] = arr[i];
        }
        Arrays.sort(nums, (o1, o2) -> {
            int bitCountA = Integer.bitCount(o1);
            int bitCountB = Integer.bitCount(o2);
            // 相同按原数，不同按位数
            return bitCountA == bitCountB ? o1 - o2 : bitCountA - bitCountB;
        });
        for (int i = 0; i < arr.length; i++) {
            arr[i] = nums[i];
        }
        return arr;

    }
}
