package com.lentouqin.od2024;

import java.util.Scanner;

/**
 * it is still a beautiful world
 *
 * @author by hothead
 * @date 2024/3/28.
 */
public class 分割均衡字符串 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int ans = 0, sum = 0;

        for (char ch : s.toCharArray()) {
            if (ch == 'X') {
                sum++;
            } else {
                sum--;
            }

            if (sum == 0) {
                ans++;
            }
        }

        System.out.println(ans);
    }
}
