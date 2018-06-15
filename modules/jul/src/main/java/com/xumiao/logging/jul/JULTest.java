package com.xumiao.logging.jul;

import java.util.logging.*;

/**
 * SEVERE > WARNING > INFO > CONFIG > FINE > FINER > FINEST
 * */
public class JULTest {
    public static void main(String[] args) throws Exception {
        System.setProperty("java.util.logging.config.file","modules/jul/src/main/resources/logging-config.properties");
        System.out.println("user.dir = " + System.getProperty("user.dir"));
        Logger zhangsan = Logger.getLogger("zhangsan");

        zhangsan.fine("fine message(" + zhangsan.getLevel() + ")");
        zhangsan.info("info message(" + zhangsan.getLevel() + ")");
        zhangsan.warning("warning message(" + zhangsan.getLevel() + ")");
        zhangsan.severe("severe message(" + zhangsan.getLevel() + ")");

        Logger lisi = Logger.getLogger("lisi","message");

        lisi.fine("fine message(" + lisi.getLevel() + ")");
        lisi.info("info message(" + lisi.getLevel() + ")");
        lisi.warning("warning message(" + lisi.getLevel() + ")");
        lisi.severe("hello");
        lisi.severe("severe message(" + lisi.getLevel() + ")");

        Logger zhangsanTest = Logger.getLogger("zhangsan.test");

        zhangsanTest.fine("fine message(" + zhangsanTest.getLevel() + ")");
        zhangsanTest.info("info message(" + zhangsanTest.getLevel() + ")");
        zhangsanTest.warning("warning message(" + zhangsanTest.getLevel() + ")");
        zhangsanTest.severe("severe message(" + zhangsanTest.getLevel() + ")");

        Logger memoryLogger = Logger.getLogger("memory");
        Handler memoryHandler = new MemoryHandler(new FileHandler("memory.out.log"),5,Level.ALL);

        memoryLogger.addHandler(memoryHandler);
        memoryLogger.severe("memory message");
    }
}
