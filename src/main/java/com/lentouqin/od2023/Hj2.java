package com.lentouqin.od2023;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Hj2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        while (in.hasNext()) { // 注意 while 处理多个 case
            String input = in.nextLine();
            hj4(input).forEach(s -> System.out.println(s));
        }
    }

    public static List<String> hj4(String input){
        List<String> result = new LinkedList<>();
        if(input.length() == 0){
            return result;
        }
        if(input.length() < 8){
           StringBuilder sb = new StringBuilder(input);
           while (sb.length() < 8){
               sb.append("0");
           }
           result.add(sb.toString());
           return result;
        } else if (input.length() == 8) {
            result.add(input);
            return result;
        } else {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < input.length(); i++) {
                if(sb.length() == 8){
                    result.add(sb.toString());
                    sb = new StringBuilder();
                    sb.append(input.charAt(i));
                }else {
                    sb.append(input.charAt(i));
                }
            }
            int index =0;
            if(input.length() % 8 != 0){
                int len = input.length() / 8;
                index = len * 8+sb.length();
            }

            if(index != 0){
                while (sb.length() < 8){
                    if(index >= input.length()){
                        sb.append("0");
                        continue;
                    }
                    sb.append(input.charAt(index));
                    index++;
                }
            }
            result.add(sb.toString());
            return result;
        }
    }



    public static int get(String input,String s){
        int count = 0;
        for (int i = 0; i < input.length(); i++) {
            if(Character.toLowerCase(input.charAt(i)) == Character.toLowerCase(s.charAt(0))){
                count++;
            }
        }
        return count;
    }
}
