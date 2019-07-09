package com.youxuepai.configserverbus;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @author super
 */
@SpringBootApplication
@EnableConfigServer
public class ConfigServerBusApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConfigServerBusApplication.class, args);
    }

}
