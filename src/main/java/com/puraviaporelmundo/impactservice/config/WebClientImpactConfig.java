package com.puraviaporelmundo.impactservice.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.client.ExchangeFilterFunctions;
import org.springframework.web.reactive.function.client.WebClient;

@Configuration
public class WebClientImpactConfig {

    Logger logger = LoggerFactory.getLogger(WebClientImpactConfig.class);

    @Value("${impact.sid}")
    private String SID ;
    @Value("${impact.token}")
    private String TOKEN;

    @Bean
    public WebClient getWebClientImpact(WebClient.Builder webClientBuilder) {
        return webClientBuilder.baseUrl("https://api.impact.com/Mediapartners/"+SID)
                .filter(ExchangeFilterFunctions.basicAuthentication(SID, TOKEN))
                .defaultHeader(HttpHeaders.ACCEPT, MediaType.APPLICATION_JSON_VALUE)
                .build();
    }

}
