package com.lentouqin.od2023;

public class 单入口最大空闲区域 {
    public static void main(String[] args) {
        char[][] dp = {{'x', 'x', 'x', 'x', 'x'},
                {'x', 'x', 'o', 'o', 'o'},
                {'x', 'x', 'o', 'x', 'x'},
                {'x', 'x', 'o', 'o', 'o'},
                {'x', 'x', 'x', 'x', 'x'}};

        getMax(dp);
    }

    public static String getMax (char[][] dp){
        int x = dp.length;
        int y = dp[0].length;
        int max = 0;
        int[] index = new int[2];
        boolean flag = false;
        for (int i = 0; i < dp.length; i++) {
            if (i == 0) {
                for (int j = 0; j < y; j++) {
                    if (dp[i][j] == 'o') {
                        if (!dfssingle(dp, i, j, x, y, 0)) {
                            continue;
                        }
                        int sum = dfs(dp, i, j, x, y);
                        if(sum == max){
                            flag = true;
                        }
                        if (sum > max) {
                            index[0] = i;
                            index[1] = j;
                            max = sum;
                        }
                    }
                }
            } else if (i == dp.length - 1) {
                for (int j = 0; j < y; j++) {
                    if (dp[i][j] == 'o') {
                        if (!dfssingle(dp, i, j, x, y, 0)) {
                            continue;
                        }
                        int sum = dfs(dp, i, j, x, y);
                        if(sum == max){
                            flag = true;
                        }
                        if (sum > max) {
                            index[0] = i;
                            index[1] = j;
                            max = sum;
                        }
                    }
                }
            } else {
                if (dp[i][0] == 'o') {
                    if (!dfssingle(dp, i, 0, x, y, 0) ) {
                        continue;
                    }
                    int sum = dfs(dp, i, 0, x, y);
                    if(sum == max){
                        flag = true;
                    }
                    if (sum > max) {
                        index[0] = i;
                        index[1] = 0;
                        max = sum;
                    }
                }
                if (dp[i][y - 1] == 'o') {
                    if (!dfssingle(dp, i, y - 1, x, y, 0)) {
                        continue;
                    }
                    int sum = dfs(dp, i, y - 1, x, y);
                    if(sum == max){
                        flag = true;
                    }
                    if (sum > max) {
                        index[0] = i;
                        index[1] = 0;
                        max = sum;
                    }
                }
            }

        }
        return "1";
    }

    public static int dfs(char[][] dp, int i, int j, int x, int y) {
        if (i < 0 || i >= x || j < 0 || j >= y || dp[i][j] == 'x') {
            return 0;
        }
        char c = dp[i][j];
        dp[i][j] = 'x';
        int sum = 1;
        sum += dfs(dp, i + 1, j, x, y);
        sum += dfs(dp, i - 1, j, x, y);
        sum += dfs(dp, i, j + 1, x, y);
        sum += dfs(dp, i, j - 1, x, y);
        dp[i][j] = c;
        return sum;
    }

    public static boolean dfssingle(char[][] dp, int i, int j, int x, int y, int count) {
        if (i < 0 || i >= x || j < 0 || j >= y || dp[i][j] == 'x') {
            return true;
        }

        if (dp[0][j] == 'o' || dp[i][0] == 'o' || dp[i][y - 1] == 'o' || dp[x-1][j] == 'o') {
            count++;
            if (count >= 2) {
                return false;
            }
        }
        char temp = dp[i][j];
        dp[i][j] = 'x';
        boolean flag = true;
        flag &= dfssingle(dp, i + 1, j, x, y, count);
        flag &= dfssingle(dp, i - 1, j, x, y, count);
        flag &= dfssingle(dp, i, j + 1, x, y, count);
        flag &= dfssingle(dp, i, j - 1, x, y, count);
        dp[i][j] = temp;
        return flag;
    }




}
