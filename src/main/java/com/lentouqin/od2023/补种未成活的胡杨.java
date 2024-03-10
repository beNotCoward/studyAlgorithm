package com.lentouqin.od2023;

public class 补种未成活的胡杨 {
    public static void main(String[] args) {
        //right();
        mine(10,new int[]{2,4,7},3);
    }

    private static void mine(int n,int[] dead,int k){
        int max = 0;
        // 首先知道补种也必须是连续的才有可能获得最大连续棵树
        for (int i = 0; i <= dead.length-k; i++) {
            int left = 0;
            int right = n;
            if (i > 0){
                left = dead[i-1];
            }

            if (i + k < dead.length){
                right = dead[i+k]-1;
            }
            max = Math.max(max,right -left);

        }
        System.out.println(max);

    }

    private static void right() {
        int N = 10;
        int[] ints_M = new int[]{2,4,7};
        int K = 1;

        // 开始补种 滑动窗口，首先知道补种也必须是连续的才有可能获得最大连续棵树，然后设定左右指针，保证中间有K棵树补种
        int max = 0;
        for (int i = 0; i <= ints_M.length - K; i++) {
            int le = 0;
            int ri = N;
            if (i > 0) {
                le = ints_M[i - 1];
            }

            if (i + K < ints_M.length) {
                ri = ints_M[i + K] - 1;
            }

            int temp = ri - le;
            if (temp > max) {
                max = temp;
            }
        }

        System.out.println(max);
    }
}
