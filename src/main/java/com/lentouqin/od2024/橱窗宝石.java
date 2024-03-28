package com.lentouqin.od2024;

import java.util.Scanner;

/**
 * it is still a beautiful world
 *
 * @author by hothead
 * @date 2024/3/22.
 */
public class 橱窗宝石 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = Integer.parseInt(sc.nextLine());
        int[] inputArr = new int[num];
        for (int i = 0; i < num; i++) {
            inputArr[i] = Integer.parseInt(sc.nextLine());
        }
        int money = Integer.parseInt(sc.nextLine());
        System.out.println(diamondNumOk(inputArr, money));
    }

    public static int diamondNumOk(int[] inputArr, int money){
        int ans = 0, sum = 0;  // 初始化最大子数组长度和区间和
        int l = 0, r = 0;  // 初始化双指针起始位置
        // 遍历数组
        while (r < inputArr.length) {
            sum += inputArr[r];
            // 当区间和大于value时，左指针右移
            while (sum > money) {
                sum -= inputArr[l];
                l++;
            }
            // 更新最大长度
            ans = Math.max(ans, r - l + 1);
            r++;
        }
        return ans;
    }

    /**
     * 超时了
     * @param inputArr
     * @param money
     * @return
     */
    public static int diamondNum(int[] inputArr, int money) {
        int max = 0;
        for (int i = 0; i < inputArr.length; i++) {
            int temp = 0;
            for (int j = i; j < inputArr.length; j++) {
                if (inputArr.length  - i < max) {
                    return max;
                }
                temp += inputArr[j];
                if (temp > money) {
                    break;
                }
                if (j - i + 1 > max) {
                    max = j - i + 1;
                }
            }
        }
        return max;
    }
}
