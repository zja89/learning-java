package com.exceptionExample;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/**
 * @author:
 * @date: 2021/3/26
 */
public class Example {
    public static void main(String[] args) {
        byte[] bs = example2("中文");
        System.out.println(Arrays.toString(bs));
    }
    static byte[] example1(String s) throws UnsupportedEncodingException {
        // 鼠标放在红线上 Alt+Enter throws UnsupportedEncodingException
        return s.getBytes("GBK");
    }

    static byte[] example2(String s) {
        // 鼠标放在红线上 Alt+Enter throws UnsupportedEncodingException
        try {
            return s.getBytes("GBK");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
            return null;
        }
    }
}
