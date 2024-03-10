package com.lentouqin.lettcode2023;

public class Lt733 {
    public static void main(String[] args) {
        int[][] image ={{0,0,0},{0,0,0}};
        int sr = 1;
        int sc = 0;
        int newColor = 2;
        int[][] ints = floodFill(image, sr, sc, newColor);
    }

    public static int[][] floodFill(int[][] image, int sr, int sc, int color) {
        if(image[sr][sc] == color){
            return image;
        }

        for (int i = 0; i < image.length; i++) {
            for (int j = 0; j < image[i].length; j++) {
                if(i == sr && j == sc){
                    int found = image[sr][sc];
                    dfs(image,image.length,image[i].length,i,j,color,found);
                }
            }
        }
        return image;
    }

    public static void dfs(int[][] image, int high, int weight,
                           int i, int j, int newColor, int old) {
        if (i < 0 || i > high - 1 || j < 0 || j > weight - 1 || image[i][j] != old) {
            return;
        }
        image[i][j] = newColor;
        dfs(image,high,weight, i+1,j,newColor,old);
        dfs(image,high,weight, i-1,j,newColor,old);
        dfs(image,high,weight, i,j+1,newColor,old);
        dfs(image,high,weight, i,j-1,newColor,old);
    }
}
