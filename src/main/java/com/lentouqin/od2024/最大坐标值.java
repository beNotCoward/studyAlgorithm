package com.lentouqin.od2024;

import java.util.Arrays;
import java.util.Scanner;

/**
 * it is still a beautiful world
 *
 * @author by hothead
 * @date 2024/3/22.
 */
public class 最大坐标值 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 命令总数
        int commandNum = Integer.parseInt(sc.nextLine());
        // 幸运数
        int luckNum = Integer.parseInt(sc.nextLine());
        // 移动的步数
        int[] moveIndex = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        System.out.println(maxIndex(moveIndex, luckNum));
    }

    public static int maxIndex(int[] moveIndex, int luckNum) {
        int max = 0;
        int start = 0;
        for (int i = 0; i < moveIndex.length; i++) {
            if (moveIndex[i] == luckNum) {
                if (moveIndex[i] >= 0) {
                    moveIndex[i] += 1;
                    start += moveIndex[i];
                } else {
                    moveIndex[i] -= 1;
                    start += moveIndex[i];
                }
            } else {
                start += moveIndex[i];
            }
            max = Math.max(start, max);
        }
        return max;
    }
}
