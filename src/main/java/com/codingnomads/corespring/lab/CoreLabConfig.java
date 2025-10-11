package com.codingnomads.corespring.lab;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CoreLabConfig {

    @Bean
    public CoreBean coreBean() {
        return new CoreBean();
    }

}
