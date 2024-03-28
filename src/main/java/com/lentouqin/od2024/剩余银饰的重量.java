package com.lentouqin.od2024;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

/**
 * it is still a beautiful world
 *
 * @author by hothead
 * @date 2024/3/28.
 */
public class 剩余银饰的重量 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();  // 读取数组长度
        Queue<Integer> heap = new PriorityQueue<>((a, b) -> b - a);  // 创建一个大根堆

        for (int i = 0; i < n; i++) {
            int x = scanner.nextInt();  // 读取数组元素
            heap.add(x);  // 将元素插入大根堆
        }

        while (heap.size() > 2) {  // 只要堆中元素个数大于2，就继续合并
            int z = heap.poll();  // 取出堆顶元素z，并移除
            int y = heap.poll();  // 取出堆顶元素y，并移除
            int x = heap.poll();  // 取出堆顶元素x，并移除

            if (x == z) {  // 如果x和z相等，则跳过本次循环
                continue;
            } else if (x == y && y < z) {  // 如果x和y相等且y小于z，则将z-y插入堆中
                heap.add(z - y);
            } else if (x < y && y == z) {  // 如果x小于等于y且y等于z，则将y-x插入堆中
                heap.add(y - x);
            } else if (x < y && y < z) {  // 如果x小于y且y小于z，则将z-y-(y-x)的绝对值插入堆中
                heap.add(Math.abs(z - y - (y - x)));
            }
        }

        if (heap.size() == 0) {  // 如果堆为空，则输出0
            System.out.println("0");
        } else {
            System.out.println(heap.poll());  // 否则输出堆顶元素
        }
    }


}
