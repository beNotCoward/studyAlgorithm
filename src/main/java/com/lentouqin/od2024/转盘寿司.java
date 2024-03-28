package com.lentouqin.od2024;

import java.util.Arrays;
import java.util.Stack;

/**
 * it is still a beautiful world
 *
 * @author by hothead
 * @date 2024/3/26.
 */
public class 转盘寿司 {
    public static void main(String[] args) {
        int[] input = {3,15,6,14};
        System.out.println(Arrays.toString(max(input)));
    }

    public static int[] max(int[] inputArr){
        int n = inputArr.length;
        int[] result = Arrays.copyOf(inputArr, inputArr.length);
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < 2 * n-1; i++) {
            while (!stack.isEmpty() && inputArr[i % n] < inputArr[stack.peek()]) {
                Integer original = stack.peek();
                result[stack.pop()] = inputArr[original] + inputArr[i % n];
            }
            stack.push(i % n);
        }
        return result;
    }
}
