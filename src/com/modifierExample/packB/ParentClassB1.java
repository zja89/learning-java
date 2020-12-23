package com.modifierExample.packB;

import com.modifierExample.packA.ParentClassA;

/**
 * @author:
 * @date: 2020/12/21
 */
public class ParentClassB1 {
    public static void main(String[] args) {
        ParentClassA a1 = new ParentClassA();
        System.out.println(a1.modifierPublic);
    }
}
