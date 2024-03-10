package com.lentouqin.lettcode2023;

import java.util.Arrays;

public class Lt1491 {
    public static void main(String[] args) {
        int[] nums = {4000,3000,1000,2000};
        average(nums);
    }

    public static double average(int[] salary) {
        Arrays.sort(salary);
        if (salary.length == 3) {
            return (double) salary[1];
        } else {
            double sum = 0;
            for (int i = 1; i < salary.length - 1; i++) {
                sum += salary[i];
            }
            return Double.valueOf(sum / (salary.length - 2));
        }

    }
}
