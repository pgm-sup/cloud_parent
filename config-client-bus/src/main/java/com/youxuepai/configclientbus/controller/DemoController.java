package com.youxuepai.configclientbus.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

/**
 * @author super
 */
@RestController
@RefreshScope
public class DemoController {

    @Value("${spring.datasource.username}")
    private String dataSourceName;

    @GetMapping("/dataSourceName")
    public Mono<String> hello(){
        return Mono.justOrEmpty(dataSourceName);
    }
}
