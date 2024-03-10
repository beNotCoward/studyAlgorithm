package com.lentouqin.lettcode2023;

public class Lt206 {
    public static void main(String[] args) {

    }

    public static ListNode reverseList(ListNode head) {
/*
        在遍历链表时，将当前节点的next 指针改为指向前一个节点。
        由于节点没有引用其前一个节点，因此必须事先存储其前一个节点。在更改引用之前，还需要存储后一个节点。最后返回新的头引用。
*/

        ListNode prev = null;
        ListNode curr = head;
        while (curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
}
