package com.lentouqin.od2024;

import java.util.Arrays;
import java.util.Scanner;

/**
 * it is still a beautiful world
 *
 * @author by hothead
 * @date 2024/3/28.
 */
public class 园区参观路径 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String in = sc.nextLine();
        String[] input = in.split(" ");
        int[] ints = Arrays.stream(input).mapToInt(Integer::parseInt).toArray();
        int[][] inputArr = new int[ints[0]][ints[1]];
        for (int i = 0; i < inputArr.length; i++) {
            for (int j = 0; j < inputArr[i].length; j++) {
                inputArr[i][j] = sc.nextInt();
            }
        }
        System.out.println(maxSum(inputArr));
    }

    public static int maxSum(int[][] inputArr) {
        int n = inputArr.length;
        int m = inputArr[0].length;
        int[] dp = new int[m];
        //起点可能有障碍物
        dp[0] = (inputArr[0][0] == 1) ? 0 : 1;
        for(int i = 0; i < n; ++i) {
            for(int j = 0; j < m; ++j) {
                //有障碍物的格子直接赋0
                if(inputArr[i][j] == 1) {
                    dp[j] = 0;
                }
                //否则dp[j]的值由左方和上一次迭代的dp[j]累加而来
                else if(inputArr[i][j] == 0 && j - 1 >= 0) {
                    dp[j] = dp[j] + dp[j - 1];
                }
            }
        }
        return dp[m - 1];
    }
}
