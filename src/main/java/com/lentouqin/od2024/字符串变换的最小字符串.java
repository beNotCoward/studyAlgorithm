package com.lentouqin.od2024;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

/**
 * it is still a beautiful world
 *
 * @author by hothead
 * @date 2024/3/26.
 */
public class 字符串变换的最小字符串 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        char[] charArray = s.toCharArray();
        char[] sortedArray = Arrays.copyOf(charArray, charArray.length);
        Arrays.sort(sortedArray);

        // 从后往前交换，保证无误01
        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] != sortedArray[i]) {
                for (int j = charArray.length - 1; j >= 0; j--) {
                    if (charArray[j] == sortedArray[i]) {
                        char temp = charArray[i];
                        charArray[i] = charArray[j];
                        charArray[j] = temp;
                        break;
                    }
                }
                break;
            }
        }

        System.out.println(new String(charArray));
    }

}
