package com.lentouqin.od2023;

import java.util.*;

public class Hj8 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String s1 = sc.nextLine();
        List<String> list = new LinkedList<>();
        int i = Integer.parseInt(s1);
        for (int j = 0; j < i; j++) {
            String s = sc.nextLine();
            list.add(s);
        }
        Map<Integer, Integer> map = get(list);
        for (Map.Entry<Integer, Integer> integerIntegerEntry : map.entrySet()) {
            System.out.println(integerIntegerEntry.getKey()+" "+integerIntegerEntry.getValue());
        }

    }

    public static Map<Integer,Integer> get(List<String> list){
        Map<Integer,Integer> map = new TreeMap<>();

        for (String s : list) {
            String[] split = s.split(" ");
            map.put(Integer.parseInt(split[0]), map.getOrDefault(Integer.parseInt(split[0]), 0) + Integer.parseInt(split[1]));
        }
        return map;
    }
}