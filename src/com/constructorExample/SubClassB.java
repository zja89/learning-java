package com.constructorExample;

/**
 * @author:
 * @date: 2020/12/22
 */
public class SubClassB extends ParentClassB {
    public SubClassB(String name) {
        super(name);
    }

    public static void main(String[] args) {
        SubClassB b = new SubClassB("SubClassB");
    }
}
