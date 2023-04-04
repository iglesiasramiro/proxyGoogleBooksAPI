package com.proxy.google.book.api.config;


import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.ExchangeFilterFunction;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@Slf4j
@Configuration
public class RestTemplateConfig {


    @Bean
    @Primary
    public RestTemplate restTemplate(@Value("${config.resttemplate.timeout:30000}") int timeout, RestTemplateBuilder builder){
        return builder
                .setConnectTimeout(timeout)
                .setReadTimeout(timeout)
                .build();
    }


}
