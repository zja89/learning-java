package com.constructorExample;

/**
 * @author:
 * @date: 2020/12/22
 */
public class SubClassA extends ParentClassA{
    static int num = -1;
    public SubClassA() {    // 默认调用super()
        System.out.println("call SubClassA1()");
        System.out.println(String.format("ParentClassA num:%d",ParentClassA.num));
        System.out.println(String.format("SubClassA    num:%d",SubClassA.num));
        System.out.println("\n");
    }

    public SubClassA(String name) { // 默认调用super()
        super(name);
        System.out.println("call SubClassA1(String name)");
        System.out.println(String.format("ParentClassA num:%d",ParentClassA.num));
        System.out.println(String.format("SubClassA    num:%d",SubClassA.num));
        System.out.println("\n");
    }

    public static void main(String[] args) {
        SubClassA a = new SubClassA();
        SubClassA b = new SubClassA("SubClassA1");
    }
}
