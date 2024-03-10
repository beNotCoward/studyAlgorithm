package com.lentouqin.od2023;

import java.util.Scanner;

public class Od1 {
    public static void main(String[] args) {
        System.out.println(drink(3));
        System.out.println(drink(10));
        Scanner in = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        while (in.hasNextInt()) { // 注意 while 处理多个 case
            int a = in.nextInt();
            if (a == 0) {
                continue;
            }
            System.out.println(drink(a));
        }
    }

    public static int drink(int n){
        if (n < 2) {
            return 0;
        }
        if (n == 2){
            return 1;
        }

        return n / 3 + drink(n%3+n/3);

    }

}
