package com.example.coachappiocanddiannotation;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CoachAppIoCAndDiAnnotationApplication {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        Coach myCoach = context.getBean("myTennisCoach", Coach.class);
        System.out.println(myCoach.getDailyWorkout());
        System.out.println(myCoach.getFortune());

        myCoach = context.getBean("volleyballCoach", Coach.class);
        System.out.println(myCoach.getDailyWorkout());
        System.out.println(myCoach.getFortune());

        context.close();
    }

}
