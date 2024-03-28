package com.lentouqin.od2024;

import java.util.*;

/**
 * it is still a beautiful world
 *
 * @author by hothead
 * @date 2024/3/28.
 */
public class 寻找最富裕的小家庭 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt(); // 读入节点数
        int[] a = new int[n + 1];

        // 读入每个节点的权值
        for (int i = 1; i <= n; i++) {
            a[i] = scanner.nextInt();
        }

        int[] fa = new int[n + 1]; // 存储每个节点的父节点
        int[][] e = new int[n + 1][n + 1]; // 存储树的边关系

        // 读入树的边关系，构建树结构
        for (int i = 1; i < n; i++) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            fa[y] = x; // y 是 x 的子节点，记录父节点信息
            e[x][++e[x][0]] = y; // 将 y 添加到 x 的子节点列表中
        }

        int ans = 0; // 存储最大权值和

        // 遍历每个节点，计算以当前节点为根的子树的权值和
        for (int i = 1; i <= n; i++) {
            int sum = a[i]; // 初始化 sum 为当前节点的权值
            for (int j = 1; j <= e[i][0]; j++) {
                // 将当前节点的每个子节点的权值加到 sum 中
                sum += a[e[i][j]];
            }
            ans = Math.max(ans, sum); // 更新最大权值和
        }

        // 输出结果
        System.out.println(ans);
    }





    /*    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String treeNum = sc.nextLine();
        int[] moneyArr =
                Arrays.stream(sc.nextLine().split(" "))
                        .mapToInt(Integer::parseInt).toArray();
        Map<Integer, Tree> treeMap = new HashMap<>();
        while (treeMap.size() != Integer.parseInt(treeNum)) {
            String line = sc.nextLine();
            int[] treeArr = Arrays.stream(line.split(" "))
                    .mapToInt(Integer::parseInt).toArray();
            Tree root;
            Tree child;
            if (treeMap.containsKey(treeArr[0])) {
                root = treeMap.get(treeArr[0]);
            } else {
                root = new Tree(treeArr[0]);
                treeMap.put(treeArr[0],root);
                root.setMoney(moneyArr[treeArr[0]-1]);
            }

            if (treeMap.containsKey(treeArr[1])) {
                child = treeMap.get(treeArr[1]);
            } else {
                child = new Tree(treeArr[1]);
                treeMap.put(treeArr[1],child);
                child.setMoney(moneyArr[treeArr[1]-1]);
            }


            if (root.left == null) {
                root.left = child;
            } else {
                root.right = child;
            }
        }
        System.out.println(maxMoney(treeMap));
    }*/
    public static int maxMoney(Map<Integer, Tree> treeMap){
        LinkedList<Integer> list = new LinkedList<>();
        for (Map.Entry<Integer, Tree> integerTreeEntry : treeMap.entrySet()) {
            int money = integerTreeEntry.getValue().getMoney();
            int leftMoney = 0;
            int rightMoney = 0;
            if (integerTreeEntry.getValue().left != null) {
                leftMoney = integerTreeEntry.getValue().left.getMoney();
            }
            if (integerTreeEntry.getValue().right != null) {
                rightMoney = integerTreeEntry.getValue().right.getMoney();
            }
            list.add(money+leftMoney+rightMoney);
        }
        Collections.sort(list);
        return list.getLast();
    }

}
class Tree{
    int value;
    Tree left;
    Tree right;
    int money = 0;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Tree getLeft() {
        return left;
    }

    public void setLeft(Tree left) {
        this.left = left;
    }

    public Tree getRight() {
        return right;
    }

    public void setRight(Tree right) {
        this.right = right;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public Tree(int value) {
        this.value = value;
    }
}
