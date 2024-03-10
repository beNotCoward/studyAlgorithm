package com.lentouqin.lettcode2023;

import java.util.*;

public class Lt496 {

    public static void main(String[] args) {
        int[] n1 ={4,1,2};
        int[] n2 ={1,3,4,2};
        nextGreaterElement(n1,n2);
    }

    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        Deque<Integer> stack = new ArrayDeque<>();
        for (int i = nums2.length - 1; i >= 0; --i) {
            int temp = nums2[i];
            while (!stack.isEmpty() && stack.peek() < temp){
                stack.pop();
            }
            map.put(temp,stack.isEmpty() ? -1:stack.peek());
            stack.push(temp);
        }
        int[] res = new int[nums1.length];
        for (int i = 0; i < nums1.length; ++i) {
            res[i] = map.get(nums1[i]);
        }
        return res;
    }
}
