package com.abstractExample;

/**
 * @author:
 * @date: 2020/12/23
 */
public class SubClassA extends ParentClassA implements InterfaceA,InterfaceB{
    @Override
    public void abstractFunc() {
        System.out.println("abstractFunc ...");
    }

    @Override
    public void interfaceAMethod() {
        System.out.println("implement interfaceAMethod");
    }

    @Override
    public void interfaceBMethod() {
        System.out.println("implement interfaceBMethod");
    }

    public static void main(String[] args) {
        ParentClassA a = new SubClassA();

        a.abstractFunc();
        a.func();
        // a.interfaceAMethod();
        SubClassA b = new SubClassA();
        b.interfaceAMethod();
    }
}
