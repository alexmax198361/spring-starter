package org.dmdev.core;

import java.util.List;
import java.util.Map;

public class ConnectionPool {

    private final String databaseName;
    private final Integer poolSize;
    private final List<String> args;
    private Map<String, Object> properties;

    public ConnectionPool(String databaseName, Integer poolSize, List<String> args, Map<String, Object> properties) {
        this.databaseName = databaseName;
        this.poolSize = poolSize;
        this.args = args;
        System.out.println("created object connectionPool");
    }

    public void setProperties(Map<String, Object> properties) {
        this.properties = properties;
        System.out.println("added properties with helped set method");
    }

    private void init() {
        System.out.println("init method from xml file");
    }

    private void destroy() {
        System.out.println("destroy method from xml file");
    }
}
