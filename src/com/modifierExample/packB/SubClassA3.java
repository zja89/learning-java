package com.modifierExample.packB;


/**
 * @author:
 * @date: 2020/12/22
 */
public class SubClassA3 extends ParentClassA {
    public static void main(String[] args) {
        com.modifierExample.packA.ParentClassA a = new com.modifierExample.packA.ParentClassA();
        System.out.println(a.modifierPublic);

        ParentClassA b = new ParentClassA();

    }
}
