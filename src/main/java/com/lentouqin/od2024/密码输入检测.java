package com.lentouqin.od2024;

import java.util.Scanner;

/**
 * it is still a beautiful world
 *
 * @author by hothead
 * @date 2024/3/22.
 */
public class 密码输入检测 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = "";

        // 使用循环读取输入行
        while (scanner.hasNextLine()) {
            s = scanner.nextLine();
            processInput(s);
        }
    }

    private static void processInput(String s) {
        StringBuilder res = new StringBuilder(); // 使用退格符后的字符串

        for (char ch : s.toCharArray()) {
            if (ch == '<') {
                if (res.length() > 0) {
                    res.deleteCharAt(res.length() - 1); // 删除当前字符
                }
            } else {
                res.append(ch);
            }
        }

        String flag = check(res.toString()) ? "true" : "false";
        System.out.println(res.toString() + "," + flag);
    }

    private static boolean check(String s) {
        int n = s.length();
        if (n < 8) {
            return false;
        }

        int upperCnt = 0, lowerCnt = 0, numCnt = 0;

        for (char ch : s.toCharArray()) {
            if ('a' <= ch && ch <= 'z') {
                lowerCnt++;
            } else if ('A' <= ch && ch <= 'Z') {
                upperCnt++;
            } else if ('0' <= ch && ch <= '9') {
                numCnt++;
            }
        }

        return lowerCnt >= 1 && upperCnt >= 1 && numCnt >= 1 && (lowerCnt + upperCnt + numCnt) < n;
    }


}
