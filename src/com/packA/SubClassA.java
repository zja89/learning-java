package com.packA;

/**
 * @author:
 * @date: 2020/12/21
 */
public class SubClassA extends ParentClassA{
    public static void main(String[] args) {
        // psvm
        ParentClassA a = new ParentClassA();
        ParentClassA b = new ParentClassA();
        System.out.println(a.modifierPublic);
        System.out.println(a.modifierProtected);
        System.out.println(a.modifierDefault);
    }

}
