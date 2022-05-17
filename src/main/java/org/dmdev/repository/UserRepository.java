package org.dmdev.repository;

import org.dmdev.bpp.Transactional;
import org.dmdev.core.ConnectionPool;
import org.dmdev.entity.User;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.PostConstruct;
import java.util.List;
import java.util.Optional;

@Transactional
public class UserRepository implements CrudRepository<User, Integer> {

    @Autowired
    private List<ConnectionPool> pool;

    @Override
    public User findById(Integer id) {
        System.out.println("findById User....");
        User user = new User();
        user.setId(12);
        return Optional.of(user).orElse(null);
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
