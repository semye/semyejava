package com.semye.base.sort;

import java.util.List;

/**
 * Created by yesheng on 2021/3/23
 * 反转链表
 */
public class ListNodeTest {

//    public static void main(String[] args) {
//        ListNode listNode = createNode();
//        ListNode prev = null;
//        ListNode curr = listNode;
//        while (curr != null) {
//            ListNode next = curr.next;
//            curr.next = prev;
//            prev = curr;
//            curr = next;
//        }
//        System.out.println(prev);
//    }

    private static ListNode createNode() {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        return node1;
    }

    public static void main(String[] args) {
        ListNode node = createNode();
        ListNode prev = null;
        ListNode curr = node;
        while (curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
    }
}
