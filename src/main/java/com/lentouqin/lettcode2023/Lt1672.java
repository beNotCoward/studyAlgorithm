package com.lentouqin.lettcode2023;

import java.util.Arrays;

public class Lt1672 {
    public static void main(String[] args) {

    }

    public static int maximumWealth(int[][] accounts) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < accounts.length; i++) {
            max = Math.max(max, Arrays.stream(accounts[i]).sum());
        }
        return max;
    }
}
