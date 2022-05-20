package org.dmdev;

import org.dmdev.config.ApplicationConfig;
import org.dmdev.core.ConnectionPool;
import org.dmdev.entity.User;
import org.dmdev.repository.CrudRepository;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ApplicationRunner {

    public static void main(String[] args) {
        try (AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class)) {
            ConnectionPool connectionPoolOne = context.getBean(ConnectionPool.class);
            CrudRepository<User, Integer> bean = context.getBean("userRepository", CrudRepository.class);
            System.out.println(bean.getBeanName());
            User user = bean.findById(1);
            System.out.println("Id users " + user.getId());

        } catch (Exception exception) {
            exception.printStackTrace();
            System.out.println("Что-то пошло не так !!!");
        }


    }
}
