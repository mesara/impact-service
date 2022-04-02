package com.puraviaporelmundo.impactservice.controller;

import com.puraviaporelmundo.impactservice.model.Ad;
import com.puraviaporelmundo.impactservice.service.AdService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RestController
@RequestMapping("/ads")
public class AdsController {

    @Autowired
    private AdService adService;

    @GetMapping
    public Flux<Ad> findAll() {
        return adService.findAll();
    }
}
