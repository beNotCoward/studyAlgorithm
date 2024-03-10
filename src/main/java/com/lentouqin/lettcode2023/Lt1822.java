package com.lentouqin.lettcode2023;

import java.util.Arrays;

public class Lt1822 {
    public static void main(String[] args) {

    }

    public static boolean canMakeArithmeticProgression(int[] arr) {
        Arrays.sort(arr);
        for (int i = 1; i < arr.length-1; i++) {
            if(arr[i]*2 != arr[i-1] + arr[i+1]){
                return false;
            }
        }
        return true;
    }

}
