package com.lentouqin.od2024;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * it is still a beautiful world
 *
 * @author by hothead
 * @date 2024/3/21
 */
public class 绘图计算计算面积 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        String[] input = line.split(" ");
        int[] commendArr = Arrays.stream(input).mapToInt(Integer::parseInt).toArray();
        Map<Integer, Integer> drawTrack = new HashMap<>();
        for (int i = 0; i < commendArr[0]; i++) {
            int[] drawArr = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            drawTrack.put(drawArr[0], drawArr[1]);
        }
        System.out.println(drawSize(drawTrack, commendArr[1]));
    }

    public static int drawSize(Map<Integer, Integer> drawTrack, int end) {
        int lastX= 0;//记录上一个位置的横坐标
        int y= 0; //记录起始点的纵坐标
        int area = 0; //记录面积
        for (Map.Entry<Integer, Integer> integerIntegerEntry : drawTrack.entrySet()) {
            area += (integerIntegerEntry.getKey() - lastX) * Math.abs(y);
            y += integerIntegerEntry.getValue();
            lastX = integerIntegerEntry.getKey();
        }
        // 计算到e点的增量面积
        area += (end - lastX) * Math.abs(y);
        return area;
    }
}
