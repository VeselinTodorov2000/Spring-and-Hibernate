package vesko.example.coach;

import vesko.example.coach.fortunes.BadFortuneServiceImpl;
import vesko.example.coach.fortunes.FortuneService;

public class BaseballCoach implements Coach {

    private FortuneService fortuneService;
    private String email;
    private String team;

    public BaseballCoach(FortuneService fortuneService) {
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
        return "Do 30 minutes batting practice";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getDailyFortune();
    }
}
