package luv2code.firstapplication.common;

import org.springframework.stereotype.Component;

@Component
public class TrackCoach implements Coach{
    @Override
    public String getDailyWorkout() {
        return "I am dailyWorkout form TrackCoach!";
    }
}
