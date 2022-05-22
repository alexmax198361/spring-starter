package org.dmdev.repository;

import org.dmdev.bpp.Transactional;
import org.dmdev.core.ConnectionPool;
import org.dmdev.entity.User;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.List;
import java.util.Optional;

@Transactional
@Component
public class UserRepository implements CrudRepository<User, Integer> {


    private String beanName;

    public UserRepository(@Value("${bean.userRepository.name}") String beanName, List<ConnectionPool> pool, ConnectionPool pool1) {
        this.beanName = beanName;
        this.pool = pool;
        this.pool1 = pool1;
    }

    public UserRepository(ConnectionPool pool1) {
        this.pool1 = pool1;
    }

    public UserRepository() {
    }

    @Override
    public String getBeanName() {
        return beanName;
    }

    private List<ConnectionPool> pool;

    private ConnectionPool pool1;

    @Override
    public Optional<User> findById(Integer id) {
        System.out.println("findById User....");
        User user = new User();
        user.setId(12);
        return Optional.of(user);
    }

    @Override
    public void delete(Integer id) {
        System.out.println("delete user....");
    }

    @PostConstruct
    public void init() {
        System.out.println("postConstruct method ...");
    }
}
