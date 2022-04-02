package com.puraviaporelmundo.impactservice.controller;

import com.puraviaporelmundo.impactservice.model.Campaign;
import com.puraviaporelmundo.impactservice.service.CampaignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/campaigns")
public class CampaignController {

    @Autowired
    private CampaignService campaignService;

    @GetMapping
    public Flux<Campaign> findAll() {
        return campaignService.findAll();
    }

    @GetMapping("/{campaignId}")
    public Mono<Campaign> finById(@PathVariable String campaignId) {
        return campaignService.finById(campaignId);
    }
}
