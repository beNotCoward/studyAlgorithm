package com.lentouqin.od2024;

import java.util.*;

/**
 * it is still a beautiful world
 *
 * @author by hothead
 * @date 2024/3/25.
 */
public class Api集群负载统计 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        List<String> inputList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            inputList.add(sc.nextLine());
        }
        String line = sc.nextLine();
        String[] s = line.split(" ");
        int num = Integer.parseInt(s[0]);
        System.out.println(countKeyWord(inputList, num, s[1]));
    }

    public static long countKeyWord(List<String> inputList, int num, String str) {
        Map<Integer, List<String>> tempMap = new HashMap<>();
        for (int i = 0; i < inputList.size(); i++) {
            String tempStr = inputList.get(i);
            String[] split = tempStr.split("/");
            for (int j = 1; j < split.length; j++) {
                if (tempMap.containsKey(j)) {
                    List<String> strings = tempMap.get(j);
                    strings.add(split[j]);
                    tempMap.put(j, strings);
                } else {
                    List<String> strings = new ArrayList<>();
                    strings.add(split[j]);
                    tempMap.put(j, strings);
                }
            }
        }

        List<String> list = tempMap.get(num);
        if (list.isEmpty()) {
            return 0;
        }
        return list.stream().filter(s -> s.equals(str)).count();

    }
}
