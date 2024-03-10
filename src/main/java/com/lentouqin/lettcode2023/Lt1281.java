package com.lentouqin.lettcode2023;

public class Lt1281 {
    public static void main(String[] args) {
        System.out.println(subtractProductAndSum(234));
    }

    public static int subtractProductAndSum(int n) {

        String s = String.valueOf(n);
        int resultSum = 1;
        int resultChen = 1;
        for (int i = 0; i < s.length(); i++) {
            resultSum += n % 10;
            resultChen *= n % 10;
            n /= 10;
        }

        return resultChen-(resultSum-1);

    }
}
