package com.example.coachappiocanddiannotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.example.coachappiocanddiannotation")
@PropertySource("classpath:sport.properties")
public class SportConfig {

    @Bean
    public FortuneService happyFortune() {
        return new HappyFortuneService();
    }

    @Bean
    public Coach swimCoach() {
        SwimCoach swimCoach = new SwimCoach(happyFortune());
        return swimCoach;
    }
}
