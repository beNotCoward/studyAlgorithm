package com.lentouqin.lettcode2023;

public class Lt203 {
    public static void main(String[] args) {
        ListNode listNode1= new ListNode(1);
        ListNode listNode2= new ListNode(2);
        ListNode listNode3= new ListNode(3);
        ListNode listNode4= new ListNode(4);
        ListNode listNode5= new ListNode(5);
        ListNode listNode7= new ListNode(6);
        ListNode listNode6= new ListNode(6);
        listNode1.next=listNode2;
        listNode2.next=listNode6;
        listNode6.next=listNode3;
        listNode3.next=listNode4;
        listNode4.next=listNode5;
        listNode5.next=listNode7;
        listNode7.next=null;
        removeElements(listNode1, 6);
    }

    public static ListNode removeElements(ListNode head, int val) {
        ListNode result = new ListNode();
        result.next = head;
        ListNode temp = result;
        while (temp != null) {
            ListNode next = temp.next;
            while (next != null && next.val == val) {
                next = next.next;
                temp.next = next;
            }
            if(temp.next == null){
                break;
            }
            temp = temp.next;
        }
        return result.next;
    }


}
