package com.lentouqin.od2024;

import java.util.*;

/**
 * it is still a beautiful world
 *
 * @author by hothead
 * @date 2024/3/28.
 */
public class 执行任务赚积分 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 输入任务数量和时刻上限
        int n = scanner.nextInt();
        int T = scanner.nextInt();

        // 使用列表存储任务，每个任务用一个长度为2的数组表示
        List<int[]> v = new ArrayList<>();

        // 输入每个任务的开始时间和价值
        for (int i = 0; i < n; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            v.add(new int[]{a, b});
        }

        // 按照处理事件先后顺序从小到大排序
        Collections.sort(v,Comparator.comparingInt(a -> a[0]));

        // 创建小根堆，用于存储当前时刻的任务价值
        Queue<Integer> heap = new PriorityQueue<>();

        // 处理任务
        for (int i = 0; i < n; i++) {
            // 如果当前任务在当前时刻没有过期
            if (v.get(i)[0] > heap.size()) {
                // 如果堆的大小小于上限 T，则直接添加任务价值
                if (heap.size() < T) {
                    heap.add(v.get(i)[1]);
                }
                // 如果堆已满，比较堆顶任务价值与当前任务价值
                // 如果当前任务价值大于堆顶任务价值，则替换堆顶任务价值
                else if (heap.peek() < v.get(i)[1]) {
                    heap.poll();
                    heap.add(v.get(i)[1]);
                }
            }
            // 如果当前任务在当前时刻已过期，比较堆顶任务价值与当前任务价值
            // 如果当前任务价值大于堆顶任务价值，则替换堆顶任务价值
            else {
                if (v.get(i)[1] > heap.peek()) {
                    heap.poll();
                    heap.add(v.get(i)[1]);
                }
            }
        }

        // 计算总任务价值
        long res = 0;
        while (!heap.isEmpty()) {
            res += heap.poll();
        }

        // 输出结果
        System.out.println(res);
    }
}
