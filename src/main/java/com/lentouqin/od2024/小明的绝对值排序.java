package com.lentouqin.od2024;

import java.util.Arrays;
import java.util.Scanner;

/**
 * it is still a beautiful world
 *
 * @author by hothead
 * @date 2024/3/28.
 */
public class 小明的绝对值排序 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int h = scanner.nextInt();
        int n = scanner.nextInt();
        Integer[] a = new Integer[n];  // 注意这里使用 Integer[] 而不是 int[]

        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }

        Arrays.sort(a, (Integer x, Integer y) -> {
            int diffX = Math.abs(x - h);
            int diffY = Math.abs(y - h);

            if (diffX == diffY) {
                return x.compareTo(y);
            } else {
                return Integer.compare(diffX, diffY);
            }
        });

        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }

        System.out.println();
    }
}
