package com.oladapo.springcoredemo.config;

import com.oladapo.springcoredemo.common.Coach;
import com.oladapo.springcoredemo.common.SwinCoach;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SportConfig {

    @Bean("aquatic")
    public Coach swimCoach() {
        return new SwinCoach();
    }
}
