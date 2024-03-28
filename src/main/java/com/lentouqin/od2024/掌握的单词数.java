package com.lentouqin.od2024;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * it is still a beautiful world
 *
 * @author by hothead
 * @date 2024/3/25.
 */
public class 掌握的单词数 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] w = new String[n];
        for (int i = 0; i < n; i++) {
            w[i] = sc.next();
        }
        String t = sc.next();
        List<Integer> cnts = new ArrayList<>(Collections.nCopies(26, 0));  //记录匹配串每个字符的数量
        int ask = 0;  //问号字符的数量
        for (char ch : t.toCharArray()) {
            if (ch == '?') {
                ask++;
            } else {
                cnts.set(ch - 'a', cnts.get(ch - 'a') + 1);
            }
        }
        int res = 0;  //统计最终匹配的单词个数
        for (String s : w) {
            if (check(s, cnts, ask)) {
                res++;
            }
        }
        System.out.println(res);
    }

    static boolean check(String s, List<Integer> cnts, int ask) {  //检查当前匹配串能否匹配字符串s
        List<Integer> v = new ArrayList<>(cnts);
        int num = ask;  //当前可用的问号数量
        for (char ch : s.toCharArray()) {
            int u = ch - 'a';
            if (v.get(u) == 0 && num == 0) {  //当前没有字母可以匹配，也没有问号可以匹配
                return false;
            } else if (v.get(u) > 0) {  //如果有字母可以匹配，优先匹配字母
                v.set(u, v.get(u) - 1);
            } else {
                num--;
            }
        }
        return true;
    }
}
