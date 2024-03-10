package com.lentouqin.lettcode2023;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Lt2196 {
    public static void main(String[] args) {
        int[][] dp = {{20, 15, 1}, {20, 17, 0}, {50, 20, 1}, {50, 80, 0}, {80, 19, 1}};
        createBinaryTree(dp);
    }

    public static TreeNode createBinaryTree(int[][] descriptions) {
        Map<Integer,TreeNode> map = new HashMap<>();
        Set<Integer> set =  new HashSet<>(); // 所有为子节点的集合
        for (int i = 0; i < descriptions.length; i++) {
            TreeNode treeNode = new TreeNode(descriptions[i][0]);
            if (map.containsKey(descriptions[i][0])) {
                treeNode = map.get(descriptions[i][0]);
            }

            if (!map.containsKey(descriptions[i][0])) {
                map.put(descriptions[i][0], treeNode);
            }
            if (descriptions[i][2] == 1) {
                if (map.containsKey(descriptions[i][1])) {
                    treeNode.left = map.get(descriptions[i][1]);
                } else {
                    TreeNode left = new TreeNode(descriptions[i][1]);
                    treeNode.left = left;
                    map.put(descriptions[i][1], left);
                }
            } else {
                if (map.containsKey(descriptions[i][1])) {
                    treeNode.right = map.get(descriptions[i][1]);
                } else {
                    TreeNode right = new TreeNode(descriptions[i][1]);
                    treeNode.right = right;
                    map.put(descriptions[i][1], right);
                }
            }
            set.add(descriptions[i][1]);
        }
        for (Integer integer : map.keySet()) {
            if (!set.contains(integer)) {
                return map.get(integer);
            }
        }

        return new TreeNode(-1);
    }
}
