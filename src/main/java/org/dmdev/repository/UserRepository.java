package org.dmdev.repository;

import org.dmdev.bpp.InjectBean;
import org.dmdev.core.ConnectionPool;


public class UserRepository {

    @InjectBean
    private ConnectionPool connectionPool;

}
