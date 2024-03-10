package com.lentouqin.lettcode2023;

public class Lt709 {
    public static void main(String[] args) {
        toLowerCase("Hello");
    }

    public static String toLowerCase(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if(Character.isUpperCase(s.charAt(i))) {
                char c = s.charAt(i);
                sb.append(String.valueOf(c ^= 32));
            }else {
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }
}
