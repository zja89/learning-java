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
        ParentClassA.staticFunc();
        this.commonFunc();
    }

    public ParentClassA(String name) {
        num ++;
        System.out.println("call ParentClassA(String name)");
        ParentClassA.staticFunc();
        this.commonFunc();
    }

    public void commonFunc(){
        System.out.println("call commonFunc()");
    }
    public static void staticFunc(){
        System.out.println("call staticFunc()");
    }
}
