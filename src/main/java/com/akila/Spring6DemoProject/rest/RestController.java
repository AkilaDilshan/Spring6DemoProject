package com.akila.Spring6DemoProject.rest;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.web.bind.annotation.RestController
public class RestController {

    // Inject properties from application.properties file
    @Value("${coach.name}")
    private String coachName;

    @Value("${team.name}")
    private String teamName;

    // expose "/" that return "Hello World"

    @GetMapping("/")
    public String sayHello(){
        return "Hello World!";
    }

    // expose a new endpoint for "workout"
    @GetMapping("/workout")
    public String getDailyWorkout(){
        return "Exercise everyday";
    }

    @GetMapping("/teaminfo")
    public String getTamInfo(){
        return "Coach: " + coachName + ", Team name: "+ teamName;
    }
}
