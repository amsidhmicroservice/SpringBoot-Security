package com.amsidh.mvc.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class WelcomeController {

    @GetMapping
    public ResponseEntity<String> welcomeMessage() {
        log.info("Inside method welcomeMessage of WelcomeController class");
        return ResponseEntity.ok().body("Welcome you have successfully allowed to enter into our app/website");
    }
}
