package com.lentouqin.Algorithm;

import java.util.Arrays;

/**
 * 冒泡算法
 * 重复地走访过要排序的数列，一次比较两个元素，如果他们的顺序错误就把他们交换过来。走访数列的工作是重复地进行直到没有再需要交换，也就是说该数列已经排序完成。
 */
public class BubbleSort {

    public static void main(String[] args) {
        int[] nums= {5,22,75,33,45,6,77,3,42};
        bubbleSort(nums);
    }


    public static void bubbleSort(int[] input) {
        for (int i = 0; i < input.length; i++) {
            for (int j = 0; j < input.length - i - 1; j++) {
                if (input[j] > input[j + 1]) {
                    int temp = input[j + 1];
                    input[j + 1] = input[j];
                    input[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(input));
    }

}
