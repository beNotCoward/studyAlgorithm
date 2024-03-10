package com.lentouqin.lettcode2023;

public class Lt19 {
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
        listNode5.next = null;
        listNode6.next = null;
        removeNthFromEnd(listNode1, 2);
        right(listNode1,2);
    }

    public static ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode emptyHead = new ListNode();
        emptyHead.next = head;
        ListNode fast = emptyHead.next; // slow =1;
        ListNode slow = emptyHead; // fast =1

        for (int i = 0; i < n; i++) {
            fast = fast.next;
        }
        // fast = 3
        while (fast != null) {
            slow = slow.next;
            fast = fast.next;
        }
        // slow = 4
        slow.next = slow.next.next;

        return emptyHead.next;

    }

    public static ListNode right(ListNode head, int n){
        ListNode dummy = new ListNode(0, head);
        ListNode first = head; // 1
        ListNode second = dummy;  // 0
        for (int i = 0; i < n; ++i) {
            first = first.next;
        }
        // first = 3
        while (first != null) {
            first = first.next;
            second = second.next;
        }
        second.next = second.next.next;
        ListNode ans = dummy.next;
        return ans;
    }
}
