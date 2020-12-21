package com.itranswarp.world;

public class Person {

    String name;
    static int number = 0;


    public int modifierPublic = 1;    // The code is accessible for all classes
    protected int modifierProtected = 1;    // The code is accessible in the same package and subclasses.
    int modifierDefault = 1;    // The code is only accessible in the same package
    private int modifierPrivate = 1;    // The code is only accessible within the declared class


    public Person(String name) {
        this.name = name;
        Person.number += 1;
    }

    public String hello() {
        return "Hello, " + this.name;
    }
}
