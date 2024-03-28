package com.lentouqin.od2024;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * it is still a beautiful world
 *
 * @author by hothead
 * @date 2024/3/27.
 */
public class 模拟路径管理 {

    static class Node {
        String path;
        Map<String, Node> next;

        Node(String path, Node fa) {
            this.path = path;
            this.next = new HashMap<>();
            this.next.put("..", fa);
        }
    }

    static Node newNode(String path, Node fa) {
        return new Node(path, fa);
    }

    static boolean check1(String s) {
        return s.matches("[a-z]+");  // 检查字符串是否为小写字母
    }

    static boolean check2(String s) {
        return s.equals("..") || s.matches("[a-z]+");  // 检查字符串是否为小写字母或者".."
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Node tree = newNode("/", null);  // 创建根节点
        Node nowNode = tree;  // 当前所在节点
        StringBuilder result = new StringBuilder();  // 存储结果的字符串

        while (scanner.hasNext()) {
            String input = scanner.nextLine();  // 输入操作指令
            String[] s = input.split(" ");  // 按空格分割指令和参数

            if (s[0].equals("mkdir")) {  // 创建文件夹指令
                if (s.length != 2 || !check1(s[1]) || nowNode.next.containsKey(s[1])) {
                    result.append("\n");
                } else {
                    nowNode.next.put(s[1], newNode(nowNode.path + s[1] + "/", nowNode));  // 创建新文件夹节点
                    result.append("\n");
                }
            } else if (s[0].equals("cd")) {  // 切换目录指令
                if (s.length != 2 || !check2(s[1]) || s[1].contains("/") || !nowNode.next.containsKey(s[1]) || nowNode.next.get(s[1]) == null) {
                    result.append("\n");
                } else {
                    nowNode = nowNode.next.get(s[1]);  // 切换到目标文件夹
                    result.append("\n");
                }
            } else {
                if (s.length != 1) {
                    result.append("\n");
                } else {
                    result.append(nowNode.path).append("\n");  // 输出当前所在文件夹路径
                }
            }
        }


        String[] resArray = result.toString().split("\n");
        for (int i = resArray.length - 1; i >= 0; i--) {
            if (!resArray[i].isEmpty()) {
                System.out.println(resArray[i]);  // 输出最终结果
                break;
            }
        }
    }


}
