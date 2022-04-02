package com.puraviaporelmundo.impactservice.service;

import com.puraviaporelmundo.impactservice.model.Bitly;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

import java.util.HashMap;
import java.util.Map;

@Service
public class BitlyService {

    @Value("${bitly.accesToken}")
    private String TOKEN;

    public Mono<Bitly> shortenUrl(String url) {
        Map<String, String> body = new HashMap<>();
        body.put("long_url",url);
        WebClient webClientBitly = WebClient.builder().baseUrl("https://api-ssl.bitly.com/v4/shorten")
                .defaultHeader("Authorization", "Bearer " + TOKEN)
                .defaultHeader(HttpHeaders.ACCEPT, MediaType.APPLICATION_JSON_VALUE)
                .build();
        return webClientBitly
                .post()
                .contentType(MediaType.APPLICATION_JSON)
                .bodyValue(body)
                .retrieve()
                .bodyToMono(Bitly.class);
    }
}
