package com.puraviaporelmundo.impactservice.controller;

import com.puraviaporelmundo.impactservice.model.Bitly;
import com.puraviaporelmundo.impactservice.service.BitlyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/bitly")
public class BitlyController {

    @Autowired
    private BitlyService bitlyService;

    @PostMapping("/{url}")
    public Mono<Bitly> shortenUrl(@PathVariable String url) {
        return bitlyService.shortenUrl(url);
    }
}
