package com.lentouqin.od2024;

import java.util.*;

/**
 * it is still a beautiful world
 * 需记忆
 *
 * @author by hothead
 * @date 2024/3/24.
 */
public class 结对编程 {

    static long ans = 0; // 用于保存逆序对的数量，初始化为0

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); // 读取数组的长度

        int[] w = new int[n];

        // 读取数组元素
        for (int i = 0; i < n; i++) {
            w[i] = scanner.nextInt();
        }

        calculate(w); // 计算原数组的逆序对数量
        calculate(reverseArray(w)); // 计算反转数组的逆序对数量

        System.out.println(ans); // 输出总的逆序对数量
    }

    // 计算逆序对数量的方法
    static void calculate(int[] w) {
        int n = w.length;
        int[] R = new int[n];
        int[] L = new int[n];

        // 计算每个元素左边比它小的元素个数
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (w[j] < w[i]) {
                    L[i]++;
                }
            }

            // 计算每个元素右边比它大的元素个数
            for (int j = i + 1; j < n; j++) {
                if (w[j] > w[i]) {
                    R[i]++;
                }
            }
        }

        // 计算逆序对数量
        for (int i = 0; i < n; i++) {
            ans += L[i] * R[i];
        }
    }

    // 反转数组的方法
    static int[] reverseArray(int[] arr) {
        int n = arr.length;
        int[] reversed = new int[n];

        // 将数组反转
        for (int i = 0; i < n; i++) {
            reversed[i] = arr[n - i - 1];
        }

        return reversed;
    }



 /*   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        String inputNum = sc.nextLine();
        int[] inputArr =
                Arrays.stream(inputNum.split(" "))
                        .mapToInt(Integer::parseInt)
                        .toArray();
        System.out.println(getMax(inputArr));
    }

    public static int getMax(int[] inputArr) {
        List<List<Integer>> result = new ArrayList<>(inputArr.length);
        back(inputArr,result,0,new LinkedList<>());
        return result.size();
    }

    public static void back(int[] inputArr, List<List<Integer>> result, int begin, LinkedList<Integer> list) {
        if (list.size() == 3) {
            result.add(new LinkedList<>(list));
            return;
        }

        for (int i = begin; i < inputArr.length; i++) {
            if (list.isEmpty()) {
                list.add(inputArr[i]);
                back(inputArr, result, i + 1, list);
            } else if (inputArr[i] < list.getLast()) {
                continue;
            } else {
                list.add(inputArr[i]);
                back(inputArr, result, i + 1, list);
            }
            // 用于去除多余的添加
            list.remove(list.size() - 1);
        }

    }*/

}
