package com.lentouqin.od2024;

import java.util.Scanner;

/**
 * it is still a beautiful world
 *
 * @author by hothead
 * @date 2024/3/28.
 */
public class 悄悄话 {

    static int[] w;  // 用于存储树节点值的数组
    static int n;  // 树的节点数
    static int res = 0;  // 用于存储最大和的变量

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  // 创建一个Scanner对象来读取输入
        String[] wStr = scanner.nextLine().split(" ");  // 读取一行输入并按空格分割成字符串数组
        n = wStr.length + 1;  // 计算树的节点数
        w = new int[n];  // 初始化存储节点值的数组

        for (int i = 1; i < n; i++) {
            w[i] = Integer.parseInt(wStr[i - 1]);  // 将字符串数组转换为整数并存入w数组
        }

        dfs(1, 0);  // 调用深度优先搜索函数，从根节点开始，初始和为0
        System.out.println(res);  // 打印最大和
    }

    static void dfs(int u, int sum) {
        if (u >= n || w[u] == -1) {  // 如果节点索引超出范围或节点的值为-1（表示叶节点），则返回
            return;
        }
        res = Math.max(res, sum + w[u]);  // 更新最大和为当前最大和和当前路径和的最大值
        dfs(2 * u, sum + w[u]);  // 递归调用dfs函数，处理左子节点
        dfs(2 * u + 1, sum + w[u]);  // 递归调用dfs函数，处理右子节点
    }


}
