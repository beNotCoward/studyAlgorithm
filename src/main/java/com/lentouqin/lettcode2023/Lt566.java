package com.lentouqin.lettcode2023;

import java.util.LinkedList;
import java.util.List;

public class Lt566 {
    public static void main(String[] args) {
        int[][] num = {{1,2}};
        matrixReshape(num,1,1);
    }

    public static int[][] matrixReshape(int[][] mat, int r, int c) {
        if(r * c > mat.length*mat[0].length){
            return mat;
        }
        List<Integer> linkedList = new LinkedList<>();
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                linkedList.add(mat[i][j]);
            }
        }
        if(c == 0){
            c = linkedList.size();
        }
        int[][] result = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                result[i][j] = ((LinkedList<Integer>) linkedList).remove();
            }
        }
        return result;
    }
}
