package com.xumiao.logging.log4j;

import org.apache.log4j.Logger;

public class Log4jTest {
    public static void main(String[] args) throws Exception {
//        System.setProperty("log4j.configuration", "log4j-manual.txt");
        Logger comLogger = Logger.getLogger("com");

        comLogger.debug("debug message. --- " + comLogger.getLevel());
        comLogger.info("info message. --- " + comLogger.getLevel());
        comLogger.warn("warn message. --- " + comLogger.getLevel());

        Logger zhangsanLogger = Logger.getLogger("com.zhangsan");

        zhangsanLogger.debug("debug message. --- " + zhangsanLogger.getLevel());
        zhangsanLogger.info("info message. --- " + zhangsanLogger.getLevel());
        zhangsanLogger.warn("warn message. --- " + zhangsanLogger.getLevel());

        Logger aLogger = Logger.getLogger("a");

        aLogger.debug("debug message. --- " + aLogger.getLevel());
        aLogger.info("info message. --- " + aLogger.getLevel());
        aLogger.warn("warn message. --- " + aLogger.getLevel());
    }
}
