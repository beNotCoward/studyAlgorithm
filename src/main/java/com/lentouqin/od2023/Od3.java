package com.lentouqin.od2023;

import java.util.Scanner;

public class Od3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        while (in.hasNext()) { // 注意 while 处理多个 case
            String s = in.nextLine();
            System.out.println(get(s));
        }
    }


    public static int get(String s){
        return Integer.parseInt(s,16);
    }
}
