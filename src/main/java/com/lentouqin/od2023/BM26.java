package com.lentouqin.od2023;

import com.lentouqin.lettcode2023.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BM26 {

    public static void main(String[] args) {
        TreeNode treeNode3 = new TreeNode(3);
        TreeNode treeNode9 = new TreeNode(9);
        TreeNode treeNode20 = new TreeNode(20);
        TreeNode treeNode15 = new TreeNode(15);
        TreeNode treeNode7 = new TreeNode(7);
        treeNode3.setLeft(treeNode9);
        treeNode3.setRight(treeNode20);
        treeNode20.setRight(treeNode7);
        treeNode20.setLeft(treeNode15);
        levelOrder(treeNode3);
    }

    public static ArrayList<ArrayList<Integer>> levelOrder (TreeNode root) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        if(root == null){
            return result;
        }
        get(root,result);
        return result;
    }

    public static void get(TreeNode root,ArrayList<ArrayList<Integer>> result){
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()){
            int size = queue.size();
            ArrayList<Integer> list = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                TreeNode treeTemp = queue.remove();
                if(treeTemp.getLeft()!=null){
                    queue.add(treeTemp.getLeft());
                }
                if(treeTemp.getRight()!=null){
                    queue.add(treeTemp.getRight());
                }
                list.add(treeTemp.getVal());
            }
            result.add(list);
        }

    }
}
