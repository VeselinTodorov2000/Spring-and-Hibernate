package vesko.example.coach;

import vesko.example.coach.fortunes.FortuneService;

public class FootballCoach implements Coach{

    private FortuneService fortuneService;

    public FootballCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Practice penalties";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getDailyFortune() ;
    }

    @Override
    public String getEmail() {
        return null;
    }

    @Override
    public String getTeam() {
        return null;
    }
}
