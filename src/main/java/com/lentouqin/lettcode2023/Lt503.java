package com.lentouqin.lettcode2023;

import java.util.*;
import java.util.stream.Collectors;

/**
 * it is still a beautiful world
 *
 * @author by hothead
 * @date 2024/3/26.
 */
public class Lt503 {
    public static void main(String[] args) {
        int[] input = {1,2,1};
        nextGreaterElement(input);
    }
    public static int[] nextGreaterElement(int[] nums) {
        int n = nums.length;
        int[] ret = new int[n];
        Arrays.fill(ret, -1);
        Deque<Integer> stack = new LinkedList<Integer>();
        for (int i = 0; i < n * 2 - 1; i++) {
            while (!stack.isEmpty() && nums[stack.peek()] < nums[i % n]) {
                nums[stack.pop()] = nums[i % n];
            }
            stack.push(i % n);
        }
/*        for (int i = 0; i < n * 2 - 1; i++) {
            while (!stack.isEmpty() && nums[stack.peek()] < nums[i % n]) {
                ret[stack.pop()] = nums[i % n];
            }
            stack.push(i % n);
        }*/
        return ret;
    }
}
