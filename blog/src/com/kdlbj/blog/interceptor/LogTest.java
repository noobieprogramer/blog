package com.kdlbj.blog.interceptor;

import org.apache.log4j.Logger;
import sun.rmi.runtime.Log;

/**
 * Created by kdlbj__ on 15/7/24.
 */
public class LogTest {

    private static  Logger logger = Logger.getLogger(LogTest.class);

    public static void main(String[] args) {
        logger.debug("this is debug message");

        logger.info("this is info message");

        logger.error("this is error message");
    }
}
