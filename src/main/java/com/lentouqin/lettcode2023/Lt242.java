package com.lentouqin.lettcode2023;

import java.util.HashMap;
import java.util.Map;

public class Lt242 {
    public static void main(String[] args) {
        System.out.println(isAnagram("ab", "a"));
    }

    public static boolean isAnagram(String s, String t) {
        char[] chars = s.toCharArray();
        Map<Character,Integer> map = new HashMap<>();
        for (char aChar : chars) {
            map.put(aChar, map.getOrDefault(aChar, 0) + 1);
        }
        for (int i = 0; i < t.length(); i++) {
            Integer orDefault = map.getOrDefault(t.charAt(i), -1);
            if (orDefault < 0) {
                return false;
            }else {
                map.put(t.charAt(i),--orDefault);
            }
        }
        for (Map.Entry<Character, Integer> characterIntegerEntry : map.entrySet()) {
            if(characterIntegerEntry.getValue() > 0){
                return false;
            }
        }
        return true;
    }
}
