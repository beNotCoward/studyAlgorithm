package com.lentouqin.lettcode2023;

import java.util.ArrayList;
import java.util.List;

public class Lt77 {
    public static void main(String[] args) {

    }
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> result = new ArrayList<>();
        backTracking(n,k,result, 1,new ArrayList<>());
        return result;
    }

    public void backTracking(int n,int k,List<List<Integer>> result,int begin,ArrayList<Integer> list){
        if(list.size() == k){
          result.add(new ArrayList<>(list));
          return;
        }

        for (int i = begin; i <= n; i++) {
            list.add(i);
            backTracking(n, k, result, i + 1, list);
            // 用于去除多余的添加
            list.remove(list.size() - 1);
        }
    }
}
