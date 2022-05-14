package org.dmdev.core;

import java.util.List;
import java.util.Map;

public class ConnectionPool {

    private final String databaseName;
    private final Integer poolSize;
    private final List<String> args;
    private final Map<String, Object> properties;


    public ConnectionPool(String databaseName, Integer poolSize, List<String> args, Map<String, Object> properties) {
        this.databaseName = databaseName;
        this.poolSize = poolSize;
        this.args = args;
        this.properties = properties;
    }

}
