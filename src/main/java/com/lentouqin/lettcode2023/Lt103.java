package com.lentouqin.lettcode2023;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Lt103 {
    public static void main(String[] args) {
        TreeNode treeNode1 = new TreeNode(1);
        TreeNode treeNode2 = new TreeNode(2);
        TreeNode treeNode3 = new TreeNode(3);
        TreeNode treeNode4 = new TreeNode(4);
        TreeNode treeNode5 = new TreeNode(5);
        treeNode1.setLeft(treeNode2);
        treeNode1.setRight(treeNode3);
        treeNode2.setLeft(treeNode4);
        treeNode2.setRight(null);
        treeNode3.setLeft(null);
        treeNode3.setRight(treeNode5);
        zigzagLevelOrder(treeNode1);
    }

    public static List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if(root == null){
            return result;
        }
        List<TreeNode> tempQueue = new LinkedList<>();
        tempQueue.add(root);
        boolean flag = false;
        while (!tempQueue.isEmpty()){
            int size = tempQueue.size();
            List<Integer> tempResult = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                TreeNode current = ((LinkedList<TreeNode>) tempQueue).remove();
                tempResult.add(current.val);
                if (current.left != null) {
                    tempQueue.add(current.left);
                }
                if (current.right != null) {
                    tempQueue.add(current.right);
                }

            }
            if(flag){
                Collections.reverse(tempResult);
            }
            result.add(tempResult);
            flag = !flag;
        }
        return result;

    }

}
