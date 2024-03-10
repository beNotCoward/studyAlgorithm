package com.lentouqin.lettcode2023;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Lt107 {
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

        levelOrderBottom(treeNode3);
    }

    public static List<List<Integer>> levelOrderBottom(TreeNode root) {
        LinkedList<List<Integer>> result = new LinkedList<>();
        if(root == null){
            result.add(new LinkedList<>());
            return result;
        }
        bfs(root,result);
        return result;
    }

    public static void bfs(TreeNode root,LinkedList<List<Integer>> result){
        Queue<TreeNode> tempQueue= new LinkedList<>();
        tempQueue.add(root);
        while (!tempQueue.isEmpty()) {
            List<Integer> temp = new LinkedList<>();
            int size = tempQueue.size();
            for (int i = 0; i < size; i++) {
                TreeNode nowTree = tempQueue.remove();
                if(nowTree == null){
                    break;
                }
                if (nowTree.left != null) {
                    tempQueue.add(nowTree.left);
                }
                if (nowTree.right != null) {
                    tempQueue.add(nowTree.right);
                }
                temp.add(nowTree.val);
            }
            result.addFirst(temp);
        }
    }
}
