package com.oladapo.springcoredemo.rest;

import com.oladapo.springcoredemo.common.Coach;
import com.oladapo.springcoredemo.common.CricketCoach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    private final CricketCoach cricketCoach;
    // define a private field for the dependency
    private Coach myCoach;


    // define a constructor for dependency injection
    @Autowired
    public DemoController(Coach theCoach, CricketCoach cricketCoach) {
        myCoach = theCoach;
        this.cricketCoach = cricketCoach;
    }

    @GetMapping("/dailyWorkout")
    public String getDailyWorkout() {
        return myCoach.getDailyWorkout();
    }

}
