package org.dmdev.core;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component("pool1")
public class ConnectionPool {

    private final String databaseName;
    private final Integer poolSize;

    public ConnectionPool(@Value("${db.name}") String databaseName,
                          @Value("${db.poolSize}") Integer poolSize) {
        this.databaseName = databaseName;
        this.poolSize = poolSize;

    }

    @PostConstruct
    private void init() {
        System.out.println("init method from xml file");
    }

    @PreDestroy
    private void destroy() {
        System.out.println("destroy method from xml file");
    }
}
