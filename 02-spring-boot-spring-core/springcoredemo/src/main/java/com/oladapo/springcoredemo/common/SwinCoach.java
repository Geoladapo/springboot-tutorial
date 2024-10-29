package com.oladapo.springcoredemo.common;


import org.springframework.stereotype.Component;


public class SwinCoach implements Coach{

    public SwinCoach() {
        System.out.println("In Constructor: " + getClass().getSimpleName());
    }
    @Override
    public String getDailyWorkout() {
        return "Swim 1000 meters as a warm up";
    }
}
