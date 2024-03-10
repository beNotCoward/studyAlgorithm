package com.lentouqin.lettcode2023;

public class Lt344 {
    public static void main(String[] args) {

    }
    public static void reverseString(char[] s) {
        int left = 0;
        int right = s.length-1;
        while (left < right){
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;
            left++;
            right--;
        }
    }

}
