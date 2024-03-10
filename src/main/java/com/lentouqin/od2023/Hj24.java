package com.lentouqin.od2023;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Hj24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String input = sc.nextLine();
        String[] split = input.split(" ");
        int n = Integer.parseInt(s);
        System.out.println(getCamp(n, split));
    }

    public static int getCamp(int n, String[] strings){
        int[] sum = new int[strings.length];
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < strings.length; i++) {
            sum[i] = Integer.parseInt(strings[i]);
            max = Math.max(max,sum[i]);
        }
        Deque<Integer> stack = new ArrayDeque<>();
        int remove = 0;
        int indexMax = 0;
        for (int i = 0; i < sum.length; i++) {
            if (stack.isEmpty()) {
                stack.add(sum[i]);
                continue;
            }
            if (sum[i] == max) {
                stack.add(sum[i]);
                indexMax = i;
                break;
            }
            if ( sum[i] <= stack.peek() ) {
                remove++;
                continue;
            } else {
                stack.add(sum[i]);
            }
        }
        for (int i = indexMax+1; i < sum.length; i++) {
            if(sum[i] < stack.peek()){
                stack.add(sum[i]);
            }else {
                remove++;
            }
        }
        return remove;
    }
}
