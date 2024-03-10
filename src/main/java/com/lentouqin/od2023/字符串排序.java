package com.lentouqin.od2023;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class 字符串排序 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        while (in.hasNext()) { // 注意 while 处理多个 case
            String input = in.nextLine();
            System.out.println(soutString(input));
        }

    }

    public static String soutString(String str){
        List<Character> letters = new ArrayList<>();
        for (char ch : str.toCharArray()) {
            if(Character.isLetter(ch)){
                letters.add(ch);
            }
        }

        // 先对字母进行排序
        letters.sort(new Comparator<Character>() {
            @Override
            public int compare(Character o1, Character o2) {
                return Character.toLowerCase(o1) - Character.toLowerCase(o2);
            }
        });

        // 若是非英文字母直接添加
        StringBuilder result = new StringBuilder();
        for (int i = 0,j=0; i < str.length(); i++) {
            if(Character.isLetter(str.charAt(i))){
                result.append(letters.get(j));
                j++;
            }else {
                result.append(str.charAt(i));
            }
        }

        return result.toString();
    }
}
