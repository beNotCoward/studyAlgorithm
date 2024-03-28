package com.lentouqin.od2024;

import java.util.Scanner;

/**
 * it is still a beautiful world
 *
 * @author by hothead
 * @date 2024/3/28.
 */
public class 最优投资方式 {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();  // 读取n的值
        int m = scanner.nextInt();  // 读取m的值
        int k = scanner.nextInt();  // 读取k的值

        int[] w = new int[n];  // 创建长度为n的数组w
        int[] rask = new int[n];  // 创建长度为n的数组rask
        int[] cost = new int[n];  // 创建长度为n的数组cost

        for (int i = 0; i < n; i++) {
            w[i] = scanner.nextInt();  // 读取数组w的值
        }

        for (int i = 0; i < n; i++) {
            rask[i] = scanner.nextInt();  // 读取数组rask的值
        }

        for (int i = 0; i < n; i++) {
            cost[i] = scanner.nextInt();  // 读取数组cost的值
        }

        for (int i = 0; i < n; i++) {
            w[i] = w[i] * cost[i];  // 计算投资每个产品的回报收益
        }

        int[] choose = new int[n];  // 创建长度为n的数组choose
        int ans = 0;  // 最大收益

        for (int i = 0; i < n; i++) {  // 首先考虑只投资一个产品
            if (rask[i] <= k && cost[i] <= m && ans < w[i]) {
                ans = w[i];
                choose = new int[]{i};
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {  // 然后考虑投资两个产品
                if (rask[i] + rask[j] <= k && cost[i] + cost[j] <= m && ans < w[i] + w[j]) {
                    ans = w[i] + w[j];
                    choose = new int[]{i, j};
                }
            }
        }

        int[] ansVec = new int[n];  // 创建长度为n的数组ansVec

        for (int x : choose) {
            ansVec[x] = cost[x];
        }

        for (int x : ansVec) {
            System.out.print(x + " ");  // 输出最终选择的投资序列
        }
    }
}
