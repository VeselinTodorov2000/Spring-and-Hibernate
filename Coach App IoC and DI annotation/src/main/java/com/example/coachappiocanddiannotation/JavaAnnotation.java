package com.example.coachappiocanddiannotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaAnnotation {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);

        Coach myCoach = context.getBean("swimCoach", Coach.class);

        System.out.println(myCoach.getDailyWorkout());
        System.out.println(myCoach.getFortune());

        SwimCoach swimCoach = (SwimCoach) myCoach;
        System.out.println(swimCoach.getEmail());
        System.out.println(swimCoach.getTeam());

        context.close();
    }
}
