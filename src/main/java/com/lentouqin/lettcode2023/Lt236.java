package com.lentouqin.lettcode2023;

public class Lt236 {
    public static void main(String[] args) {
        
    }

    public static TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root == null || root == p || root == q){
            //只要当前根节点是p或q中的任意一个，就返回(因为不能比这个更深了，再深p和q中的一个就没了)
            return root;
        }
        // 根节点不是p和q中的任意一个，那就继续分别往左子树和右子树找p和q
        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);

        //左子树没有p也没有q,就返回右子树的结果
        if(left == null){
            return right;
        }
        //右子树没有p也没有q,就返回左子树的结果
        if(right == null){
            return left;
        }

        //左右子树都找到p和q了，那就说明P和q分别在左右两个子树上，所以此时的最近公共祖先就是root
        return root;

    }
}
