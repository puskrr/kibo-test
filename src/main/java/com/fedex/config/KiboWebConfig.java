package com.fedex.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;

@Configuration
public class KiboWebConfig {

    @Value("${kibo.url}")
    private String kiboUrl;


    @Bean
    public WebClient kiboWebClient() {
        return WebClient.builder()
                .baseUrl(kiboUrl)
                .build();
    }

}
