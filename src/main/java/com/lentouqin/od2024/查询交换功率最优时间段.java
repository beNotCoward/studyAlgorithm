package com.lentouqin.od2024;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * it is still a beautiful world
 *
 * @author by hothead
 * @date 2024/3/22.
 */
public class 查询交换功率最优时间段 {
/*    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt(); //第一行读入一个整数m
        int[] w = new int[110];
        int n = 0;
        while (sc.hasNextInt()) {  //第2行读入n个整数
            w[n++] = sc.nextInt();
        }
        List<List<Integer>> res = new ArrayList<>();  //存放所有的时间段
        int maxlen = 0;  //满足题目条件最大长度的时间段
        for (int l = 0; l < n; l++) {  //枚举数组左端点
            for (int r = l, sum = 0; r < n; r++) {  //枚举数组右端点
                sum += w[r];
                if (sum <= m * (r - l + 1)) {  //当前区间满足题目条件
                    if (maxlen < r - l + 1) {
                        maxlen = r - l + 1;
                        res.clear();  //需要把之前的答案清楚
                    }
                    if (maxlen == r - l + 1) {
                        res.add(Arrays.asList(l, r));  //添加答案
                    }
                }
            }
        }
        for (List<Integer> e : res) {
            System.out.printf("%d-%d ", e.get(0), e.get(1));
        }
    }*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int minFailed = Integer.parseInt(sc.nextLine());
        int[] timeArr =
                Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        List<String> result = getResult(timeArr, minFailed);
        for (String res : result) {
            System.out.printf(res+" ");
        }
    }

    public static List<String> getResult(int[] timeArr, int minFailedTime) {
        // 最长时间段
        int maxTime = 0;
        // 统计所有最小时间段
        List<String> result = new ArrayList<>();
        int maxlen = 0;  //满足题目条件最大长度的时间段
        for (int l = 0; l < timeArr.length; l++) {  //枚举数组左端点
            for (int r = l, sum = 0; r < timeArr.length; r++) {  //枚举数组右端点
                sum += timeArr[r];
                if (sum <= minFailedTime * (r - l + 1)) {  //当前区间满足题目条件
                    if (maxlen < r - l + 1) {
                        maxlen = r - l + 1;
                        result.clear();  //需要把之前的答案清楚
                    }
                    if (maxlen == r - l + 1) {
                        result.add(l+"-"+r);  //添加答案
                    }
                }
            }
        }

        return result;
    }
}
