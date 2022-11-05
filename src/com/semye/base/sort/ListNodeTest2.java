package com.semye.base.sort;

import java.util.List;

/**
 * Created by yesheng on 2021/3/23
 * 反转链表
 */
public class ListNodeTest2 {

    public static void main(String[] args) {
        ListNode node = createListNode();
        ListNode prev = null;
        ListNode curr = node;
        while (curr != null) {
            ListNode next = curr.next;//
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        System.out.println(prev);
    }

    public static ListNode createListNode() {
        ListNode no1 = new ListNode(1);
        ListNode no2 = new ListNode(2);
        ListNode no3 = new ListNode(3);
        ListNode no4 = new ListNode(4);
        ListNode no5 = new ListNode(5);
        ListNode no6 = new ListNode(6);
        no1.next = no2;
        no2.next = no3;
        no3.next = no4;
        no4.next = no5;
        no5.next = no6;
        return no1;
    }
}
