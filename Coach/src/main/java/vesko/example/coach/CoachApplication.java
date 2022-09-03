package vesko.example.coach;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CoachApplication {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        Coach coach = context.getBean("volleyCoach", Coach.class);

        System.out.println(coach.getDailyWorkout());
        System.out.println(coach.getDailyFortune());
        System.out.println(coach.getEmail());
        System.out.println(coach.getTeam());

        context.close();
    }

}
