package com.lentouqin.od2024;

import java.util.Scanner;

/**
 * it is still a beautiful world
 *
 * @author by hothead
 * @date 2024/3/25.
 */
public class 小华最多能得到多少克黄金 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String inputSt = sc.nextLine();
        String[] inputArr = inputSt.split(" ");
        int[][] input = new int[Integer.parseInt(inputArr[0])][Integer.parseInt(inputArr[1])];
        dfs(0, 0, input, Integer.parseInt(inputArr[2]));
        System.out.println(result);
    }

    // 计算数位和
    public static int get(int num) {
        int result = 0;
        while (num > 0) {
            result += num % 10;
            num /= 10;
        }
        return result + num;
    }

    static int result = 0;

    public static void dfs(int i, int j, int[][] inputArr, int k) {
        if (i < 0 || i >= inputArr.length || j < 0 || j >= inputArr[0].length || inputArr[i][j] == -1) {
            return;
        }
        if (get(i)+get(j) > k) {
            return;
        }
        inputArr[i][j] = -1;
        result++;
        dfs(i+1,j,inputArr,k);
        dfs(i-1,j,inputArr,k);
        dfs(i,j+1,inputArr,k);
        dfs(i,j-1,inputArr,k);
    }
}
