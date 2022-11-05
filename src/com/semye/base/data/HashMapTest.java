package com.semye.base.data;

import java.util.HashMap;

/**
 * Created by yesheng on 2020/12/6
 * HashMap
 * 数组+链表实现
 * 1.8以后使用数组+链表+红黑树
 */
public class HashMapTest {

    public static void main(String[] args) {
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("key1", "hello");
        hashMap.put("key2", "hello2");

        System.out.println(hashMap.get("key1"));
    }
}
