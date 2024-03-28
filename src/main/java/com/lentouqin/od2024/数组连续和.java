package com.lentouqin.od2024;

import java.util.Arrays;
import java.util.Scanner;

/**
 * it is still a beautiful world
 * // 需记忆
 * @author by hothead
 * @date 2024/3/25.
 */
public class 数组连续和 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();  // 读取n的值
        int x = scanner.nextInt();  // 读取x的值
        int[] w = new int[n];  // 创建数组w
        long ans = 0;  // 用于统计答案个数
        int l = 0, r = 0;  // 初始化双指针
        int sum = 0;

        // 读取数组w的值
        for (int i = 0; i < n; i++) {
            w[i] = scanner.nextInt();
        }

        // 双指针算法
        while (r < n) {
            sum += w[r];
            while (sum >= x&&l<=r) {
                ans += n - r;
                sum -= w[l];
                l++;
            }
            r++;
        }

        // 输出结果
        System.out.println(ans);
    }
}
