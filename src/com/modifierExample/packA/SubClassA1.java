package com.modifierExample.packA;

/**
 * @author:
 * @date: 2020/12/21
 */
public class SubClassA1 extends ParentClassA {
    public void printNum(){

    }

    public static void main(String[] args) {
        // psvm
        ParentClassA a = new ParentClassA();
        System.out.println(a.modifierPublic);
        System.out.println(a.modifierProtected);
        System.out.println(a.modifierDefault);
    }

}
