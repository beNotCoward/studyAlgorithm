package com.lentouqin.od2024;

import java.nio.file.LinkOption;
import java.util.*;

/**
 * it is still a beautiful world
 * 需记忆排序函数
 * @author by hothead
 * @date 2024/3/25.
 */
public class 内存冷热标记 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        String line1 = sc.nextLine();
        String[] s = line1.split(" ");
        int[] inputArr = Arrays.stream(s).mapToInt(Integer::parseInt).toArray();
        int limit = Integer.parseInt(sc.nextLine());
        List<Integer> memory = memory(inputArr, limit);
        if (memory.isEmpty()) {
            System.out.println(0);
        } else {
            System.out.println(memory.size());
            memory.forEach(s1 -> System.out.println(s1));
        }
    }

    public static List<Integer> memory(int[] inputArr, int limit) {
        // k: 对应的内存页 v:访问频次
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < inputArr.length; i++) {
            map.put(inputArr[i], map.getOrDefault(inputArr[i], 0) + 1);
        }
        List<Integer> result = new LinkedList<>();
        for (Map.Entry<Integer, Integer> integerIntegerEntry : map.entrySet()) {
            if (integerIntegerEntry.getValue() >= limit) {
                result.add(integerIntegerEntry.getKey());
            }
        }
        // 需多练习此函数
        Collections.sort(result, (a, b) -> {
            if (!map.get(a).equals(map.get(b))) {
                return map.get(b) - map.get(a);
            }
            return a - b; // 按编号升序
        });
        return result;
    }
}
