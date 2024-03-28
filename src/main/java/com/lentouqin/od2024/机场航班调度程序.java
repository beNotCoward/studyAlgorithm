package com.lentouqin.od2024;

import java.util.Arrays;
import java.util.Scanner;

/**
 * it is still a beautiful world
 *
 * @author by hothead
 * @date 2024/3/28.
 */
public class 机场航班调度程序 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 从输入中读取以逗号分隔的字符串并排序
        String[] inputArray = scanner.nextLine().split(",");
        Arrays.sort(inputArray);

        // 输出排序后的字符串，使用逗号分隔
        System.out.println(String.join(",", inputArray));
    }
}
