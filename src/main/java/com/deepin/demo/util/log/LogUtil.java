package com.deepin.demo.util.log;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LogUtil {

    private static final Logger logger = LoggerFactory.getLogger("");

    public static void error(String log){
        logger.error(log);
    }
    public static void warn(String log){
        logger.warn(log);
    }

    public static void info(String log){
        logger.info(log);
    }

    public static void debug(String log){
        logger.debug(log);
    }
}
