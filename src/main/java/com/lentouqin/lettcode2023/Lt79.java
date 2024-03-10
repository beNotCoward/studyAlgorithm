package com.lentouqin.lettcode2023;

public class Lt79 {
    public static void main(String[] args) {

    }

    public static boolean exist(char[][] board, String word) {
        int high = board.length;
        int weigh = board[0].length;
        boolean hasWord = false;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (dfs(i, j, high, weigh, word, board, 0)) {
                    return hasWord = true;
                }
            }
        }

        return hasWord;
    }

    public static boolean dfs(int i, int j, int high, int weight, String word, char[][] board, int index) {
        if (index == word.length()){
            return true;
        }

        if (i < 0 || i >= high || j < 0 || j >= weight) {
            return false;
        }
        if (index > word.length() || board[i][j] != word.charAt(index)) {
            return false;
        }

        char c = board[i][j];
        board[i][j] = '0';
        boolean result = dfs(i + 1, j, high, weight, word, board, index + 1) ||
                dfs(i - 1, j, high, weight, word, board, index + 1) ||
                dfs(i, j + 1, high, weight, word, board, index + 1) ||
                dfs(i, j - 1, high, weight, word, board, index + 1);
        board[i][j] = c;
        return result;
    }
}
