package com.lentouqin.od2023;

import java.util.ArrayList;

public class NC38 {
    public static void main(String[] args) {
        int[][] input = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(spiralOrder(input));
    }

    public static ArrayList<Integer> spiralOrder(int[][] matrix){
        ArrayList<Integer> temp = new ArrayList<>();
        if(matrix.length == 0){
            return temp;
        }
        int sum = matrix.length * matrix[0].length;
        int index = 0;
        int i = 0;
        int end = 1;
        int start = 0;
        if(matrix.length == 1 && matrix[0].length == 1){
            temp.add(matrix[0][0]);
            return temp;
        }
        while (true){
            while (index < matrix[i].length-end){
                temp.add(matrix[i][index]);
                if(temp.size() == sum){
                    return  temp;
                }
                index++;
            }
            while (i < matrix.length-end ){
                temp.add(matrix[i][index]);
                if(temp.size() == sum){
                    return  temp;
                }
                i++;
            }
            while ( index > start){
                temp.add(matrix[i][index]);
                if(temp.size() == sum){
                    return temp;
                }
                index--;
            }
            while (i > start ){
                temp.add(matrix[i][index]);
                if(temp.size() == sum){
                    return temp;
                }
                i--;
            }
            i++;
            index++;
            end++;
            start++;
            if (temp.size() == sum - 1) {
                int earth = matrix.length / 2;
                temp.add(matrix[earth][earth]);
                return temp;
            }

        }
    }
}
