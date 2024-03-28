package com.lentouqin.od2024;

import java.util.Scanner;

/**
 * it is still a beautiful world
 *
 * @author by hothead
 * @date 2024/3/28.
 */
public class 游戏分组 {
    static int[] w = new int[10];
    static int total;
    static int ans = Integer.MAX_VALUE; // 差距最小值
    static boolean[] choose = new boolean[10];
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 读取输入并转为整数数组
        for (int i = 0; i < 10; i++) {
            w[i] = scanner.nextInt();
            total += w[i];
        }

        // 深度优先搜索
        dfs(0, 0);

        // 输出最小评分差距
        System.out.println(ans);
    }

    static void dfs(int cnt, int cur) {
        // 当已选入5名队员时，计算当前两队的评分差距并更新最小值
        if (cnt == 5) {
            ans = Math.min(ans, Math.abs(total - 2 * cur));
            return;
        }

        // 遍历所有参与者，选择未被选入的队员加入当前队伍
        for (int i = 0; i < 10; i++) {
            if (choose[i]) {
                continue;
            }
            choose[i] = true;
            dfs(cnt + 1, cur + w[i]);
            choose[i] = false;
        }
    }
}
