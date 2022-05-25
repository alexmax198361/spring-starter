package org.dmdev.core;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component(value = "pool1")
@RequiredArgsConstructor
public class ConnectionPool {

    @Value("${db.name}")
    private final String databaseName;
    @Value("${db.poolSize}")
    private final Integer poolSize;

    @PostConstruct
    private void init() {
        System.out.println("init method from xml file");
    }

    @PreDestroy
    private void destroy() {
        System.out.println("destroy method from xml file");
    }
}
