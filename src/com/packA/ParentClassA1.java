package com.packA;

/**
 * @author:
 * @date: 2020/12/21
 */
public class ParentClassA1 {

    public int modifierPublic = 1;    // The code is accessible for all classes
    protected int modifierProtected = 1;    // The code is accessible in the same package and subclasses.
    int modifierDefault = 1;    // The code is only accessible in the same package
    private int modifierPrivate = 1;    // The code is only accessible within the declared class
    public ParentClassA1() {
        // Alt+Insert
    }
}
