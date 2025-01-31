package com.springapp.firstapplication.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.service.annotation.GetExchange;

@RestController
public class FunRestController {

//    Injecting properties from 'application.properties' file
    @Value("${coach.name}")
    private String coachName;

    @Value("${team.name}")
    private String teamName;

    @GetExchange("/")
    public String sayHello() {
        return "Hello world!";
    }

    // expose a new endpoint for teaminfo
    @GetMapping("/teaminfo")
    public String getTeamInfo() {
        return "Coach: "+coachName+" Team: "+teamName;
    }


    // expose a new endpoint for workout

    @GetMapping("/workout")
    public String getDailyWorkout() {
        return "Hello! I am text from workout!";
    }
}
