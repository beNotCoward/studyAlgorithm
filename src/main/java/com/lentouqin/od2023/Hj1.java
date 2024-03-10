package com.lentouqin.od2023;

import java.util.Scanner;

public class Hj1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        while (in.hasNext()) { // 注意 while 处理多个 case
            String input = in.nextLine();
            System.out.println(getLast(input));
        }
    }
    public static int getLast(String input){
        String[] splitArr = input.split(" ");
        return splitArr[splitArr.length-1].length();
    }
}
