package com.puraviaporelmundo.impactservice.service;

import com.puraviaporelmundo.impactservice.model.Ad;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Flux;

@Service
public class AdService {

    @Autowired
    private WebClient webClientImpact;

    public Flux<Ad> findAll() {
        return this.webClientImpact
                .get()
                .uri("/Ads.json")
                .retrieve()
                .bodyToFlux(Ad.class);
    }

}
