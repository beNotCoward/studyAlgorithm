package com.lentouqin.od2023;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Od2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        int length = in.nextInt();
        int[] num = new int[length];
        int index = 0;
        while (in.hasNextInt()) { // 注意 while 处理多个 case
            num[index] = in.nextInt();
            index++;
        }
        getMax(num).forEach(s -> System.out.println(s));
    }

    public static Set<Integer> getMax(int[] num){
        Set<Integer> set = new TreeSet<>();
        for (int i = 0; i < num.length; i++) {
            set.add(num[i]);
        }
        return set;
    }
}
