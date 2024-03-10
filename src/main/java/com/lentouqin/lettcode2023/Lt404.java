package com.lentouqin.lettcode2023;

public class Lt404 {
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
        int result = 0;
        System.out.println(sumOfLeftLeaves(treeNode3));


    }

    public static int sumOfLeftLeaves(TreeNode root) {
        if(root == null) return 0;
        int res = 0;
        //判断节点是否是左叶子节点，如果是则将它的和累计起来
        if(root.left != null && root.left.left == null && root.left.right == null){
            res += root.left.val;
        }
        return sumOfLeftLeaves(root.left) + sumOfLeftLeaves(root.right) + res;
    }

    public static int mine(TreeNode root){
        if(root == null){
            return 0;
        }
        int sum =0;
        if(root.left != null && root.left.left == null && root.left.right == null){
            sum += root.left.val;
        }
        return mine(root.right)+mine(root.left)+sum;
    }

}
