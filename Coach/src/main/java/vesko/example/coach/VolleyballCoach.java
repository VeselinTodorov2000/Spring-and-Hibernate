package vesko.example.coach;

import vesko.example.coach.fortunes.BadFortuneServiceImpl;
import vesko.example.coach.fortunes.FortuneService;

public class VolleyballCoach implements Coach {

    private FortuneService fortuneService;
    private String email;
    private String team;
    public void setFortuneService(BadFortuneServiceImpl fortuneService) {
        this.fortuneService = fortuneService;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    @Override
    public String getDailyWorkout() {
        return "1 Hour volleys practice";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getDailyFortune();
    }

    public void init() {
        System.out.println("Inside init");
    }

    public void destroy() {
        System.out.println("Inside destroy");
    }
}
