package com.lentouqin.lettcode2023;

import java.util.LinkedList;
import java.util.List;

public class Lt1790 {

    public static void main(String[] args) {
        areAlmostEqual("caa","aaz");
    }

    public static boolean areAlmostEqual(String s1, String s2) {
        int count = 0;
        List<Character> s1List = new LinkedList<>();
        List<Character> s2List = new LinkedList<>();
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                s1List.add(s1.charAt(i));
                s2List.add(s2.charAt(i));
                count++;
            }
        }

        boolean flag = true;
        for (Character character : s1List) {
            if(!s2List.contains(character)){
                flag =false;
            }
        }
        return  (count == 0 || count == 2) && flag;
    }
}