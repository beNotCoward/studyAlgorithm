package com.lentouqin.lettcode2023;

public class Lt200 {
    public static void main(String[] args) {
       char[][] grid = new char[][]{
               {'1','1','1','1','0'},
               {'1','1','0','1','0'},
               {'1','1','0','0','0'},
               {'0','0','0','0','0'}
       };

        char[][] grid2 = new char[][]{
                {'1','1','0','0','0'},
                {'1','1','0','0','0'},
                {'0','0','1','0','0'},
                {'0','0','0','1','1'}
        };

        System.out.println(numIslands(grid));
        System.out.println(numIslands(grid2));
    }

    public static int numIslands(char[][] grid) {
        if (grid == null || grid.length == 0) {
            return 0;
        }
        // 岛屿的数量
        int result = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == '1') {
                    result++;
                    dfs(grid,i,j);
                }
            }
        }
        return result;
    }

    // dfs函数遍历
    public static void dfs(char[][] grid, int i, int j) {
        if (i < 0 || j < 0 || i > grid.length-1 || j > grid[i].length-1 || grid[i][j] == '0') {
            return;
        }
        grid[i][j] = '0';

        dfs(grid,i+1,j);
        dfs(grid,i-1,j);
        dfs(grid,i,j+1);
        dfs(grid,i,j-1);
    }
}
