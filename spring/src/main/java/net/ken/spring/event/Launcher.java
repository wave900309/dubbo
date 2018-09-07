package net.ken.spring.event;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by Yang, Haiqiang on 2018/05/16.
 */
@SpringBootApplication
@ComponentScan("net.ken.spring")
public class Launcher {

    public static void main(String[] args) {
        SpringApplication.run(Launcher.class);
    }
}
