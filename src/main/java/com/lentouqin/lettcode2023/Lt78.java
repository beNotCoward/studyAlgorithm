package com.lentouqin.lettcode2023;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lt78 {
    public static void main(String[] args) {
      int[] nums = {1,2,3};
      List<Integer> temp = new ArrayList<>(Arrays.asList(1,2,3));
      temp.remove(2);
      subsets(nums);
    }

    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        dfs(result,nums,0,new ArrayList<>());
        return result;
    }

    public static void dfs(List<List<Integer>> result, int[] nums, int index, List<Integer> temp) {
        result.add(new ArrayList<>(temp));
        if(index == nums.length){
            return;
        }
        for (int i = index; i < nums.length; i++) {
            temp.add(nums[i]);
            dfs(result,nums,i+1,temp);
            temp.remove(temp.size()-1);
        }
    }
}
