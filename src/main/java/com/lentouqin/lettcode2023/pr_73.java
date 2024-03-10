package com.lentouqin.lettcode2023;

import java.util.*;

public class pr_73 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (map.containsKey(c)) map.put(c, map.get(c) + 1);
            else map.put(c, 1);
        }
        ArrayList<Map.Entry<Character, Integer>> list = new ArrayList<>();
        list.addAll(map.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<Character, Integer>>() {
            @Override
            public int compare(Map.Entry<Character, Integer> o1, Map.Entry<Character, Integer> o2) {
                if (o1.getValue() == o2.getValue()) {
                    if (Character.isLowerCase(o1.getKey()) && Character.isUpperCase(o2.getKey())) {
                        return o1.getKey() - o2.getKey();
                    }else {
                        return o2.getKey() - o1.getKey();
                    }
                } else {
                    return o2.getValue() - o1.getValue();
                }
            }
        });
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            sb.append(list.get(i).getKey()).append(":").append(list.get(i).getValue()).append(";");
        }
        String res = sb.toString();
        System.out.print(res.substring(0, res.length() - 1));
    }
}