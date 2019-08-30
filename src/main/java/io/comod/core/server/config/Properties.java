package io.comod.core.server.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

/**
 * Mehdi Akbarian-Rastaghi 5/7/19
 */

@Configuration
@ComponentScan("io.comod")
@PropertySource(
        value = {"file:comod.env", "file:${config.location}", "classpath:/comod.env"}
        , ignoreResourceNotFound = true)
public class Properties {

    @Bean
    public static PropertySourcesPlaceholderConfigurer propertyConfigurer() {
        return new PropertySourcesPlaceholderConfigurer();
    }

}
