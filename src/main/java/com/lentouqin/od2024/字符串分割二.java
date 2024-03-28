package com.lentouqin.od2024;

import java.util.LinkedList;
import java.util.Scanner;

/**
 * it is still a beautiful world
 *
 * @author by hothead
 * @date 2024/3/22.
 */
public class 字符串分割二 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String k = sc.nextLine();
        String inputLine = sc.nextLine();
        System.out.println(reverse(inputLine, Integer.parseInt(k)));
    }

    public static String reverse(String input, int k) {
        String[] inputArr = input.split("-");
        StringBuilder temp = new StringBuilder();
        for (int i = 1; i < inputArr.length; i++) {
            temp.append(inputArr[i]);
        }

        LinkedList<String> result = new LinkedList<>();
        int count = k;
        StringBuilder stringBuilder = new StringBuilder();
        int lowerChar=0;
        int upperChar = 0;
        for (char c : temp.toString().toCharArray()) {
            if (Character.isUpperCase(c)) {
                upperChar++;
            }
            if (Character.isLowerCase(c)) {
                lowerChar++;
            }
            if (count == 1) {
                stringBuilder.append(c);
                result.add(changeWord(stringBuilder, lowerChar, upperChar));
                stringBuilder = new StringBuilder();
                upperChar = 0;
                lowerChar = 0;
                count = k;
            } else {
                stringBuilder.append(c);
                count--;
            }
        }
        // 可能有单个字符存在
        if (stringBuilder.length() != 0) {
            result.add(changeWord(stringBuilder, lowerChar, upperChar));
        }
        result.addFirst(inputArr[0]);
        StringBuilder resultStr = new StringBuilder();
        for (int i = 0; i < result.size(); i++) {
            if (i == result.size() - 1) {
                resultStr.append(result.get(i));
            }else {
                resultStr.append(result.get(i));
                resultStr.append("-");
            }
        }
        return resultStr.toString();
    }

    public static String changeWord(StringBuilder stringBuilder, int lower, int upper) {
        if (lower == upper) {
            return stringBuilder.toString();
        } else if (lower > upper) {
            return stringBuilder.toString().toLowerCase();
        } else {
            return stringBuilder.toString().toUpperCase();
        }
    }
}
