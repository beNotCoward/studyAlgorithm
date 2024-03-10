package com.lentouqin.lettcode2023;

public class Lt1232 {
    public static void main(String[] args) {
        int[][] num ={{1,2},{2,3},{3,4},{4,5},{5,6},{6,7}};
        System.out.println(checkStraightLine(num));
    }

    public static boolean checkStraightLine(int[][] coordinates) {
        for(int i = 2;i < coordinates.length;i++){
            int[] a = {coordinates[i - 1][0] - coordinates[i - 2][0],
                    coordinates[i - 1][1] - coordinates[i - 2][1]};
            int[] b = {coordinates[i][0] - coordinates[i - 2][0],
                    coordinates[i][1] - coordinates[i - 2][1]};
            if(a[0] * b[1] - a[1] * b[0] != 0)
                return false;
        }
        return true;

    }
}
