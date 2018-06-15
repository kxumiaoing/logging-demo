package com.xumiao.logging.jul.format;

import java.util.logging.Formatter;
import java.util.logging.LogRecord;

public class MyLogFormatter extends Formatter {
    @Override
    public String format(LogRecord record) {
        return record.getLevel() + ":" + record.getSourceClassName() + '.' + record.getSourceMethodName() + ':' + record.getMessage() + "\n";
    }
}
