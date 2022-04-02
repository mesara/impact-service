package com.puraviaporelmundo.impactservice.service;

import com.puraviaporelmundo.impactservice.model.Campaign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class CampaignService {

    @Autowired
    private WebClient webClientImpact;

    public Flux<Campaign> findAll() {
        return this.webClientImpact
                .get()
                .uri("/Campaigns.json")
                .retrieve()
                .bodyToFlux(Campaign.class);
    }

    public Mono<Campaign> finById(String campaignId) {
        return this.webClientImpact
                .get()
                .uri("/Campaigns/"+campaignId+".json")
                .retrieve()
                .bodyToMono(Campaign.class);
    }
}
