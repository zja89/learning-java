package com.coreClassExample;


/**
 * @author:
 * @date: 2021/3/15
 */
public class StringExample {
    public StringExample() {

    }

    public static void main(String[] args) {
        StringExample example = new StringExample();
        example.compare();
        example.convert();
        example.stringBuilderExample();
    }

    public void compare(){
        String s1 = "abc";
        String s2 = "ABC";
        String s3 = s2.toLowerCase();
        System.out.println(s1==s3);
        System.out.println(s1.equals(s3));
    }

    public void convert(){
        char[] cs = "ABC".toCharArray();
        String s = new String(cs);
        System.out.println(s);
    }

    public void stringBuilderExample(){
        StringBuilder sb = new StringBuilder(24);
        sb.append("A").append("B");
        System.out.println(sb.toString());
    }
}
