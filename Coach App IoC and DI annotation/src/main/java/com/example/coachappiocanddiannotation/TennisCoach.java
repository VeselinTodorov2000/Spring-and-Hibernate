package com.example.coachappiocanddiannotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component("myTennisCoach")
@Scope("singleton")
public class TennisCoach implements Coach {

    @Autowired
    @Qualifier("happyFortuneService")
    private FortuneService fortuneService;

    @PostConstruct
    public void afterConstruction() {
        System.out.println("Post Construct");
    }

    @PreDestroy
    public void beforeDeleting() {
        System.out.println("Pre Destroy");
    }
    @Override
    public String getDailyWorkout() {
        return "Practice your backhand for 20 minutes";
    }

    @Override
    public String getFortune() {
        return null;
    }
}
