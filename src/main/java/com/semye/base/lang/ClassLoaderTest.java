package com.semye.base.lang;

import java.net.URL;

/**
 * Created by yesheng on 2021/3/10
 */
public class ClassLoaderTest {

    public static void main(String[] args) {

        URL[] urLs = sun.misc.Launcher.getBootstrapClassPath().getURLs();
        for (URL url : urLs) {
            System.out.println(url.toExternalForm());
        }

        // java提供的类的classloader
        ClassLoader classLoader = String.class.getClassLoader();
        System.out.println(classLoader);

        // extclassloader
        String extDirs = System.getProperty("java.ext.dirs");
        for (String path : extDirs.split(":")) {
            System.out.println(path);
        }

        Foo foo = new Foo();
        // AppClassLoader
        System.out.println(foo.getClass().getClassLoader().toString());
        // ExtClassLoader
        System.out.println(foo.getClass().getClassLoader().getParent().toString());
    }
}
