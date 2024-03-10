package com.lentouqin.lettcode2023;

import java.util.HashMap;
import java.util.Map;

public class Lt001 {
    public static void main(String[] args) {

    }

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
           if(map.containsKey(target-nums[i])){
               return new int[]{map.get(target-nums[i]),i};
           }
           map.put(nums[i],i);
        }

        return new int[2];
    }
}
