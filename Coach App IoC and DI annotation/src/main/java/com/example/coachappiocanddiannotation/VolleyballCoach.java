package com.example.coachappiocanddiannotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class VolleyballCoach implements Coach {

    private FortuneService fortuneService;

    @Autowired
    public VolleyballCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Practice volleys for 45 minutes";
    }

    @Override
    public String getFortune() {
        return fortuneService.getFortune();
    }
}
