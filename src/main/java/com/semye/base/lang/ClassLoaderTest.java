package com.semye.base.lang;

/**
 * Created by yesheng on 2021/3/10
 */
public class ClassLoaderTest {

    public static void main(String[] args) {
        System.out.println(ClassLoaderTest.class.getClassLoader().toString());
        Foo foo = new Foo();
        System.out.println(foo.getClass().getClassLoader().toString());
    }
}
