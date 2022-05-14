package org.dmdev.repository;

import org.dmdev.core.ConnectionPool;

public class UserRepository {

    private ConnectionPool connectionPool;

    public UserRepository(ConnectionPool connectionPool) {
        this.connectionPool = connectionPool;
    }
}
