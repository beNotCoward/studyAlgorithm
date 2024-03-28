package com.lentouqin.od2024;

import java.util.Arrays;
import java.util.Scanner;

/**
 * it is still a beautiful world
 *
 * @author by hothead
 * @date 2024/3/23.
 */
public class 停车场车辆统计 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inputStr = sc.nextLine();
        String[] split = inputStr.split(",");
        int[] inputArr = Arrays.stream(split).mapToInt(Integer::parseInt).toArray();
        System.out.println(parkNum(inputArr));
    }

    public static int parkNum(int[] inputArr) {
        StringBuilder temp = new StringBuilder();
        for (int i = 0; i < inputArr.length; i++) {
            temp.append(inputArr[i]);
        }
        String result = temp.toString().replaceAll("111", "b").replaceAll("11", "m").replaceAll("1", "s");
        int resultNum = 0;
        for (char c : result.toCharArray()) {
            if (c == 'b' || c == 'm' || c == 's') {
                resultNum++;
            }
        }
        return resultNum;
    }
}
