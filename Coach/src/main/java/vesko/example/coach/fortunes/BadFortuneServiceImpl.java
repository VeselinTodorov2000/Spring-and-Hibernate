package vesko.example.coach.fortunes;

public class BadFortuneServiceImpl implements FortuneService{
    @Override
    public String getDailyFortune() {
        return "You are not doing well";
    }
}
