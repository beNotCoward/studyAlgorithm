package com.lentouqin.od2024;

import java.util.Scanner;

/**
 * it is still a beautiful world
 *
 * @author by hothead
 * @date 2024/3/22.
 */
public class 拼接url {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(compliance(s));

/*        String pre = "";
        String suf = "";
        boolean flag = true;

        for (char ch : s.toCharArray()) {
            if (ch == ',') {
                flag = false;
                continue;
            } else if (flag) {
                pre += ch;
            } else {
                suf += ch;
            }
        }

        if (pre.isEmpty()) {
            pre = "/";  // 如果前缀为空，则填充/
        }
        if (suf.isEmpty()) {
            suf = "/";  // 如果后缀为空，则填充/
        }
        if (pre.charAt(pre.length() - 1) != '/') {
            pre += '/';  // 如果前缀结尾没有/，则自动补上/
        }
        if (suf.charAt(0) != '/') {
            suf = '/' + suf;  // 如果后缀开头没有/，则自动补上/
        }
        if (pre.charAt(pre.length() - 1) == '/' && suf.charAt(0) == '/') {
            pre = pre.substring(0, pre.length() - 1);  // 有多余的/，需要自动去重
        }

        String res = pre + suf;*/
  /*      System.out.println(res);*/
    }

    public static String compliance(String inputStr) {
        String[] inputArr = inputStr.split(",");
        int left = 0;
        int right = 1;
        // 通过双指针对首尾元素做判断
        //TODO
        while (right < inputArr.length) {

        }
        return "";
    }

}
