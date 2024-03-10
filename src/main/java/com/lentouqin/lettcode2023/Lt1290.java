package com.lentouqin.lettcode2023;

public class Lt1290 {
    public static void main(String[] args) {

    }

    public static int getDecimalValue(ListNode head) {
        StringBuilder sb = new StringBuilder();
        while (head != null) {
            sb.append(head.val);
            head = head.next;
        }
        return Integer.parseInt(sb.toString(),2);
    }
}
