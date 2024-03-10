package com.lentouqin.lettcode2023;

import java.util.LinkedList;
import java.util.List;

public class Lt589 {
    public static void main(String[] args) {

    }
    public static List<Integer> preorder(Node root) {
        List<Integer> result = new LinkedList<>();
        dfs(result,root);
        return result;
    }

    public static void dfs(List<Integer> result, Node root) {
        if (root == null || root.children == null) {
            return;
        }
        result.add(root.val);
        for (Node child : root.children) {
            dfs(result, child);
        }
    }


    class Node {
        public int val;
        public List<Node> children;

        public Node() {}

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, List<Node> _children) {
            val = _val;
            children = _children;
        }
    }
}
