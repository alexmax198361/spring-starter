package org.dmdev;

import org.dmdev.config.ApplicationConfig;
import org.dmdev.core.ConnectionPool;
import org.dmdev.dto.UserDto;

import org.dmdev.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Optional;

public class ApplicationRunner {

    public static void main(String[] args) {
        try (AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class)) {
            ConnectionPool connectionPoolOne = context.getBean("pool1", ConnectionPool.class);
            UserService bean = context.getBean(UserService.class);

            Optional<UserDto> user = bean.findById(1);
            System.out.println("end");

        } catch (Exception exception) {
            exception.printStackTrace();
            System.out.println("Что-то пошло не так !!!");
        }


    }
}
