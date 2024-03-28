package com.lentouqin.od2024;

import java.util.*;

/**
 * it is still a beautiful world
 *
 * @author by hothead
 * @date 2024/3/23.
 */
public class 连续字母长度 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int k = Integer.parseInt(sc.nextLine());
        test1(input, k);
    }

    public static void test1(String s, int k) {
        Integer[] cnts = new Integer[26];
        Arrays.fill(cnts, 0);
        int n = s.length();
        for (int i = 0; i < n; i++) {
            int j = i;
            while (j < n && s.charAt(j) == s.charAt(i)) {
                j++;
            }
            int c = s.charAt(i) - 'A';
            cnts[c] = Math.max(cnts[c], j - i);
            i = j - 1;
        }
        Arrays.sort(cnts, Collections.reverseOrder());
        if (k > 26 || cnts[k - 1] == 0) {
            System.out.println("-1");
        } else {
            System.out.println(cnts[k - 1]);
        }
    }

    public static int getMaxLength(String input, int k) {
        // k:字母 v:长度
        Map<Character, List<List<Character>>> map = new HashMap<>();
        int index = 0;
        while (index < input.length()) {
            char c = input.charAt(index);
            if (map.containsKey(c)) {
                List<Character> temp = new ArrayList<>();
                while (index < input.length() && c == input.charAt(index)) {
                    temp.add(input.charAt(index));
                    index++;
                }
                List<List<Character>> lists = map.get(c);
                lists.add(temp);
                map.put(c, lists);
            } else {
                List<Character> temp = new ArrayList<>();
                while (index < input.length() && c == input.charAt(index) ) {
                    temp.add(input.charAt(index));
                    index++;
                }
                List<List<Character>> lists = new ArrayList<>();
                lists.add(temp);
                map.put(c, lists);
            }
        }
        Map<Character, Integer> result = new HashMap<>();
        for (Map.Entry<Character, List<List<Character>>> characterListEntry : map.entrySet()) {
            List<List<Character>> value = characterListEntry.getValue();
            int max = 0;
            for (List<Character> characters : value) {
                max = Math.max(max, characters.size());
            }
            result.put(characterListEntry.getKey(), max);
        }
        List<Map.Entry<Character, Integer>> list= new ArrayList<>();
        list.addAll(result.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<Character, Integer>>() {
            @Override
            public int compare(Map.Entry<Character, Integer> o1, Map.Entry<Character, Integer> o2) {
                if (o1.getValue() > o2.getValue()) {
                    return -1;
                }
                return 0;
            }
        });
        if (k > list.size()) {
            return -1;
        }

        return   list.get(k-1).getValue();
    }
}
