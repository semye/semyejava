package com.semye.base.data;

import java.util.ArrayDeque;

/**
 * ArrayDeque使用
 * 双向队列
 */
public class ArrayDequeTest {
    public static void main(String[] args) {

        ArrayDeque<String> arrayDeque = new ArrayDeque<>();
        arrayDeque.add("1");
        arrayDeque.add("2");
        arrayDeque.add("3");
        arrayDeque.add("4");
        arrayDeque.addFirst("yesheng");
        arrayDeque.addLast("ye");
        arrayDeque.offer("1");
        arrayDeque.offer("99");
        System.out.println(arrayDeque);
        String el=arrayDeque.peek();
        System.out.println(el);
        System.out.println(arrayDeque);
        arrayDeque.pop();
        System.out.println(arrayDeque);

    }
}
