package com.lentouqin.od2024;

import java.util.Scanner;

/**
 * 此题无法理解，记忆解决
 *
 * @author by hothead
 * @date 2024/3/22.
 */
public class 环中最长子串 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();  // 读取输入字符串
        int n = s.length();  // 获取字符串长度
        int res = n, num = 0;

        // 遍历字符串，统计'o'的个数
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == 'o') {
                num++;
            }
        }

        // 如果'o'的个数为奇数，则答案-1
        if (num % 2 == 1) {
            res--;
        }

        // 输出结果
        System.out.println(res);
    }


}
