package org.dmdev.config;

import org.dmdev.core.ConnectionPool;
import org.dmdev.repository.UserRepository;

import org.springframework.context.annotation.*;

@Configuration
public class ApplicationConfig {

    @Bean
    ConnectionPool pool2() {
        return new ConnectionPool("test", 20);
    }

    @Bean(name = "userRepositoryTwo")
    UserRepository userRepository(ConnectionPool pool2) {
        return new UserRepository(pool2);
    }
}
