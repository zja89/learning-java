package com.packB;
import com.packA.ParentClassA;

/**
 * @author:
 * @date: 2020/12/22
 */
public class SubClassA3 extends ParentClassA {
    public static void main(String[] args) {
        ParentClassA a1 = new ParentClassA();
        System.out.println(a1.modifierPublic);
    }
}
