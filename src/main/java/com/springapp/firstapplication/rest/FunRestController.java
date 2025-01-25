package com.springapp.firstapplication.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.service.annotation.GetExchange;

@RestController
public class FunRestController {
    @GetExchange("/")
    public String sayHello() {
        return "Hello world!";
    }

    // expose a new endpoint for workout

    @GetMapping("/workout")
    public String getDailyWorkout() {
        return "Hello! I am text from workout!";
    }
}
