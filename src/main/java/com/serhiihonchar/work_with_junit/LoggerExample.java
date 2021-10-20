package com.serhiihonchar.work_with_junit;

import java.util.logging.Logger;

public class LoggerExample {
    private static final Logger LOGGER =
            Logger.getLogger(LoggerExample.class.getName());

    public static void main(String[] args) {
        LOGGER.info("System starts!");
    }
}
