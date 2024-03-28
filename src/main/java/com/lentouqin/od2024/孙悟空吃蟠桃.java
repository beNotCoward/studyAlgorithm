package com.lentouqin.od2024;

import java.util.Arrays;
import java.util.Scanner;

/**
 * it is still a beautiful world
 *
 * @author by hothead
 * @date 2024/3/21.
 */
public class 孙悟空吃蟠桃 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        // 蟠桃树
        String[] treeArr = line.split(" ");
        // 守卫离开的时间
        int h = sc.nextInt();
        System.out.println(eat(Arrays.stream(treeArr).mapToInt(Integer::parseInt).toArray(), h));
    }

    private static int eat(int[] treeArr, int h) {
        int low = 1;
        int high = 0;
        for (int pile : treeArr) {
            high = Math.max(pile, high);
        }
        int k = high;
        while (low < high) {
            int speed = (high - low) / 2 + low;
            long time = getTime(treeArr, speed);
            if (time <= h) {
                k = speed;
                high = speed;
            } else {
                low = speed + 1;
            }
        }
        return k;
    }

    public static long getTime(int[] piles, int speed) {
        long time = 0;
        for (int pile : piles) {
            // 向上取整
            //int curTime = (int) Math.ceil(pile / speed);
            //int curTime = (pile + speed - 1) / speed;
            int curTime = pile % speed == 0 ? pile / speed : pile / speed + 1;
            time += curTime;
        }
        return time;
    }
}
