package com.lentouqin.lettcode2023;

import java.util.HashSet;
import java.util.Set;

public class Lt3 {
    public static void main(String[] args) {
        String s = "abcabcbb";
        String b = "bbbbb";
        String c = "pwwkew";
        String d ="";
        System.out.println(lengthOfLongestSubstring(s));
        System.out.println(lengthOfLongestSubstring(b));
        System.out.println(lengthOfLongestSubstring(c));
        System.out.println(lengthOfLongestSubstring(d));

    }

    public static int lengthOfLongestSubstring(String s){
        if(s.length() == 0){
            return 0;
        }
        Set<Character> strings = new HashSet<>();
        int fast = 0;
        int right = 0;
        int max = Integer.MIN_VALUE;

        while (right < s.length()){
            if(!strings.contains(s.charAt(right))){
                strings.add(s.charAt(right));
                right++;
            }else if(strings.contains(s.charAt(right))){
                strings.remove(s.charAt(fast));
                fast++;
            }

            max = Math.max(max,strings.size());
        }
        return max;

    }
}
