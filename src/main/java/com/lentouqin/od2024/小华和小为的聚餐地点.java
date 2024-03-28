package com.lentouqin.od2024;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * it is still a beautiful world
 *
 * @author by hothead
 * @date 2024/3/24.
 */
public class 小华和小为的聚餐地点 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] inputArr = new int[m][n];
        for (int i = 0; i < inputArr.length; i++) {
            for (int j = 0; j < inputArr[i].length; j++) {
                inputArr[i][j] = sc.nextInt();
            }
        }
        System.out.println(canEat(inputArr, m, n));
    }

    public static int canEat(int[][] inputArr, int m, int n) {
        Set<String> hua = new HashSet<>();
        Set<String> wei = new HashSet<>();
        for (int i = 0; i < inputArr.length; i++) {
            for (int j = 0; j < inputArr[i].length; j++) {
                if (inputArr[i][j] == 2) {
                    canGo(inputArr, m, n, i, j, hua);
                    inputArr[i][j] = 0;
                }
            }
        }

        for (int i = 0; i < inputArr.length; i++) {
            for (int j = 0; j < inputArr[i].length; j++) {
                if (inputArr[i][j] == 2) {
                    canGo(inputArr, m, n, i, j, wei);
                    break;
                }
            }
        }
        hua.retainAll(wei);
        return hua.size();
    }

    public static void canGo(int[][] inputArr, int m, int n, int i, int j, Set<String> user) {
        if (i < 0 || i >= m || j < 0 || j >= n || inputArr[i][j] == 1) {
            return;
        }
        if (inputArr[i][j] == 3) {
            user.add(i + "" + j);
        }
        int temp = inputArr[i][j];
        // 走过的路标记为1，防止重复走
        if (inputArr[i][j] == 2 || inputArr[i][j] == 0 || inputArr[i][j] == 3) {
            inputArr[i][j] = 1;
        }
        canGo(inputArr, m, n, i + 1, j, user);
        canGo(inputArr, m, n, i - 1, j, user);
        canGo(inputArr, m, n, i, j + 1, user);
        canGo(inputArr, m, n, i, j - 1, user);

        // 还原原来的状态
        inputArr[i][j] = temp;
    }
}
