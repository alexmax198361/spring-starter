package org.dmdev;

import org.dmdev.core.ConnectionPool;
import org.dmdev.entity.User;
import org.dmdev.repository.CrudRepository;
import org.dmdev.repository.UserRepository;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ApplicationRunner {

    public static void main(String[] args) {
        try(ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("application.xml")) {
            ConnectionPool connectionPoolOne = context.getBean("pool1", ConnectionPool.class);
            CrudRepository<User, Integer> bean = context.getBean("userRepository", CrudRepository.class);
            User user = bean.findById(1);
            System.out.println("Id users " + user.getId());
        }
        catch (Exception exception) {
            System.out.println("Что-то пошло не так !!!");
        }


    }
}
