package org.dmdev.config;

import org.dmdev.config.condition.JpaConditional;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;

@Configuration
@Conditional(JpaConditional.class)
@ConditionalOnBean()
public class JpaConfiguration {

    @PostConstruct
    public void init() {
        System.out.println("Jpa configuration is enabled");
    }
}
