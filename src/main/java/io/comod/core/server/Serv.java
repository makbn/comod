package io.comod.core.server;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.rest.RepositoryRestMvcAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.statemachine.config.EnableStateMachine;

/**
 * Mehdi Akbarian-Rastaghi 5/7/19
 */

@SpringBootApplication(
        exclude = {RepositoryRestMvcAutoConfiguration.class,
                HibernateJpaAutoConfiguration.class},
        scanBasePackages = {"io.comod.core.server",
                "io.comod.core.common"})
@EnableStateMachine
public class Serv {

    public static void main(String[] args) {
        SpringApplication application = new SpringApplication();
        application.setLogStartupInfo(false);
        application.run(Serv.class, args);
    }
}
