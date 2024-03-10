package com.lentouqin.lettcode2023;

public class Lt557 {
    public static void main(String[] args) {
        String input = "Let's take LeetCode contest";
        reverseWords(input);
    }

    public static String reverseWords(String s) {
        String[] strArr = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for (String s1 : strArr) {
            char[] chars = s1.toCharArray();
            int left = 0;
            int right = s1.length()-1;
            while (left < right) {
                swap(chars, left, right);
                left++;
                right--;
            }
            for (char aChar : chars) {
                sb.append(aChar);
            }
            sb.append(" ");
        }
        String str = sb.toString();
        String result = str.substring(0, str.length() - 1);
        return result;

    }

    private static void swap(char[] chars, int left, int right) {
        char temp = chars[left];
        chars[left] = chars[right];
        chars[right] = temp;
    }

}
