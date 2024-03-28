package com.lentouqin.od2024;

import java.util.Scanner;

/**
 * it is still a beautiful world
 *
 * @author by hothead
 * @date 2024/3/25.
 */
public class 机器人搬砖 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 读取输入的一行，并使用空格分割字符串得到数组
        String[] input = scanner.nextLine().split(" ");

        // 将字符串数组转换为整数数组
        int[] w = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            w[i] = Integer.parseInt(input[i]);
        }

        int n = w.length; // 获取数组 w 的长度

        // 如果数组长度大于 8，则无法完成划分，输出 -1
        if (n > 8) {
            System.out.println(-1);
        } else {
            int l = 1, r = (int) 1e9; // 初始化二分查找的左右边界

            // 二分查找
            while (l < r) {
                int mid = (r - l) / 2 + l; // 计算中间值

                // 调用 check 函数判断当前 mid 是否满足条件
                if (check(w, mid)) {
                    r = mid; // 如果满足条件，更新右边界
                } else {
                    l = mid + 1; // 如果不满足条件，更新左边界
                }
            }

            // 输出最终的结果
            System.out.println(l);
        }
    }
    // 定义一个静态方法 check，用于判断给定的 mid 值是否满足条件
    static boolean check(int[] w, int mid) {
        int cnt = 0;

        // 遍历数组 w 中的每个元素
        for (int x : w) {
            // 计算将当前元素 x 划分为长度为 mid 的子数组需要的个数
            cnt += x % mid == 0 ? x / mid : x / mid + 1;

            // 如果当前划分后的子数组个数超过 8，返回 false
            if (cnt > 8) {
                return false;
            }
        }

        // 如果所有子数组的个数都不超过 8，返回 true
        return true;
    }

}
