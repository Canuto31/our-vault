package com.entertainment.ourvault.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/others")
public class OthersController {

    @GetMapping("/say-hi")
    private String sayHello() {
        return "Hello world";
    }
}
