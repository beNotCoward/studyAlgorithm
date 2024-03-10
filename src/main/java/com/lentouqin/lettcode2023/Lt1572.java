package com.lentouqin.lettcode2023;

public class Lt1572 {

    public static int diagonalSum(int[][] mat) {
        int l = 0;
        int r = mat[0].length-1;
        int sum = 0;
        for (int i = 0; i < mat.length; i++) {
            if(l == r){
                sum += mat[i][r];
                l++;
                r--;
            }else {
                sum += mat[i][r];
                sum += mat[i][l];
                l++;
                r--;
            }
        }
        return sum;
    }
}
