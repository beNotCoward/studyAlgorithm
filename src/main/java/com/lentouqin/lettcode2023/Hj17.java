package com.lentouqin.lettcode2023;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Hj17 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        while (in.hasNext()) { // 注意 while 处理多个 case
            String input = in.nextLine();
            String[] split = input.split(";");
            System.out.println(getEnd(split));
        }

    }

    public static String getEnd(String[] strArr){
        List<String> list = new ArrayList<>();
        for (int i = 0; i < strArr.length; i++) {
            if (!strArr[i].matches("[WASD][0-9]{1,2}")) {
                continue;
            }
            list.add(strArr[i]);
        }

        int[] result = new int[2];
        for (String s : list) {
            if (s.startsWith("A")) {
                result[0] -= Integer.parseInt(s.substring(1));
            }
            if(s.startsWith("S")){
                result[1] -= Integer.parseInt(s.substring(1));
            }
            if(s.startsWith("W")){
                result[1] += Integer.parseInt(s.substring(1));
            }
            if(s.startsWith("D")){
                result[0] += Integer.parseInt(s.substring(1));
            }
        }
        StringBuilder sb = new StringBuilder();
        return sb.append(result[0]).append(",").append(result[1]).toString();
    }
}
