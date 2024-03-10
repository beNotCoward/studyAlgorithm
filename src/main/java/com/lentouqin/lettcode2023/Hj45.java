package com.lentouqin.lettcode2023;

import java.util.Arrays;

public class Hj45 {
    public static void main(String[] args) {
        String[] str = {"zhangsan","lisi"};
        getMax(str);
    }

    public static int getMax(String[] str){
        int beautiful=0;

        for (int i = 0; i < str.length; i++) {
            int[] arrScore = new int[26];
            String s = str[i];
            for (int j = 0; j < str[i].length(); j++) {
                int index = s.charAt(j) - 'a';
                arrScore[index]++;
            }
            Arrays.sort(arrScore);
            for (int j1 = 26; j1 >= 1; j1--) {
                beautiful += arrScore[j1 - 1] * j1;
            }

        }
        return beautiful;
    }
}
