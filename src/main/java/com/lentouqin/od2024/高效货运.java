package com.lentouqin.od2024;

import java.util.Arrays;
import java.util.Scanner;

/**
 * it is still a beautiful world
 *
 * @author by hothead
 * @date 2024/3/23.
 */
public class 高效货运 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] arr = input.split(" ");
        int[] inputArr = Arrays.stream(arr).mapToInt(Integer::parseInt).toArray();
        System.out.println(maxMoney(inputArr));
    }

    public static int maxMoney(int[] inputArr) {
        int wa = inputArr[0];
        int wb = inputArr[1];
        int wt = inputArr[2];
        int pa = inputArr[3];
        int pb = inputArr[4];

        int ans = 0;
        for (int i = 1; i < wt; i++) {
            int a = wa * i; // i个A货物的质量
            if (a >= wt) {
                break;
            }
            // 如果对应的B货物刚好够，证明可以运输
            if ((wt - a) % wb == 0) {
                int j = (wt - a) / wb;
                ans = Math.max(ans, i * pa + j * pb);
            }
        }

        return ans;
    }
}
