package com.semye.base.lang.thread;

/**
 * Created by yesheng on 2021/3/9
 */
public class ThreadLocalTest {

    private static final ThreadLocal<String> threadLocal = new ThreadLocal<>();

    public static void main(String[] args) {
        threadLocal.set("hello");
        System.out.println(threadLocal.get());
        threadLocal.set("world");
        System.out.println(threadLocal.get());
        doex();
        threadLocal.remove();
    }

    private static void doex() {
    }
}
