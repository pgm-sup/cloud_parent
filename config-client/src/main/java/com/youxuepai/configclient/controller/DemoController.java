package com.youxuepai.configclient.controller;

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

    @Value("${application.name}")
    private String appName;

    @GetMapping("/appName")
    public Mono<String> hello(){
        return Mono.justOrEmpty(appName);
    }

}
