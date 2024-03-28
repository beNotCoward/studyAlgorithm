package com.lentouqin.od2024;

import java.util.PriorityQueue;
import java.util.Scanner;

class Node implements Comparable<Node> {
    long weight;       // 权值
    int height;        // 树高度
    Node left, right;  // 左右子树

    public Node() {
        this.height = 1;
        this.left = null;
        this.right = null;
    }

    // 重载小于运算符，用于定义小顶堆中的比较规则
    @Override
    public int compareTo(Node other) {
        if (this.weight != other.weight) {
            return Long.compare(this.weight, other.weight);  // 小顶堆，按照权值升序排列
        } else {
            return Integer.compare(this.height, other.height);  // 权值相同，则树高度升序排序
        }
    }
}

public class 生成哈夫曼树 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        PriorityQueue<Node> minHeap = new PriorityQueue<>();

        for (int i = 0; i < n; i++) {
            Node node = new Node();
            node.weight = scanner.nextLong();
            minHeap.offer(node);
        }

        // 生成哈夫曼树，使用小顶堆，每次取出两个最小的节点，合并为一个新节点，再放回去，直到只剩一个节点为止。
        while (minHeap.size() > 1) {
            Node left = minHeap.poll();
            Node right = minHeap.poll();

            Node pnode = new Node();
            pnode.weight = left.weight + right.weight;
            pnode.height = Math.max(left.height, right.height) + 1;
            pnode.left = left;
            pnode.right = right;

            minHeap.offer(pnode);
        }

        Node root = minHeap.poll();
        inorder(root);
    }

    // 中序遍历
    static void inorder(Node node) {
        if (node == null) {
            return;
        }
        inorder(node.left);
        System.out.print(node.weight + " ");
        inorder(node.right);
    }
}

