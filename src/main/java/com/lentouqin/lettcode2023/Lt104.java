package com.lentouqin.lettcode2023;

public class Lt104 {
    public static void main(String[] args) {

    }

    public static int maxDepth(TreeNode root) {
        if(root == null){
            return 0;
        }else {
            int rootLeft = maxDepth(root.left);
            int rootRight = maxDepth(root.right);
            return Math.max(rootLeft,rootRight)+1;
        }
    }
}
