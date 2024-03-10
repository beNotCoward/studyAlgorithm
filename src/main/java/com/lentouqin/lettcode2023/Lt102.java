package com.lentouqin.lettcode2023;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Lt102 {
    public static void main(String[] args) {
        TreeNode treeNode3 = new TreeNode(3);
        TreeNode treeNode9 = new TreeNode(9);
        TreeNode treeNode20 = new TreeNode(20);
        TreeNode treeNode15 = new TreeNode(15);
        TreeNode treeNode7 = new TreeNode(7);

        treeNode3.left = treeNode9;
        treeNode3.right = treeNode20;
        treeNode20.right = treeNode7;
        treeNode20.left = treeNode15;

        levelOrder(treeNode3);

    }
    public static List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if(root == null){
            return result;
        }
        // 构建存放下层节点树的队列
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while (q.size() > 0){
            int size = q.size();
            ArrayList<Integer> list = new ArrayList<>();
            while (size > 0){
                TreeNode cur = q.poll();
                list.add(cur.val);
                if(cur.left != null){
                    q.add(cur.left);
                }
                if(cur.right != null){
                    q.add(cur.right);
                }
                size--;
            }
            result.add(list);
        }
        return result;
    }
}
