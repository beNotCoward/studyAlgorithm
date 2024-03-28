package com.lentouqin.od2024;


import java.util.HashMap;
import java.util.LinkedList;
import java.util.Scanner;

/**
 * it is still a beautiful world
 *
 * @author by hothead
 * @date 2024/3/22.
 */
public class 密码解密 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        LinkedList<String> inputQueue = new LinkedList<>();
        StringBuilder result = new StringBuilder();
        for (char c : input.toCharArray()) {
            if (c == '*') {
                while (inputQueue.size() > 2) {
                    String remove = inputQueue.remove();
                    result.append(mapping.get(remove));
                }
                inputQueue.add(String.valueOf(c));
                result.append(change(inputQueue));
            } else {
                inputQueue.add(String.valueOf(c));
            }
        }
        System.out.println(result.toString());

    }

    private static HashMap<String, String> mapping = new HashMap<String, String>() {
        {
            for (int i = 1, j = 0; i < 10; i++, j++) {
                put(String.valueOf(i), String.valueOf((char) ('a' + j)));
            }
            for (int i = 10, j = 0; i < 27; i++, j++) {
                put(i + "*", String.valueOf((char) ('j' + j)));
            }
        }
    };
    public static String change(LinkedList<String> inputQueue) {
        StringBuilder temp = new StringBuilder();
        while (!inputQueue.isEmpty()){
            temp.append(inputQueue.remove());
        }
        return mapping.get(temp.toString());
    }
}
