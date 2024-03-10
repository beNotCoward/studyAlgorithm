package com.lentouqin.lettcode2023;

import java.util.ArrayList;
import java.util.List;

public class Lt22 {
    public static void main(String[] args) {

    }

    public static List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        backTracking(n, result,0,0,"");
        return result;
    }

    private static void backTracking(int n,List<String> result,int left,int right,String str){
        if(right > left){
            return;
        }
        if(left == n && right == n){
            result.add(str);
            return;
        }
        if(left < n){
            backTracking(n,result,left+1,right,str+"(");
        }
        if(right < left){
            backTracking(n,result,left,right+1,str+")");
        }

    }
}
