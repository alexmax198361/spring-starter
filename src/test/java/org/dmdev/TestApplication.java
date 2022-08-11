package org.dmdev;

import org.dmdev.core.ConnectionPool;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.boot.test.mock.mockito.SpyBean;

@TestConfiguration
public class TestApplication {

    @SpyBean(name = "pool1")
    private ConnectionPool pool1;

}
