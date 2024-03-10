package com.lentouqin.lettcode2023;

public class Lt876 {
    public static void main(String[] args) {
        ListNode listNode1 = new ListNode(1);
        ListNode listNode2 = new ListNode(2);
        ListNode listNode3 = new ListNode(3);
        ListNode listNode4 = new ListNode(4);
        ListNode listNode5 = new ListNode(5);
        ListNode listNode6 = new ListNode(6);
        listNode1.next = listNode2;
        listNode2.next = listNode3;
        listNode3.next = listNode4;
        listNode4.next = listNode5;
        listNode5.next = listNode6;
        listNode6.next = null;
        middleNode(listNode1);

    }
    public static ListNode middleNode(ListNode head) {
        ListNode emptyhead = new ListNode();
        emptyhead.next = head;
        ListNode slow = emptyhead.next;
        ListNode fast = emptyhead.next;
        while (fast != null && fast.next !=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;

    }
}
