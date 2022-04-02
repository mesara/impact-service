package com.puraviaporelmundo.impactservice.controller;

import com.puraviaporelmundo.impactservice.model.Account;
import com.puraviaporelmundo.impactservice.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/account")
public class AccountController {

    @Autowired
    private AccountService accountService;

    @GetMapping
    public Mono<Account> getAccount() {
        return accountService.getAccount();
    }

}
