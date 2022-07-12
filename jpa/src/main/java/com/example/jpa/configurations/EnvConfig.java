package com.example.jpa.configurations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class EnvConfig {

    @Autowired
    private ApplicationContext applicationContext;

    @Bean
    public void getEnv(){
        for (String key : System.getenv().keySet()) {
            System.out.println(String.format("%1s----------------%2s", key,System.getenv().get(key)));
        }
    }
}
