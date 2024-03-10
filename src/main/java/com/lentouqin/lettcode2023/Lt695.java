package com.lentouqin.lettcode2023;

public class Lt695 {
    public static void main(String[] args) {
        int[][] grid = {{0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0},
                {0, 1, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 1, 0, 0, 1, 1, 0, 0, 1, 0, 1, 0, 0},
                {0, 1, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0}};
        System.out.println(maxAreaOfIsland(grid));

    }

    public static int maxAreaOfIsland(int[][] grid){
        int max = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if(grid[i][j] == 1){
                    int num = dfs(grid, i, j, grid.length, grid[i].length);
                    max = Math.max(max,num);
                }
            }
        }
        return max;

    }

    public static int dfs(int[][] grid,int i,int j,int high,int weight){
        if(i < 0 || i >= high || j <0 || j >= weight || grid[i][j] == 0){
            return 0;
        }
        int num =1;
        grid[i][j]=0;
        num+= dfs(grid,i+1,j,high,weight);
        num+= dfs(grid,i-1,j,high,weight);
        num+= dfs(grid,i,j+1,high,weight);
        num+= dfs(grid,i,j-1,high,weight);
        return num;
    }

}
