package org.dmdev.config;

import org.sazanovich.config.WebConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;

@Configuration
@Import(WebConfiguration.class)
@ComponentScan(basePackages = "org.dmdev")
@PropertySource("classpath:application.properties")
public class ApplicationConfig {
}
