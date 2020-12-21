package com.packA;

/**
 * @author:
 * @date: 2020/12/21
 */
public class ParentClassA2 {
    public ParentClassA2() {
    }

    public static void main(String[] args) {
        ParentClassA1 a1 = new ParentClassA1();
        System.out.println(a1.modifierDefault);
        System.out.println(a1.modifierProtected);
        System.out.println(a1.modifierPublic);

    }
}
