package com.lentouqin.lettcode2023;

import java.util.Arrays;

public class Lt567 {
    public static void main(String[] args) {
        String s1 = "ab";
        String s2 = "eidbaooo";
        String s3 = "eidboaoo";
        System.out.println(checkInclusion(s1, s2));
        System.out.println(checkInclusion(s1, s3));
    }

    public static boolean checkInclusion(String s1, String s2) {
        if(s2.length() < s1.length()){
            return false;
        }

        int[] s11 = new int[26];
        int[] s22 = new int[26];
        for (int i = 0; i < s1.length(); i++) {
            s11[s1.charAt(i) - 'a']++;
            s22[s2.charAt(i) - 'a']++;
        }
        if (Arrays.equals(s11, s22)) {
            return true;
        }
        for (int i = s1.length(); i < s2.length(); i++) {
            s22[s2.charAt(i) - 'a']++;
            s22[s2.charAt(i-s1.length())-'a']--;
            if(Arrays.equals(s11,s22)){
                return true;
            }
        }
        return false;
    }
}
