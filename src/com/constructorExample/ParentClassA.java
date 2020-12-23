package com.constructorExample;

/**
 * @author:
 * @date: 2020/12/22
 */
public class ParentClassA {
    static int num = 0;
    public ParentClassA() {
        num ++;
        System.out.println("call ParentClassA()");
    }

    public ParentClassA(String name) {
        num ++;
        System.out.println("call ParentClassA(String name)");
    }
}
