package com.semye.base.lang;

/**
 * Created by yesheng on 2021/3/16
 * string 每次赋值都是一个新的对象
 */
public class StringTest {

    public static void main(String[] args) {
        String abc = "abc";
        System.out.println(abc.getClass().getName() + "@" + Integer.toHexString(abc.hashCode()));
        abc = "def";
        System.out.println(abc.getClass().getName() + "@" + Integer.toHexString(abc.hashCode()));
    }
}
