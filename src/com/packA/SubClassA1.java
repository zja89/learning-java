package com.packA;

/**
 * @author:
 * @date: 2020/12/21
 */
public class SubClassA1 extends ParentClassA1{
    public SubClassA1() {
        super();
    }

    public static void main(String[] args) {
        // psvm
        ParentClassA1 a1 = new ParentClassA1();
        System.out.println(a1.modifierPublic);
        System.out.println(a1.modifierProtected);
        System.out.println(a1.modifierDefault);
    }

}
