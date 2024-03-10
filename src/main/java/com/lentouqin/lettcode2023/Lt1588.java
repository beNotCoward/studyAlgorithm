package com.lentouqin.lettcode2023;

public class Lt1588 {
    public static void main(String[] args) {
        int[] num ={1,4,2,5,3};
        sumOddLengthSubarrays(num);
    }

    public static int sumOddLengthSubarrays(int[] arr) {
        int n = arr.length;
        int[] prefix = new int[n + 1];
        for (int i = 0; i < n; i++) {
            prefix[i + 1] = prefix[i] + arr[i];
        }
        int res = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i; j >= 0; j -= 2) {
                res += prefix[i + 1] - prefix[j];
            }
        }
        return res;
    }
}
