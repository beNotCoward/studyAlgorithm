package com.lentouqin.od2024;

import java.util.*;

/**
 * it is still a beautiful world
 *
 * @author by hothead
 * @date 2024/3/22.
 */
public class 石头剪刀布游戏 {
    public static void main(String[] args) {
        // 初始化一个包含三个ArrayList的数组
        List<String>[] arr = new ArrayList[3];
        for (int i = 0; i < 3; i++) {
            arr[i] = new ArrayList<>();
        }

        // 创建一个Scanner对象以从标准输入读取数据
        Scanner sc = new Scanner(System.in);

        // 循环读取输入，直到遇到异常（例如EOF）
        int count = 0;
        while (count < 4) {
            try {
                // 读取两个字符串，将第一个字符串添加到对应的ArrayList中
                String s1 = sc.next();
                String s2 = sc.next();
                arr[s2.charAt(0) - 'A'].add(s1);
                count++;
            } catch (Exception e) {
                break; // 遇到异常时退出循环
            }
        }

        // 如果三个ArrayList都非空，说明有三种不同的出拳，是平手
        if (allNonEmpty(arr)) {
            System.out.println("NULL");
            return;
        }

        // 计算空ArrayList的数量
        int num = countEmpty(arr);

        // 如果有两个或以上的ArrayList为空，说明只有一种出拳，也是平手
        if (num >= 2) {
            System.out.println("NULL");
            return;
        }

        // 对每个ArrayList进行排序
        for (List<String> lst : arr) {
            Collections.sort(lst);
        }

        int tmp = 0;

        // 找到赢家的索引
        if (arr[0].isEmpty()) {
            tmp = 1;
        } else if (arr[1].isEmpty()) {
            tmp = 2;
        }

        // 输出赢家的出拳方式
        for (String t : arr[tmp]) {
            System.out.println(t);
        }
    }

    // 检查是否所有ArrayList都非空
    private static boolean allNonEmpty(List<String>[] arr) {
        for (List<String> lst : arr) {
            if (lst.isEmpty()) {
                return false;
            }
        }
        return true;
    }

    // 计算空ArrayList的数量
    private static int countEmpty(List<String>[] arr) {
        int count = 0;
        for (List<String> lst : arr) {
            if (lst.isEmpty()) {
                count++;
            }
        }
        return count;
    }
}
