package com.itranswarp.sample;

import com.itranswarp.world.Person;
import static java.lang.System.out;

/**
 * Learn Java from https://www.liaoxuefeng.com/
 * 
 * @author liaoxuefeng
 */

//sout
//System.out.println()

public class Main {

	public static void main(String[] args) {
		Person p1 = new Person("小明");
		Person p2 = new Person("xx");
		System.out.println(p1.hello());
	}

}
