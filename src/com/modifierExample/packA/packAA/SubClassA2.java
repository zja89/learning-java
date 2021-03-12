package com.modifierExample.packA.packAA;

import com.modifierExample.packA.ParentClassA;


/**
 * @author:
 * @date: 2020/12/22
 */
public class SubClassA2 extends ParentClassA {
    public static void main(String[] args) {
        ParentClassA a1 = new ParentClassA();
        System.out.println(a1.modifierPublic);
    }
}
