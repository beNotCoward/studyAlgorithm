package com.lentouqin.lettcode2023;

public class Lt617 {
    public static void main(String[] args) {

    }

    public static TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        if (root1 == null) {
            return root2;
        } else if (root2 == null) {
            return root1;
        }
        TreeNode newTrue = new TreeNode(root1.val+root2.val);
        newTrue.left = mergeTrees(root1.left,root2.left);
        newTrue.right = mergeTrees(root1.right,root2.right);
        return newTrue;

    }
}
