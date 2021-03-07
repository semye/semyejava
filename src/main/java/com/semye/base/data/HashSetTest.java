package com.semye.base.data;

import java.lang.management.ManagementFactory;
import java.util.HashSet;

/**
 * Created by semye on 2020/12/16
 * 集合
 * 内部使用hashmap实现
 */
public class HashSetTest {

    public static void main(String[] args) {
        String name = ManagementFactory.getRuntimeMXBean().getName();
        System.out.println(name);
        // get pid
        String pid = name.split("@")[0];
        System.out.println("Pid is:" + pid);
        HashSet<String> hashSet = new HashSet<>();
        for (int i = 0; i < 100; i++) {
            hashSet.add(String.valueOf(i));
        }
        System.out.println(hashSet.size());
    }
}
