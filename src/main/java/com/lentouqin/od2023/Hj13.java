package com.lentouqin.od2023;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Hj13 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        // 读取到的行数
        int count = Integer.parseInt(bufferedReader.readLine());
        String[] str = new String[count];
        for (int i = 0; i < str.length; i++) {
           str[i] = bufferedReader.readLine();
        }
        Arrays.sort(str);
        for (int i = 0; i < str.length; i++) {
            System.out.println(str[i]);
        }
    }
}
