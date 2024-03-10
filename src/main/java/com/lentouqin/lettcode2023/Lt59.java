package com.lentouqin.lettcode2023;

public class Lt59 {
    public static void main(String[] args) {
        generateMatrix(4);
    }

    public static int[][] generateMatrix(int n) {
        int x;
        int y = 0;
        int num = n*n;
        int[][] result = new int[n][n];
        int count = 1;
        // 用于标识是第几层
        int limit = 0;
        while (true) {
            if (count > num) {
                break;
            }
            x=limit;
            y=limit;
            while (y < n-limit && count <= num) {
                result[x][y] = count;
                count++;
                y++;
            }
            if (count > num) {
                break;
            }
            y--;
            x++;
            while (x < n-limit){
                result[x][y] = count;
                count++;
                x++;
            }
            if (count > num) {
                break;
            }
            x--;
            y--;
            while (y >= 0+limit){
                result[x][y] = count;
                count++;
                y--;
            }
            if (count > num) {
                break;
            }
            y++;
            x--;
            while (x > 0+limit && count <= num){
                result[x][y] = count;
                count++;
                x--;
            }
            limit++;
        }

        return result;
    }
}
