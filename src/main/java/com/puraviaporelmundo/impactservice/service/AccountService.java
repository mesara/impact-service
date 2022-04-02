package com.puraviaporelmundo.impactservice.service;

import com.puraviaporelmundo.impactservice.model.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@Service
public class AccountService {

    @Autowired
    private WebClient webClientImpact;

    public Mono<Account> getAccount() {
        return this.webClientImpact
                .get()
                .uri("/CompanyInformation.json")
                .retrieve()
                .bodyToMono(Account.class);
    }
}
