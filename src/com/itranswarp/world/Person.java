package com.itranswarp.world;

public class Person {

	String name;
	static int number = 0;
	public int public_attr = 1;
	protected int protected_attr = 1;
	private int private_attr = 1;

	public Person(String name) {
		this.name = name;
		Person.number += 1;
	}

	public String hello() {
		return "Hello, " + this.name;
	}
}
