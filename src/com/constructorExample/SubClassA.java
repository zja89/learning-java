package com.constructorExample;

/**
 * @author:
 * @date: 2020/12/22
 */
public class SubClassA extends ParentClassA{
    public SubClassA() {    // 默认调用super()
        System.out.println("call SubClassA1()");
    }

    public SubClassA(String name) { // 默认调用super()
        super(name);
        System.out.println("call SubClassA1(String name)");
    }

    public static void main(String[] args) {
        SubClassA a = new SubClassA();
        SubClassA b = new SubClassA("SubClassA1");
    }
}
