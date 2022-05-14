package org.dmdev;

import org.dmdev.core.ConnectionPool;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ApplicationRunner {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("application.xml");
        ConnectionPool connectionPoolOne = context.getBean("pool1", ConnectionPool.class);
        String applicationName = context.getBean("applicationName", String.class);
        System.out.println(connectionPoolOne);

    }
}
