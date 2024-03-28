package com.lentouqin.od2024;

import java.util.Arrays;
import java.util.Scanner;

/**
 * it is still a beautiful world
 *
 * @author by hothead
 * @date 2024/3/25.
 */
public class 字符串筛选排序 {
        public static void main(String[] args) {
            // 创建一个Scanner对象用于接收输入
            Scanner scanner = new Scanner(System.in);

            // 读取字符串和整数输入
            String s = scanner.next();
            int k = scanner.nextInt();
            String s1 = s;

            // 将字符串转为字符数组并排序
            char[] charArray = s1.toCharArray();
            Arrays.sort(charArray);
            s1 = new String(charArray); // 排序

            // 获取字符串长度
            int n = s.length();
            // 确保k不超过字符串长度
            k = Math.min(k, n);
            // 获取排序后的第k个字符
            char ch = s1.charAt(k - 1); // 找到的字符

            // 遍历原始字符串，找到第一个与ch相等的字符的下标并输出
            for (int i = 0; i < n; i++) {
                if (s.charAt(i) == ch) {
                    System.out.println(i);
                    break;
                }
            }
        }



}
