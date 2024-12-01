package com.example.helloworld.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/home")
public class MainController {

    @GetMapping(value = "/")
    public ResponseEntity<String> getResponse() {
        return ResponseEntity.ok("Hello world!");
    }
}