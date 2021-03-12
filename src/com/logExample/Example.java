package com.logExample;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import sun.applet.Main;

/**
 * @author:
 * @date: 2020/12/23
 */
public class Example {
    static final Log log = LogFactory.getLog(Main.class);
    public static void main(String[] args) {
        System.out.println(Main.class);
        log.info("start ...");

    }
}

