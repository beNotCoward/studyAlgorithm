package com.lentouqin.od2023;

import java.util.*;

public class Hj21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        System.out.println(simplePassWord(input));
    }

    public static String simplePassWord(String input){
        Map<Integer,String> map = new HashMap<>();
        map.put(1,"1");
        map.put(2,"abc");
        map.put(3,"def");
        map.put(4,"ghi");
        map.put(5,"jkl");
        map.put(6,"mno");
        map.put(7,"pqrs");
        map.put(8,"tuv");
        map.put(9,"wxyz");
        map.put(0,"0");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            char temp = input.charAt(i);
            if(Character.isDigit(temp)){
                sb.append(temp);
                continue;
            }
            if(Character.isUpperCase(temp)){
                temp ^= 32;
                if (temp == 'z') {
                    temp = 'a';
                } else {
                    temp += 1;
                }
                sb.append(temp);
                continue;
            }
            if (Character.isLowerCase(temp)) {
                for (Map.Entry<Integer, String> integerStringEntry : map.entrySet()) {
                    String value = integerStringEntry.getValue();
                    if (value.contains(temp + "")) {
                        sb.append(integerStringEntry.getKey());
                        break;
                    }
                }
                continue;
            }

        }
        return sb.toString();
    }
}
