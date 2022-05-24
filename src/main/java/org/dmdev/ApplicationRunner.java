package org.dmdev;

import org.dmdev.config.ApplicationConfig;
import org.dmdev.core.ConnectionPool;
import org.dmdev.dto.UserDto;

import org.dmdev.service.UserService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Optional;
@SpringBootApplication
public class ApplicationRunner {

    public static void main(String[] args) {
        SpringApplication.run(ApplicationRunner.class, args);
    }
}
