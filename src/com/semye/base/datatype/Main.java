package com.semye.base.datatype;

/**
 * 1.基本数据类型
 * 2.封装数据类型
 */
public class Main {

    public static void main(String[] args) {
        //8大基本数据类型  int 基本数据类型 Integer 封装数据类型
        System.out.println("byte 取值范围:" + Byte.MIN_VALUE + "-" + Byte.MAX_VALUE);
        System.out.println("short 取值范围:" + Short.MIN_VALUE + "-" + Short.MAX_VALUE);
        System.out.println("int 取值范围:" + Integer.MIN_VALUE + "-" + Integer.MAX_VALUE);
        System.out.println("long 取值范围:" + Long.MIN_VALUE + "-" + Long.MAX_VALUE);
        System.out.println("float 取值范围:" + Float.MIN_VALUE + "-" + Float.MAX_VALUE);
        System.out.println("double 取值范围:" + Double.MIN_VALUE + "-" + Double.MAX_VALUE);
        System.out.println("boolean 取值范围:" + Boolean.TRUE + "-" + Boolean.FALSE);
        System.out.println("char 取值范围:" + Character.MIN_VALUE + "-" + Character.MAX_VALUE);
    }
}
